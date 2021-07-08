package matrices;

public class Main {
    public static void main(String[] args) {
        Calculator calcu = new Calculator();

        // Matrix matrizA = new Matrix();
        // Integer[][] elementos = { { 1, 2 }, { 3, 4 } };
        // matrizA.elements = elementos;
        // System.out.println(matrizA);

        // Matrix matrizB = new Matrix();
        // Integer[][] elementos2 = { { 5, 6 }, { 7, 8 } };
        // matrizB.elements = elementos2;
        // System.out.println(matrizB.toString());

        // Matrix matrizResultado = calcu.Suma(matrizA, matrizB);
        // System.out.println(matrizResultado);

        // Matrix matrizA = new Matrix();
        // Integer[][] elementos = { { 6, 4, 8 }, { 9, 5, 3 } };
        // matrizA.elements = elementos;
        // System.out.println(matrizA);

        // Matrix matrizB = new Matrix();
        // Integer[][] elementos2 = { { 3, 9, 1 }, { 2, 6, 4 } };
        // matrizB.elements = elementos2;
        // System.out.println(matrizB.toString());

        // Matrix matrizResultado = calcu.Resta(matrizA, matrizB);
        // System.out.println(matrizResultado);

        Matrix matrizA = new Matrix();
        Integer[][] elementos = { { 1, 2 }, { 3, 4 }, { 1, 1 } };
        matrizA.elements = elementos;
        System.out.println(matrizA);

        Matrix matrizB = new Matrix();
        Integer[][] elementos2 = { { 5, 6, 1 }, { 7, 8, 1 } };
        matrizB.elements = elementos2;
        System.out.println(matrizB.toString());

        // Matrix matrizResultado = calcu.Multiplicacion2x2(matrizA, matrizB);
        // System.out.println(matrizResultado);

        Matrix matrizResultado2 = calcu.Multiplicacion(matrizA, matrizB);
        System.out.println(matrizResultado2);

        Matrix matrizResultado = calcu.Multiplicacion(matrizB, matrizA);
        System.out.println(matrizResultado);
        
        Matrix matrizIdentidad = new Matrix();
        matrizIdentidad.setMatrixIdentidad(4, 4);
        System.out.println(matrizIdentidad);
    }

}
