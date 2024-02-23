// In this program we try to implement the singleton design pattern


//class SingletonEager{
//    private static SingletonEager instance = new SingletonEager();
//
//    private SingletonEager(){}
//
//    public static SingletonEager getInstance(){
//        return instance;
//    }
//}
//
//
//public class SingletonExample {
//    public static void main(String[] args) {
//        SingletonEager sts =SingletonEager.getInstance();
//        System.out.println(sts);
//
//        SingletonEager sts1 = SingletonEager.getInstance();
//        System.out.println(sts1);
//
//    }
//}


//class SingletonLazy{
//    private static SingletonLazy instance;
//
//    private SingletonLazy(){}
//
//    public static SingletonLazy getInstance(){
//        if(instance == null){
//            instance = new SingletonLazy();
//        }
//        return instance;
//    }
//}
//
//public class SingletonExample {
//    public static void main(String[] args) {
//        SingletonLazy sts =SingletonLazy.getInstance();
//        System.out.println(sts);
//
//        SingletonLazy sts1 = SingletonLazy.getInstance();
//        System.out.println(sts1);
//
//    }
//}


class SingletonSynchronizesMethod{
    private static SingletonSynchronizesMethod instance;

    private SingletonSynchronizesMethod(){}

    public static synchronized SingletonSynchronizesMethod getInstance(){
        if(instance == null){
            instance = new SingletonSynchronizesMethod();
        }
        return instance;
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        SingletonSynchronizesMethod sts =SingletonSynchronizesMethod.getInstance();
        System.out.println(sts);

        SingletonSynchronizesMethod sts1 = SingletonSynchronizesMethod.getInstance();
        System.out.println(sts1);

    }
}
