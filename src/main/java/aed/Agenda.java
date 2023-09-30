package aed;

import java.util.Vector;

public class Agenda {
    private Fecha actualDate;
    private Vector<Recordatorio> record;

    public Agenda(Fecha fechaActual) {
        actualDate = fechaActual;
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        if (record == null) {
            Vector<Recordatorio> newRecord = new Vector<Recordatorio>();
            newRecord.add(recordatorio);
            record = newRecord;
        } else {
            record.add(recordatorio);
        }
    }

    public String generarRecordatoriosString() {
        String res = "";
        for (Recordatorio recordatorio : record) {
            if (recordatorio.fecha().equals(actualDate)) {
                res = res + recordatorio.toString() + "\n";
            }
        }
        return res;
    }

    @Override
    public String toString() {
        StringBuffer sbuffer = new StringBuffer();
        sbuffer.append(actualDate + "\n" + "=====" + "\n" + generarRecordatoriosString());
        return sbuffer.toString();

    }

    public void incrementarDia() {
        Fecha updatedFecha = new Fecha(actualDate);
        updatedFecha.incrementarDia();
        actualDate = updatedFecha;

    }

    public Fecha fechaActual() {
        Fecha nuevaFecha = new Fecha(actualDate);
        return nuevaFecha;
    }

}
