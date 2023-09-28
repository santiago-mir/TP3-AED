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
        array = new int[vector.longitudVector];
        longitudVector = vector.longitudVector;

        int j = 0;
        while (j < longitudVector) {
            array[j] = vector.array[j];
            j++;
        }
    }

    public int longitud() {
        return longitudVector;
    }

    public void agregarAtras(int i) {
        if (longitudVector < CAPACIDAD_INICIAL) {
            array[longitudVector] = i;
        } else {
            int[] nuevoArr = new int[longitudVector + 1];
            int j = 0;
            while (j < longitudVector) {
                nuevoArr[j] = array[j];
                j++;
            }
            nuevoArr[longitudVector] = i;
            array = nuevoArr;
        }
        longitudVector++;
    }

    public int obtener(int i) {
        return array[i];
    }

    public void quitarAtras() {
        if (longitudVector == CAPACIDAD_INICIAL) {
            new VectorDeInts();
        } else {
            int[] nuevoArr = new int[longitudVector - 1];
            int j = 0;
            while (j < longitudVector - 1) {
                nuevoArr[j] = array[j];
                j++;
            }
            array = nuevoArr;

        }
        longitudVector--;
    }

    public void modificarPosicion(int indice, int valor) {
        array[indice] = valor; // tienen que pasarme un indice valido
    }

    public VectorDeInts copiar() {
        VectorDeInts nuevoArr = new VectorDeInts();
        int j = 0;
        while (j < longitudVector) {
            nuevoArr.agregarAtras(array[j]);
            j++;
        }
        return nuevoArr;
    }

}
