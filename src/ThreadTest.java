// Creating constructors of the thread class




//class MyRun implements Runnable{
//    public void run(){
//
//    }
//}

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
//        setPriority(Thread.MAX_PRIORITY-7);
//        setPriority(Thread.MIN_PRIORITY);
    }

    public void run(){
        int count = 0;
        while(true){
            System.out.print(count+" ");
            count++;
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

//class Thread2 extends Thread{
//    public void display(){
//        for(int i = 1;i>0;i++){
//            System.out.println(i);
//        }
//    }
//}

public class ThreadTest {
    public static void main(String[] args)throws Exception {
//        Thread t = new Thread(new MyRun());

        MyThread t = new MyThread("Aditya");
//        Thread2 n = new Thread2();
//        n.display();
//        System.out.println(n.isAlive());
//        System.out.println(t.getId());
//        System.out.println(t.getName());
//        System.out.println(t.getPriority());
//        t.start();
//        System.out.println(t.getState());
//        System.out.println(t.isAlive());

        t.start();
        t.interrupt();
    }
}
