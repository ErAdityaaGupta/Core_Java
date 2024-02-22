// In this program we implement some methods of the priority queue class.

import java.util.PriorityQueue;

public class PriorityDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();

        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);

        System.out.println(p.contains(20));
        System.out.println(p.contains(30));

        System.out.println(p.peek());

        p.forEach((X)-> System.out.print(X+" "));
        System.out.println();

        p.poll();

        System.out.print("After Deletion:- ");
        p.forEach((x)-> System.out.print(x+" "));
    }
}
