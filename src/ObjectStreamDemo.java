// In this program we try to implement some methods of the object output and inout stream.


import java.io.*;

class Student3 implements Serializable{

    private int rollNo;
    private String name;
    private float avg;
    private String dept;
    public static int data = 10;
    public transient int t;

    public Student3(){
    }
    public Student3(int r,String n,float a,String d){
        rollNo = r;
        name = n;
        avg = a;
        dept = d;
        data = 500;
        t = 500;
    }

    public String toString(){
        return "\nStudent Details\n"+
                "\nRoll "+rollNo+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+data+
                "\nTransient "+t+"\n";
    }
}

//public class ObjectStreamDemo {
//    public static void main(String[] args)throws Exception {
//        FileOutputStream fos = new FileOutputStream("C:/MyJava/Student3.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//        Student3 s = new Student3(10,"Aditya",95.6f,"CSE");
//
//        oos.writeObject(s);
//
//        fos.close();
//        oos.close();
//    }
//}
public class ObjectStreamDemo{
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:/MyJava/Student3.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student3 s = (Student3) ois.readObject();

        System.out.println(s);

        ois.close();
        fis.close();
    }
}