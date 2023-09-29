package aed;

public class Horario {
    private int min;
    private int hor;

    public Horario(int hora, int minutos) {
        hor = hora;
        min = minutos;
    }

    public int hora() {
        return hor;
    }

    public int minutos() {
        return min;
    }

    @Override
    public String toString() {
        StringBuffer sbuffer = new StringBuffer();
        sbuffer.append(hor + ":" + min);
        return sbuffer.toString();
    }

    @Override
    public boolean equals(Object otro) {
        boolean oen = (otro == null);
        boolean cd = (otro.getClass() != this.getClass());
        if (oen || cd) {
            return false;
        }
        Horario otroHorario = (Horario) otro;
        return (min == otroHorario.min && hor == otroHorario.hor);
    }

}
