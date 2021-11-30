package studytrail.Sprint3;

public class DeadLock {
    static final Object object1 = new Object();
    static final Object object2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(holder1());
        Thread t2 = new Thread(holder2());
        t1.start();
        t2.start();
    }

    public static Runnable holder1() {
        return () -> {
            synchronized (object1) {
                System.out.println("T1 Holding 1");
                synchronized (object2) {
                    System.out.println("T1 Holding 2");
                }
            }
        };
    }

    public static Runnable holder2() {
        return () -> {
            synchronized (object2) {
                System.out.println("T2 Holding 2");
                synchronized (object1) {
                    System.out.println("T2 Holding 1");
                }
            }
        };
    }
}
