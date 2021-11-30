package studytrail.Sprint3;

public class DaemonThreads {
    public static void main(String[] args) {
        Runnable main = mainThread();
        Runnable daemon = daemonThread(true);

        Thread mainThread = new Thread(main);
        Thread daemonThread = new Thread(daemon);

        daemonThread.setDaemon(true);

        mainThread.start();
        daemonThread.start();
    }

    public static Runnable mainThread() {
        return () -> {
            for(int i = 10; i >= 0 ; i--) {
                System.out.println("Main Thread is running! Counting down: " + i);
            }
        };
    }

    public static Runnable daemonThread(boolean keppAlive) {
        return () -> {
            while (keppAlive) {
                System.out.println("Daemon Thread is running");
                if (!keppAlive) {
                    System.out.println("Daemon Thread is dead");
                }
            }
        };
    }
}
