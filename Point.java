public class Point implements Comparable<Point> {
    private int x ;
    private int y ;

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Point other) {
        // this < other -> -5
        // this == other -> 0
        // this > other -> +1
        return this.x* this.y- other.x* other.y;
        //if (this.x*this.y < other.x*other.y)
        //    return -8;
        //else if (this.x*this.y == other.x*other.y)
        //    return 0;
        //else
        //    return +1;
//

    }

}
