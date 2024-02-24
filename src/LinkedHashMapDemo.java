//In this program we try to implement a few methods of the linked hash map.

import java.util.LinkedHashMap;
import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lh = new LinkedHashMap<>(5,0.75f,true){
            protected boolean removeEldestEntry(Map.Entry e){
                return size()>5;
            }
        };

        lh.put(1,"A");
        lh.put(2,"B");
        lh.put(3,"C");
        lh.put(4,"D");
        lh.put(5,"E");
//        lh.put(6,"F");
//        lh.put(9,"I");
//        lh.put(8,"H");
//        lh.put(7,"G");

        String s = lh.get(5);
        s= lh.get(2);
        s = lh.get(1);
        lh.put(6,"F");

        System.out.println(lh);


    }
}
