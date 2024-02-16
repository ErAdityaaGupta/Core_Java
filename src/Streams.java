// In this program we try to understand how to keep track of the no of different types of data that is stored in a file.


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Streams {
//    public static void main(String[] args) throws Exception{
//        float List[] = {1.25f,3.25f,20.6f,250.36f,20.36f};
//        FileOutputStream fos = new FileOutputStream("C:/MyJava/Data.txt");
//        DataOutputStream dos = new DataOutputStream(fos);
//
//        dos.writeInt(List.length);
//        for(float f:List){
//            dos.writeFloat(f);
//        }
//
//        dos.close();
//        fos.close();
//    }

    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:/MyJava/Data.txt");
        DataInputStream dis = new DataInputStream(fis);

        int length = dis.readInt();
        float data;
        for (int i= 0;i<length;i++){
            data = dis.readFloat();
            System.out.print(data+"  ");
        }

        dis.close();
        fis.close();
    }
}
