// In this program we implement some functions of the buffered streams.


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class BufferedDemo {
    public static void main(String[] args) throws Exception {
//        FileInputStream fis = new FileInputStream("C:/MyJava/test.txt");
//        BufferedInputStream bis = new BufferedInputStream(fis);
        FileReader fis = new FileReader("C:/MyJava/test.txt");
        BufferedReader bis = new BufferedReader(fis);

//        int x;
//        while((x = bis.read())!= -1){
//            System.out.print((char) x);
//        }
//        System.out.println("File "+fis.markSupported());
//        System.out.println("Buffer "+bis.markSupported());

        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.mark(10);
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.reset();
        System.out.print(" ");
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

        System.out.println( bis.readLine());
    }
}
