// Checking out few more methods of the thread class.
class MyThread2 extends Thread{
    public void run(){
        int count = 0;
        while(true){
            System.out.println(count++ +" My Thread");
//            try{
//                Thread.sleep(10);
//            }
//            catch(InterruptedException e){
//                System.out.println(e);
//            }
        }
    }
}



public class ThreadTest2 {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
//        t.setDaemon(true);
        t.start();

//        try{
//            Thread.sleep(11001);
//        }
//        catch(Exception e){
//
//        }

//        Thread mainThread = Thread.currentThread();
//        try{
//            mainThread.join();
//        }
//        catch(InterruptedException e){
//
//        }

        int count = 1;
        while(true){
            System.out.println(count++ +" Main");
            Thread.yield();
        }


    }
}
