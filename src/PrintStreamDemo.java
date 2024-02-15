// In this program we try to implement a few methods of the print stream.


import java.io.*;

class Student1{
    int rollNo;
    String name;
    String dept;
}

public class PrintStreamDemo{
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:/MyJava/Student1.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));




    }
}

//public class PrintStreamDemo {
//    public static void main(String[] args) throws Exception{
//        FileOutputStream fos = new FileOutputStream("C:/MyJava/Student1.txt");
//        PrintStream ps = new PrintStream(fos);
//
//        Student1 s = new Student1();
//        s.rollNo = 10;
//        s.name = "John";
//        s.dept = "CSE";
//
//        ps.println(s.rollNo);
//        ps.println(s.name);
//        ps.println(s.dept);
//
//        ps.close();
//        fos.close();
//    }
//}
