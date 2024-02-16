// In this program we try to implement some methods of the random access files.

import java.io.RandomAccessFile;

public class RandomAccessDemo {
    public static void main(String[] args)throws Exception {
        RandomAccessFile raf = new RandomAccessFile("C:/MyJava/test.txt","rw");

        System.out.println((char) raf.read());
        System.out.println((char) raf.read());
        System.out.println((char) raf.read());
        raf.write('k');
        System.out.println((char) raf.read());
        raf.skipBytes(3);
        System.out.println((char) raf.read());
        raf.seek(0);
        System.out.println((char) raf.read());   
        System.out.println(raf.getFilePointer());
        raf.seek(raf.getFilePointer()+4);
        System.out.println((char) raf.read());

    }
}
