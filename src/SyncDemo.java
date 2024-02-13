// we would try to achieve synchronization between the threads of the program.


class MyData{
    public void display(String str){
        synchronized (this) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
            }
        }
    }
}

class MyThread1 extends Thread{
    MyData d;
    public MyThread1(MyData d){
        this.d = d;
    }

    public void run(){
        d.display("Hello World");
    }
}

class MyThread9 extends Thread{
    MyData d;
    public MyThread9(MyData d){
        this.d = d;
    }

    public void run(){
        d.display("   Welcome");
    }
}

public class SyncDemo {
    public static void main(String[] args) {
        MyData data = new MyData();
        MyThread1 t = new MyThread1(data);
        MyThread9 y = new MyThread9(data);

        t.start();
        y.start();


    }
}
