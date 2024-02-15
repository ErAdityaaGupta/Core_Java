// In this program we implement methods of the piped input and output streams.


import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer1 extends Thread {
    OutputStream os;

    public Producer1(OutputStream o){
        os = o;
    }
    public void run(){
        int count = 1;

        while(true){
            try{
                os.write(count);
                os.flush();

                System.out.println("Producer "+count);
                System.out.flush();
                Thread.sleep(10);
                count++;
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }

}

class Consumer1 extends Thread{
    InputStream is;

    public Consumer1(InputStream i){
        is = i;
    }

    public void run(){
        int x;
        while(true){
            try{
                x = is.read();

                System.out.println("Consumer "+x);
                System.out.flush();
                Thread.sleep(10);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }

    }
}

public class PipedDemo {
    public static void main(String[] args) throws Exception{
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pis.connect(pos);

        Producer1 p = new Producer1(pos);
        Consumer1 c = new Consumer1(pis);

        p.start();
        c.start();
    }
}
