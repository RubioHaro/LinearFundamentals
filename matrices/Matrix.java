package matrices;

public class Matrix {
    public Integer elements[][];

    public Boolean isEmpty() {
        if (elements == null && getRows() > 0) {
            return true;
        }
        return false;

    }

    public String getOrder(){
        return getRows() + "x" + getCols();
    }

    public int[] getOrderArray(){
        int[] order = { getRows(), getCols() };
        return order;
    }

    @Override
    public String toString() {
        String mensaje = "";
        if (isEmpty()) {
            mensaje = "La matriz esta vacia";
        } else {
            for (int i = 0; i < this.getRows(); i++) {
                for (int j = 0; j < this.getCols(); j++) {
                    mensaje += this.elements[i][j] + " ";
                    // System.out.println(elements[i][j].toString());
                }
                mensaje += "\n";
            }
        }

        return mensaje;
    }

    public int getRows() {
        return elements.length;
    }

    public int getCols() {
        return elements[0].length;
    }

    public Matrix() {
        elements = new Integer[0][0];
    }

    public void setMatrixIdentidad(int n, int m){
        elements = new Integer[n][m];
        int posicion = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(posicion == j){
                    elements[i][j] = 1;
                } else {
                    elements[i][j] = 0;
                }
            }
            posicion++; 
        }
    }

}
