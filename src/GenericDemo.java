// In this program we understand the basic functioning of generics.


class Data<T>{
    private T obj;

    public void setData(T v){
        obj = v;
    }
    public T getData(){
        return obj;
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

    public static void main(String[] args) {
        Data <Integer> d = new Data<>();
        d.setData(10);
        System.out.println(d.getData());
    }
}
