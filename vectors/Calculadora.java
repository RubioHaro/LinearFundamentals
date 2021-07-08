public class Calculadora {
    


    // Suma
    public Vector Suma(Vector vect1, Vector vect2) {
        Vector resultado = new Vector();
        resultado.setX(vect1.getX() + vect2.getX());
        resultado.setY(vect1.getY() + vect2.getY());
        return resultado;
    }

    public VectorR3 Suma(VectorR3 vect1, VectorR3 vect2) {
        VectorR3 resultado = new VectorR3();
        resultado.setX(vect1.getX() + vect2.getX());
        resultado.setY(vect1.getY() + vect2.getY());
        resultado.setZ(vect1.getZ() + vect2.getZ());
        return resultado;
    }

    // Restar
    public Vector Resta(Vector vect1, Vector vect2) {
        Vector resultado = new Vector();
        resultado.setX(vect1.getX() - vect2.getX());
        resultado.setY(vect1.getY() - vect2.getY());
        return resultado;
    }

    public VectorR3 Resta(VectorR3 vect1, VectorR3 vect2) {
        VectorR3 resultado = new VectorR3();
        resultado.setX(vect1.getX() - vect2.getX());
        resultado.setY(vect1.getY() - vect2.getY());
        resultado.setZ(vect1.getZ() - vect2.getZ());
        return resultado;
    }
    // Multiplicar Escalar
    // Multiplicar Vectorial
    public VectorR3 ProductoVectorial(VectorR3 vect1, VectorR3 vect2) {
        VectorR3 resultado = new VectorR3();
        resultado.setX(vect1.getY()*vect2.getZ() - vect1.getZ() * vect2.getY());
        resultado.setY(vect1.getZ()*vect2.getX() - vect1.getX() * vect2.getZ());
        resultado.setZ(vect1.getX()*vect2.getY() - vect1.getY() * vect2.getX());


        return resultado;
    }

}
