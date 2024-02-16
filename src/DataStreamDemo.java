// In this program we try to implement a few methods of the data input and output streams.


import java.io.*;

class Student2{
    int rollNo;
    String name;
    String dept;
    float avg;
}
//public class DataStreamDemo {
//    public static void main(String[] args) throws Exception{
//        FileOutputStream fos = new FileOutputStream("C:/MyJava/Student2.txt");
//        DataOutputStream dos = new DataOutputStream(fos);
//
//        Student2 s = new Student2();
//
//        s.rollNo = 10;
//        s.name = "Aditya";
//        s.dept = "CSE";
//        s.avg = 80.5f;
//
//        dos.writeInt(s.rollNo);
//        dos.writeUTF(s.name);
//        dos.writeUTF(s.dept);
//        dos.writeFloat(s.avg);
//
//        dos.close();
//        fos.close();
//    }
//}


public class DataStreamDemo{
    public static void main(String[] args)throws Exception {
        FileInputStream fis = new FileInputStream("C:/MyJava/Student2.txt");
        DataInputStream dis = new DataInputStream(fis);

        Student2 s = new Student2();
        s.rollNo = dis.readInt();
        s.name = dis.readUTF();
        s.dept = dis.readUTF();
        s.avg = dis.readFloat();

        System.out.println(s.rollNo+ " " + s.name + " "+ s.dept + " "+ s.avg);

        dis.close();
        fis.close();
    }
}