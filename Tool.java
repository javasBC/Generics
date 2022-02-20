import java.util.PrimitiveIterator;

public class Tool{

    public static <E extends Comparable> E max (E a, E b){
        if (a.compareTo(b)<0) return b;
        return a;
    }

    public static <K,V> void  print(K a,V b){
        System.out.println(a+" ==>> "+b);
    }

    //Class cap^1 extends Point  {}
    public static void print2 (GenericList<? super Point> list) {
        Point p1 =list.get(0);
        list.add(new Point(4,4));

    }

}
