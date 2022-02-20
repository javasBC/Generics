import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class Main {

    public static void main(String[] args) {
       //MyList list1= new MyList();
       //list1.add(8);//Integer => Double -> double
       //list1.add(19.8);

       //int x=5;
       //String s= "hodi";
       //System.out.println(s=="hodi");
       //int x2=5;
       //System.out.println(x==x2);
       ////String s= new String("hodi");
       //String s3= "hodi";
       ////int -> Integer;
       ////float -> Float;
       ////char -> Character;
       ////boolean -> Boolean
       //double d= (double)list1.get(0);
       //int d2= (int)list1.get(0);
       ////String d2=  list1.get(0);
       //System.out.println(list1.get(0));
       //MyList list2= new MyList();
       //list2.add("hodi");
       //list2.add(8.9);
       //list2.add(false);
       //int x2= (int)list2.get(0);
        //GenericList<Integer> genericList1=
        //        new GenericList<>();
        //
        //genericList1.add(66);
        //double x = genericList1.get(0);
        //
        //GenericList<String> genericList2= new GenericList<>();
        //GenericList<Point> genericList3= new GenericList<>();
        //Point p1= new Point(6,1);
        //Point p2= new Point(5,0);
//
        //if (p1.compareTo(p2)<0)
        //    System.out.println("p2 greater than p1");
//
        //else if (p1.compareTo(p2)==0)
        //    System.out.println("p2 and p1 equals");
        //else
        //    System.out.println("p1 greater than p2");
//
        //int -> Integer // Boxing
        //Integer -> int // UnBoxing

        //Tool.print(new Point(4,8),"haha generics");

        GenericList<Point> points= new GenericList<>();

        GenericList<Point3D> point3Ds= new GenericList<>();

        points.add(new Point(4,8));
        points.add(new Point(8,8));
        point3Ds.add(new Point3D(5,8));
        point3Ds.add(new Point3D(8,8));
        Point p1= points.get(0);
        Point3D p2= point3Ds.get(0);
        System.out.println(p1);
        System.out.println(p2);

        Tool.print2(point3Ds);
        Tool.print2(point3Ds);



    }

}
