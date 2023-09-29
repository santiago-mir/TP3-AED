package aed;

public class Fecha {
    private int date;
    private int month;

    public Fecha(int dia, int mes) {
        date = dia;
        month = mes;
    }

    public Fecha(Fecha fecha) {
        date = fecha.date;
        month = fecha.month;
    }

    public Integer dia() {
        return date;
    }

    public Integer mes() {
        return month;
    }

    @Override
    public String toString() {
        StringBuffer sbuffer = new StringBuffer();
        sbuffer.append(date + "/" + month);
        return sbuffer.toString();
    }

    @Override
    public boolean equals(Object otra) {
        boolean oen = (otra == null);
        boolean cd = (otra.getClass() != this.getClass());
        if (oen || cd) {
            return false;
        }
        Fecha otraFecha = (Fecha) otra;
        return (date == otraFecha.date && month == otraFecha.month);
    }

    public void incrementarDia() {
        int fechaLimite = diasEnMes(month);
        if (month == 12 && fechaLimite == date) {
            date = 1;
            month = 1;
        } else {
            if (date == fechaLimite) {
                date = 1;
                month++;
            } else {
                date++;
            }
        }
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
