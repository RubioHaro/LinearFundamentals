package vectors;
public class Main {
    public static void main(String[] args) {
        // Vector v1 = new Vector(-2, 3);
        // Vector v2 = new Vector(3, 1);
        // // (1,4)
        VectorR3 vectorRes;
        Calculadora calcu = new Calculadora();

        // VectorR3 v1 = new VectorR3(-2, 3, 2);
        // VectorR3 v2 = new VectorR3(3, 1, 2);
        // vectorRes = calcu.Suma(v1, v2);
        // System.out.println(vectorRes);
        // vectorRes = calcu.Resta(v1, v2);
        // System.out.println(vectorRes);
        // //sum 1, 4,4 
        // //res -5, 2, 0


        // (3,0,2)×(−1,4,2)
        VectorR3 v1 = new VectorR3(3, 0, 2);
        VectorR3 v2 = new VectorR3(-1, 4, 2);
        vectorRes = calcu.ProductoVectorial(v1, v2);
        System.out.println(vectorRes);


    }
}
