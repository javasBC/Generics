public class MyList {

    private Object[] items = new Object[10];
    private int conter=0;

    public void add(Object item){
        items[conter++]=item;
    }

    public Object get(int index){
        return items[index];
    }

}
