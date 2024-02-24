import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

class Account implements Serializable {
    String accNo;
    String name;
    int balance;

    Account(){}

     Account(String a,String n,int b){
        accNo = a;
        name = n;
        balance = b;
    }

    public String toString(){
        return "Account no: "+accNo+"\nName: "+name+"\nBalance: "+balance;
    }
}

public class MenuDrivenProgram {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);

        Account acc = null;

        HashMap<String,Account> hm = new HashMap<>();

        try{
            FileInputStream fis = new FileInputStream("Accounts.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int count = ois.readInt();

            for (int i=0;i<count;i++){
                acc = (Account) ois.readObject();
                System.out.println(acc);
                hm.put(acc.accNo,acc);
            }

            ois.close();
            fis.close();
        }
        catch (Exception e){

        }

        FileOutputStream fos = new FileOutputStream("Accounts.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        System.out.println("Menu");

        int choice;
        String accNo,name;
        int balance;

        do {
            System.out.println("1: Create Account");
            System.out.println("2: Delete Account");
            System.out.println("3: View Account");
            System.out.println("4: View All Account");
            System.out.println("5: Save Accounts");
            System.out.println("6: Exit");
            choice = sc.nextInt();

            sc.skip("(\r\n|[\\n\\r\\u2028\\u2029\\u0085])?");

            switch (choice){
                case 1 :
                    System.out.println("Enter Account details,Name,balance");
                    accNo = sc.nextLine();
                    name = sc.nextLine();
                    balance = sc.nextInt();
                    acc = new Account(accNo,name,balance);
                    hm.put(accNo,acc);
                    System.out.println("Account created for: "+name);
                    break;

                case 2:
                    System.out.println("Enter Account number");
                    accNo = sc.nextLine();
                    hm.remove(accNo);
                    break;

                case 3:
                    System.out.println("Enter Account number");
                    accNo = sc.nextLine();
                    acc = hm.get(accNo);
                    System.out.println(acc);
                    break;

                case 4:
                    for(Account a:hm.values()){
                        System.out.println(a);
                }
                    break;

                case 5:
                case 6:
                    oos.writeInt(hm.size());
                    for(Account a:hm.values()){
                        oos.writeObject(a);
                    }
            }
        }while (choice!=6);
        oos.flush();
        oos.close();
        fos.close();


    }
}
