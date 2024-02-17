// In this program we understand the basic functioning of generics.


//class Data<T>{
//    private T obj;
//
//    public void setData(T v){
//        obj = v;
//    }
//    public T getData(){
//        return obj;
//    }
//}

class MyArray<T>{
    T A[] = (T[]) new Object[10];
    int length = 0;

    public void append(T v){
        A[length++] = v;
    }

    public void display(){
        for(int i=0;i<length;i++){
            System.out.print(A[i]+" ");
        }
    }
}

public class GenericDemo<T> {
//    T data[] = (T[]) new Object[3];
//
//    public static void main(String[] args) {
//        GenericDemo<String> gd = new GenericDemo<>();
//
//        gd.data[0] = "Hi";
//        gd.data[1] = "Aditya";
//        gd.data[2] = "Gupta";
//    }

//    public static void main(String[] args) {
//        Data <Integer> d = new Data<>();
//        d.setData(10);
//        System.out.println(d.getData());
//    }

    public static void main(String[] args) {
        MyArray ma = new MyArray<>();

        ma.append(10);
        ma.append(20);
        ma.append(30);
        ma.append(40);
        ma.append("HI");
        ma.append(66);
        ma.append(69);

        ma.display();

    }
}
