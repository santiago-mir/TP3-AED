package aed;

public class Recordatorio {
    private String msj;
    private Fecha date;
    private Horario hor;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        msj = mensaje;
        date = new Fecha(fecha);
        hor = horario;
    }

    public Horario horario() {
        return hor;
    }

    public Fecha fecha() {
        Fecha nuevaFecha = new Fecha(date);
        return nuevaFecha;
    }

    public String mensaje() {
        return msj;
    }

    @Override
    public String toString() {
        StringBuffer sbuffer = new StringBuffer();
        sbuffer.append(msj + " " + "@" + " " + date + " " + hor);
        return sbuffer.toString();
    }

}
