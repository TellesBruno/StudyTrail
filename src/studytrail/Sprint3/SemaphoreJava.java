package studytrail.Sprint3;

import java.util.concurrent.Semaphore;
import java.util.stream.Stream;

public class SemaphoreJava {

    static int count = 0;
    static Semaphore semaphore = new Semaphore(1);
    static Stream<String> nomes = Stream.of("Joao", "Maria", "Pedro", "Jose", "Ana", "Jorge");
    static Stream<String> nomes2 = Stream.of("Joao", "Maria", "Pedro", "Jose", "Ana", "Jorge");

    public static void main(String[] args) {

        new Thread(threadIncrementer1).start();
        new Thread(threadIncrementer2).start();

        new Thread(namesPrinter).start();
        new Thread(namesPrinter2).start();
    }

    public static void incrementer (String ThreadName) {
        count++;
        System.out.println(ThreadName + " " + count);
    }

    public static void namePrinter (String ThreadName, Stream<String> nomesLoc) {
        nomesLoc.forEach((nome) -> System.out.println(ThreadName + " " + nome));
    }

    public static Runnable threadIncrementer1 = () -> {
        try {
            semaphore.acquire();
            for (int i = 0; i < 1000; i++) {
                incrementer("Thread 1:");
            }
            semaphore.release();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    };

    public static Runnable threadIncrementer2 = () -> {
        try {
            semaphore.acquire();
            for (int i = 0; i < 1000; i++) {
                incrementer("Thread 2:");
            }
            semaphore.release();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    };

    public static Runnable namesPrinter = () -> {
        try {
            semaphore.acquire();
            namePrinter("Printer 1: ", nomes);
            semaphore.release();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    };

    public static Runnable namesPrinter2 = () -> {
        try {
            semaphore.acquire();
            namePrinter("Printer 2: ", nomes2);
            semaphore.release();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    };
}
