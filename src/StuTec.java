// In this program we would practice inter thread communications


class WhiteBoard{
    String text;
    int n=0; // n is the number of students
    int count = 0;

    public void attendance(){
        n++;
    }
    synchronized public void write(String t){
        System.out.println("Teacher is writing "+t);
        while(count!=0){
            try{
                wait();
            }
            catch(InterruptedException e){

            }
        }
        text = t;
        count = n;
        notify();
    }

    synchronized public String read(){
        while (count ==0){
            try {
                wait();
            }
            catch(InterruptedException e){

            }
        }
        String t = text;
        count--;
        if (count ==0){
            notify();
        }
        return t;
    }
}

class Teacher extends Thread{
    WhiteBoard wb;
    String notes[] = {"Java is a language","It is an OOPS language","It is platform independent","It supports Thread","End"};

    public Teacher(WhiteBoard w){
        wb = w;
    }

    public void run(){
        for (int i=0;i<notes.length;i++){
            wb.write(notes[i]);
        }
    }
}

class Student extends Thread{
    String name;
    WhiteBoard wb;

    public Student(String n,WhiteBoard w){
        name = n;
        wb  =w;
    }

    public void run(){
        String text;
        wb.attendance();

        do{
            text = wb.read();
            System.out.println(name+" is reading "+text);
            System.out.flush();
        }while(!text.equals("End"));
    }
}

public class StuTec {
    public static void main(String[] args) {
        WhiteBoard wb = new WhiteBoard();
        Teacher t = new Teacher(wb);

        Student s1 = new Student("1: Aditya",wb);
        Student s2 = new Student("2: Arun",wb);
        Student s3 = new Student("3: Aruna",wb);
        Student s4 = new Student("4: Tarushi",wb);

        t.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
