// In this program we try to implement some methods of the string tokenizer class.

import java.util.StringTokenizer;

public class TokenizerDemo {
    public static void main(String[] args) {
        String data = "name=vijay;address=delhi;country=india;dept=cse";

        StringTokenizer stk = new StringTokenizer(data,"=;");

        String s;

        while (stk.hasMoreTokens()){
            s = stk.nextToken();
            System.out.print(s+"  ");
        }

    }
}
