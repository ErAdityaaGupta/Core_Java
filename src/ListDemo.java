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
        al1.add(5,70);

        System.out.println(al1.contains(6));
        System.out.println(al1.get(5));
        System.out.println(al1.indexOf(70));
        System.out.println(al1.lastIndexOf(70));

        al1.set(6,100);
        System.out.println(al1);
        for (int i= 0;i<al1.size();i++){
            System.out.print(al1.get(i)+" ");
        }

        for (Integer integer : al1) {
            System.out.print(integer + " ");
        }
        System.out.println(" ");
        for(Integer x:al1){
            System.out.print(x+" ");
        }

    }
}
