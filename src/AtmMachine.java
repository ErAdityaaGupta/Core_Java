// achieving synchronization in an atm in a locality.


class Atm {

    synchronized public void checkBalance(String name) {
        System.out.println(name + " is checking their account balance");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
  
    synchronized public void withdraw(String name, int amt) {
        System.out.println(name + " is withdrawing Rs" + amt);

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
    class Customer extends Thread {
//    Atm b = new Atm();

        Atm b;
        String name;
        int amount;

        public Customer(String name,int amt,Atm atm){
            b = atm;
            this.name = name;
            amount = amt;
        }

        public void useAtm() {
            b.checkBalance(name);
            b.withdraw(name,amount);
        }

        public void run(){
            useAtm();
        }
    }

    public class AtmMachine {
        public static void main(String[] args) {
        Atm a = new Atm();
        Customer c1 = new Customer("Aditya",5000,a);
        Customer c2 = new Customer("Arun",4000,a);

        c1.start();
        c2.start();
        }
    }
