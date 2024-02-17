// In this program we would try to implement file output and input streams.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//public class FileExample {
//    public static void main(String[] args) {
//        try{
//            FileOutputStream fos = new FileOutputStream("C:/MyJava/Test2.txt");
//            String str = "Learn Java programming";
//
////            fos.write(str.getBytes());
//
//            byte b[] = str.getBytes();
////            for(byte x:b){
////                fos.write(x);
////            }
//
//            fos.write(b,6,str.length()-6);
//
//            fos.close();
//        }
//        catch(FileNotFoundException e){
//            System.out.println(e);
//        }
//        catch (IOException e){
//            System.out.println("The Exception is "+e);
//        }
//
//    }
//}

public class FileExample{
    public static void main(String[] args) throws Exception {
        try(FileInputStream fis = new FileInputStream("C:/MyJava/Test.txt")){
//            byte b[] = new byte[fis.available()];   
//
//            fis.read(b);
//            String str = new String(b);
//            System.out.println(str);

            int x;

            do{
                x = fis.read();
                if(x!= -1){
                    System.out.print((char) x);
                }
            }while (x!= -1);

        }

    }
}
