// In this program we try to implement a few methods of the tree set and comparable Interface.

// When we have to store objects of our own class in a tree set then for that comparable Interface is used.

import java.util.List;
import java.util.TreeSet;

class Point implements Comparable{
    int x;
    int y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "x="+x+" y="+y;
    }

    public int compareTo(Object o){

        Point p = (Point) o;

        if(this.x<p.x){
            return -1;
        }
        else if(this.x>p.x){
            return 1;
        }
        else {
            if(this.y<p.y){
                return -1;
            }
            else if(this.y>p.y){
                return 1;
            }
            else {
                return 0;
            }
        }
    }
}

public class TreeDemo {
    public static void main(String[] args) {
        TreeSet<Point> ts = new TreeSet<>();

        ts.add(new Point(1,1));
        ts.add(new Point(5,5));
        ts.add(new Point(5,2));

        System.out.println(ts);
    }
}
//    public static void main(String[] args) {
//        TreeSet<Integer> ts  = new TreeSet<>(List.of(10,20,30,50,60,10,25,29) );
//
//        ts.add(45);
//
//
//        System.out.println(ts.ceiling(28));
//
//        System.out.println(ts);
//
//    }
