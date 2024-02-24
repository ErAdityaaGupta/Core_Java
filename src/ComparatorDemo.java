// IIn this program we implement some methods of array and comparator classes.

import java.util.Arrays;

public class ComparatorDemo {
    public static void main(String[] args) {
        int a[] = {2,4,5,8,1,3,5,7};
        int b[] = {2,4,6,8,1,3,2,7};

        int c[] = Arrays.copyOf(a,a.length);



        Arrays.fill(c,10);

        System.out.println(Arrays.compare(a,b));

        for(int i= 0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }

        System.out.println(Arrays.equals(a,b));

        System.out.println(Arrays.mismatch(a,b));

         Arrays.sort(a);

         for (int i=0;i<a.length;i++){
             System.out.print(a[i]+" ");
         }

        System.out.println();
        System.out.println(Arrays.binarySearch(a,8));

    }
}
