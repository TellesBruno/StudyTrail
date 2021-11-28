package studytrail.Sprint3;

import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public class ThreadsJava {
    static int count = 0;
    static Stream<String> nomes = Stream.of("Joao", "Maria", "Pedro", "Jose", "Ana", "Jorge");

    public static void main(String[] args) {
//        ThreadsJava.threadPrinter();
//        ThreadsJava.threadPrinter();

        new Thread(threadIncrementer).start();
        new Thread(threadIncrementer2).start();

        new Thread(namesPrinter).start();
        new Thread(namesPrinter2).start();

        System.out.println(count);
    }

    public static void threadPrinter() {
        Thread thread = new Thread(() -> {
            Stream.iterate(1, i -> i + 1).limit(1000).forEach(System.out::println);
        });
        thread.start();
    }

    public static void incrementer (String ThreadName) {
        count++;
        System.out.println(ThreadName + " " + count);
    }

    public static void namePrinter (String ThreadName){
        nomes.forEach((nome) -> System.out.println(ThreadName + " " + nome));
    }

    public static Runnable threadIncrementer = new Runnable() {
        @Override
        public void run() {
            try {
                for (int i = 0; i < 1000; i++) {
                    incrementer("Thread 1:");
                }
            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        }
    };

    public static Runnable threadIncrementer2 = () -> {
        try {
            for (int i = 0; i < 1000; i++) {
                incrementer("Thread 2:");
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    };

    public static Runnable namesPrinter = () -> {
        try {
            namePrinter("Printer 1: ");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    };

    public static Runnable namesPrinter2 = () -> {
        try {
            namePrinter("Printer 2: ");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    };


}
