// In this program we try to communicate between server and a clint.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseEcho {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(2000);
        Socket stk = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        StringBuilder sb;
        do {
            msg = br.readLine();
            sb = new StringBuilder(msg);
            sb.reverse();
            msg = sb.toString();
            ps.println(msg);
        }while (!msg.equals("dne") || !msg.equals("dnE"));
    }
}


class Client{
    public static void main(String[] args)throws Exception {
        Socket stk = new Socket("localhost",2000);
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        String msg;

        do {
            msg = br1.readLine();
            ps.println(msg);
            msg = br.readLine();
            System.out.println("From Server"+msg);
        }while (!msg.equals("dne") || !msg.equals("dnE"));

    }
}