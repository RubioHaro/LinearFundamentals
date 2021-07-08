package matrices;

public class Calculator {

    public Calculator() {

    }

    public Matrix Suma(Matrix matrizA, Matrix matrizB) {
        Matrix suma = new Matrix();
        suma.elements = new Integer[matrizA.getRows()][matrizA.getCols()];
        for (int i = 0; i < matrizA.getRows(); i++) {
            for (int j = 0; j < matrizA.getCols(); j++) {
                suma.elements[i][j] = matrizA.elements[i][j] + matrizB.elements[i][j];
            }
        }
        return suma;
    }

    public Matrix Resta(Matrix matrizA, Matrix matrizB) {
        Matrix suma = new Matrix();
        suma.elements = new Integer[matrizA.getRows()][matrizA.getCols()];
        for (int i = 0; i < matrizA.getRows(); i++) {
            for (int j = 0; j < matrizA.getCols(); j++) {
                suma.elements[i][j] = matrizA.elements[i][j] - matrizB.elements[i][j];
            }
        }
        return suma;
    }

    public Matrix Multiplicacion2x2(Matrix matrizA, Matrix matrizB) {
        Matrix resultado = new Matrix();
         resultado.elements = new Integer[matrizA.getRows()][matrizA.getCols()];
        Integer a00 = matrizA.elements[0][0] * matrizB.elements[0][0] + matrizA.elements[0][1] * matrizB.elements[1][0];
        Integer a01 = matrizA.elements[0][0] * matrizB.elements[0][1] + matrizA.elements[0][1] * matrizB.elements[1][1];
        Integer a10 = matrizA.elements[1][0] * matrizB.elements[0][0] + matrizA.elements[1][1] * matrizB.elements[1][0];
        Integer a11 = matrizA.elements[1][0] * matrizB.elements[0][1] + matrizA.elements[1][1] * matrizB.elements[1][1];
        Integer[][] elementos2 = { { a00, a01 }, { a10, a11 } };
        resultado.elements = elementos2;

        return resultado;
    }

    public Matrix Multiplicacion(Matrix matrizA, Matrix matrizB) {
        Matrix resultado = new Matrix();
        if(matrizA.getOrderArray()[1] == matrizB.getOrderArray()[0]){
            Integer[][] res = new Integer[matrizA.getOrderArray()[0]][matrizB.getOrderArray()[1]];
            for (int i = 0; i < res.length ; i++) {
                for (int j = 0; j < res[0].length ; j++) {
                    res[i][j] = operacionMatriz(matrizA, matrizB, i, j);
                }
            }
            resultado.elements = res;
        } else {
            System.out.println("no se puede multiplicar" + matrizA.getOrder() + " " + matrizB.getOrder());
        }
        return resultado;
    }

    private int operacionMatriz(Matrix matrizA, Matrix matrizB, int row, int col){
        int resultado = 0;
        int filas = matrizA.elements[0].length; // A -> cols, B -> filas
        for (int i = 0; i < filas; i++) {
            resultado += matrizA.elements[row][i] * matrizB.elements[i][col];
        }
        return resultado;
    }
}
