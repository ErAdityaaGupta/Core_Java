// In this program we try to implement some methods of the TreeMap and the HashMap.


import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));

        tm.put(4,"E");
        tm.put(5,"F");

        System.out.println(tm);
        System.out.println(tm.get(2));

        Map.Entry<Integer,String> e = tm.firstEntry();

        System.out.println(e);

    }
}
