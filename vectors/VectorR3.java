package vectors;
public class VectorR3 extends Vector {
    private int z;

    public VectorR3() {
        super();
        this.z = 0;
    }

    @Override
    public String toString() {
        return super.toString() +" k:" + z;
    }

    public VectorR3(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
}
