public class Point3D extends Point{
    private int z=0;
    public Point3D(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return super.toString()+"Point3D{" +
                "z=" + z +
                '}';
    }
}
