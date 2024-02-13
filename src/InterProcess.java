//   in this program we try to communicate between different threads of the program to perform their operations on
//   the shared resource.

class MyData1{
    int value;
    boolean flag = true;
    synchronized public void set(int v){
        while (!flag){
           try{
               wait();
           }
           catch(InterruptedException e){
               System.out.println("Hi 1");
           }
        }

        value = v;
        flag = false;
        notify();
    }
    synchronized public int get(){
        int x;
        while (flag){
            try{
                wait();
            }
            catch (InterruptedException e){
                System.out.println("Hello");
            }
        }
        x = value;
        flag = true;
        notify();

        return x;
    }
}

class Producer extends Thread{
    MyData1 data;

    public Producer(MyData1 d){
        data = d;
    }
    public void run(){
        int count = 1;
        while(true){
            data.set(count);
            System.out.println("Producer"+count);
            count++;
        }
    }
}

class Consumer extends Thread{
    MyData1 data;
    public Consumer(MyData1 d){
        data = d;
    }
    public void run(){
        int value;
        value = data.get();
        System.out.println("Consumer"+value);
    }
}

public class InterProcess {
    public static void main(String[] args) {
        MyData1 data = new MyData1();

        Producer p = new Producer(data);
        Consumer c = new Consumer(data);

        p.start();
        c.start();


    }
}
