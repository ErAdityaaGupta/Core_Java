// In this program we use methods of byte array output and input streams.


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

//public class ByteDemo {
//    public static void main(String[] args)throws Exception {
//        byte b[] = {'a','b','c','d','e','f','g','h','i','j'};
//
//        ByteArrayInputStream bis = new ByteArrayInputStream(b);
//
////        int x =0;
////
////        while((x=bis.read())!= -1){
////            System.out.print((char) x );
////        }
//
//        String str = new String(bis.readAllBytes());
//        System.out.println(str);
//        System.out.println(bis.markSupported());
//        bis.close();
//
//    }
//}

public class ByteDemo{
    public static void main(String[] args)throws Exception {
        byte b[] = {'a','b','c','d','e','f','g','h','i','j'};

        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        bos.write('e');

        byte c[] = bos.toByteArray();

        for (byte x:c){
            System.out.print((char) x + " ");
        }


        bos.close();
    }
}