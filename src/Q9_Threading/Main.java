package Q11_Threading;

public class Main {
    public static void main(String[] args) {
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();
        obj1.start();
        obj2.start();
    }

}
