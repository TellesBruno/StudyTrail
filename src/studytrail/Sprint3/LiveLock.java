package studytrail.Sprint3;

public class LiveLock {
    static final Object object1 = new Object();
    static final Object object2 = new Object();
    static Object thread1holds1 = null;
    static Object thread1holds2 = null;
    static Object thread2holds1 = null;
    static Object thread2holds2 = null;

    public static void main(String[] args) {
        Thread t1 = new Thread(hoderboth1());
        Thread t2 = new Thread(hoderboth2());
        t1.start();
        t2.start();
    }

    public static Runnable hoderboth1() {
        return () -> {
            while (thread1holds1 != object1 || thread1holds2 != object2) {
                synchronized (object1) {
                    thread1holds1 = object1;
                    thread2holds1 = null;
                    System.out.println("Thread 1 holding object 1");
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object2) {
                    thread1holds2 = object2;
                    thread2holds2 = null;
                    System.out.println("Thread 1 holding object 2");
                }
            }
        };
    }

    public static Runnable hoderboth2() {
        return () -> {
            while (thread2holds1 != object1 || thread2holds2 != object2) {
                synchronized (object1) {
                    thread2holds1 = object1;
                    thread1holds1 = null;
                    System.out.println("Thread 2 holding object 1");
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object2) {
                    thread2holds2 = object2;
                    thread1holds2 = null;
                    System.out.println("Thread 2 holding object 2");
                }
            }
        };
    }
}
