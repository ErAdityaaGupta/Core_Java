// in this program we are understanding the working of enum

import java.sql.SQLOutput;


enum Dept{
    CS("John","Block A"),IT("Smith","Block B"),CIVIL("Srinivas","Block C"),ECE("Dave","Block D");

    String head;   
    String location;
    private Dept(String head,String loc){
//        System.out.println(this.name());
        this.head = head;
        this.location = loc;

    }

    public void display(){
        System.out.println(this.name()+"  "+this.ordinal());
    }

    public String headname(){
        return head;
    }
    public String getlocation(){
        return location;
    }
}

public class Enum {
    public static void main(String[] args) {
//        Dept d = Dept.CIVIL;
//
//        Dept list[] = Dept.values();
//
//        for (Dept x:list){
//            System.out.println(x);
//        }
//        System.out.println(d.ordinal());
//        System.out.println(d.name());

        Dept d = Dept.CIVIL;
        Dept c = Dept.CS;
        Dept b = Dept.IT;
        Dept a = Dept.ECE;

        System.out.println(d.headname());
        System.out.println(d.getlocation());

        System.out.println(c.headname());
        System.out.println(c.getlocation());

        System.out.println(b.headname());
        System.out.println(b.getlocation());

        System.out.println(a.headname());
        System.out.println(a.getlocation());


        d.display();

        switch(d){
            case CS :
                System.out.println("Head: John \nBlock: A");
                break;
            case IT :
                System.out.println("Head: Smith \nBlock: B");
                break;
            case CIVIL :
                System.out.println("Head: Srinivas \nBlock: C");
                break;
            case ECE :
                System.out.println("Head: Dave \nBlock: D");
                break;
        }

    }
}
