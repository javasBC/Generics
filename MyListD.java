public class MyListD {
    private double[] items = new double[10];
    private int conter=0;

    public void add(double item){
        items[conter++]=item;
    }

    public double get(int index){
        return items[index];
    }
}
