package studytrail.sprint2.Benchmarks;

import java.util.*;

public class PilhaBenchmarkJava {
    public static void main(String[] args) {
        int runs = 10;
        Stack<String> pilha = new Stack<>();
        long pilhaTime = 0;
        long pilhaTimePop = 0;
        long pilhaTimeMedian = 0;
        long pilhaTimeMedianPop = 0;

        Deque<String> pilhaDeque = new ArrayDeque<>();
        long pilhaDequeTime = 0;
        long pilhaDequeTimePop = 0;
        long pilhaDequeTimeMedian = 0;
        long pilhaDequeTimeMedianPop = 0;

        for (int i = 0; i < runs; i++) {
            long startTime = System.currentTimeMillis();
            for (int j = 0; j < 1000000; j++) {
                pilha.push("" + j);
            }
            long endTime = System.currentTimeMillis();
            pilhaTime = (endTime - startTime);
            System.out.println("PilhaStackPush: " + (pilhaTime / 1000.0) + " seconds");
            pilhaTimeMedian += pilhaTime;
            startTime = System.currentTimeMillis();
            for (int j = 0; j < 500000; j++) {
                pilha.pop();
            }
            endTime = System.currentTimeMillis();
            pilhaTimePop = (endTime - startTime);
            System.out.println("PilhaStackPop: " + (pilhaTimePop / 1000.0) + " seconds");
            pilhaTimeMedianPop += pilhaTimePop;
        }
        pilhaTimeMedian = pilhaTimeMedian / runs;
        pilhaTimeMedianPop = pilhaTimeMedianPop / runs;
        System.out.println("\n");
        System.out.println("PilhaMedian: " + (pilhaTimeMedian / 1000.0) + " seconds");
        System.out.println("PilhaMedianPop: " + (pilhaTimeMedianPop / 1000.0) + " seconds");

        separator();

        for (int i = 0; i < runs; i++) {
            long startTime = System.currentTimeMillis();
            for (int j = 0; j < 1000000; j++) {
                pilhaDeque.push("" + j);
            }
            long endTime = System.currentTimeMillis();
            pilhaDequeTime = (endTime - startTime);
            System.out.println("PilhaDequePush: " + (pilhaDequeTime / 1000.0) + " seconds");
            pilhaDequeTimeMedian += pilhaDequeTime;
            startTime = System.currentTimeMillis();
            for (int j = 0; j < 500000; j++) {
                pilhaDeque.pop();
            }
            endTime = System.currentTimeMillis();
            pilhaDequeTimePop = (endTime - startTime);
            System.out.println("PilhaDequePop: " + (pilhaDequeTimePop / 1000.0) + " seconds");
            pilhaDequeTimeMedianPop += pilhaDequeTimePop;
        }
        pilhaDequeTimeMedian = pilhaDequeTimeMedian / runs;
        pilhaDequeTimeMedianPop = pilhaDequeTimeMedianPop / runs;
        System.out.println("\n");
        System.out.println("PilhaDequeMedian: " + (pilhaDequeTimeMedian / 1000.0) + " seconds");
        System.out.println("PilhaDequeMedianPop: " + (pilhaDequeTimeMedianPop / 1000.0) + " seconds");
    }

    public static void separator() {
        System.out.println(" ");
        System.out.println("============================");
        System.out.println(" ");
    }
}
