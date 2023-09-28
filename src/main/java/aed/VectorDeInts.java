package aed;

class VectorDeInts implements SecuenciaDeInts {
    private static final int CAPACIDAD_INICIAL = 1;
    private int[] array;
    private int longitudVector;

    public VectorDeInts() {
        array = new int[CAPACIDAD_INICIAL];
        longitudVector = 0;
    }

    public VectorDeInts(VectorDeInts vector) {
        array = new int[vector.longitudVector - 1];
        longitudVector = vector.longitudVector;
    }

    public int longitud() {
        return longitudVector;
    }

    public void agregarAtras(int i) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public int obtener(int i) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public void quitarAtras() {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public void modificarPosicion(int indice, int valor) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public VectorDeInts copiar() {
        throw new UnsupportedOperationException("No implementada aun");
    }

}
