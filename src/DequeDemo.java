// In this program we implement few methods of the deque class.


import java.util.ArrayDeque;

public class DequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);   
        dq.offerLast(40);

        dq.forEach((x)-> System.out.print(x+" "));

        dq.offerFirst(50);
        dq.offerFirst(60);

        System.out.println();

        dq.forEach((x)-> System.out.print(x+" "));
    }
}
