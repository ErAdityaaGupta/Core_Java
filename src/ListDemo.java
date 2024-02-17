// In this program we implement few methods of the array list class.


import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80,90,100));

        al1.add(10);
        al1.add(0,5);
        al1.addAll(1,al2);



        System.out.println(al1);


    }
}
