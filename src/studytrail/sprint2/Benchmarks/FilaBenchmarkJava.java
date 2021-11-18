package studytrail.sprint2.Benchmarks;

import java.util.*;

public class FilaBenchmarkJava {
    public static void main(String[] args) {

        int runs = 10;

        Queue<String> filaQueue = new LinkedList<>();
        long filaQueueTime;
        long filaQueueTimePoll = 0;
        long filaQueueTimeMedian = 0;
        long filaQueueTimeMedianPoll = 0;

        Deque<String> filaDeque = new ArrayDeque<>();
        long filaDequeTime;
        long filaDequeTimePoll = 0;
        long filaDequeTimeMedian = 0;
        long filaDequeTimeMedianPoll = 0;

        for (int i = 0; i < runs; i++) {
            long startTime = System.currentTimeMillis();
            for (int j = 0; j < 1000000; j++) {
                filaQueue.offer("" + j);
            }
            long endTime = System.currentTimeMillis();
            filaQueueTime = (endTime - startTime);
            System.out.println("FilaQueue: " + (filaQueueTime / 1000.0) + " seconds");
            filaQueueTimeMedian += filaQueueTime;
            startTime = System.currentTimeMillis();
            for (int j = 0; j < 500000; j++) {
                filaQueue.poll();
            }
            endTime = System.currentTimeMillis();
            filaQueueTimePoll = (endTime - startTime);
            System.out.println("FilaQueuePoll: " + (filaQueueTimePoll / 1000.0) + " seconds");
            filaQueueTimeMedianPoll += filaQueueTimePoll;
        }
        filaQueueTimeMedian = filaQueueTimeMedian / runs;
        filaQueueTimeMedianPoll = filaQueueTimeMedianPoll / runs;
        System.out.println("\n");
        System.out.println("FilaQueueMedian: " + (filaQueueTimeMedian / 1000.0) + " seconds");
        System.out.println("FilaQueueMedianPoll: " + (filaQueueTimeMedianPoll / 1000.0) + " seconds");

        separator();

        for (int i = 0; i < runs; i++) {
            long startTime = System.currentTimeMillis();
            for (int j = 0; j < 1000000; j++) {
                filaDeque.offerLast("" + j);
            }
            long endTime = System.currentTimeMillis();
            filaDequeTime = (endTime - startTime);
            System.out.println("FilaDeque: " + (filaDequeTime / 1000.0) + " seconds");
            filaDequeTimeMedian += filaDequeTime;
            startTime = System.currentTimeMillis();
            for (int j = 0; j < 500000; j++) {
                filaDeque.pollFirst();
            }
            endTime = System.currentTimeMillis();
            filaDequeTimePoll = (endTime - startTime);
            System.out.println("FilaDequePoll: " + (filaDequeTimePoll / 1000.0) + " seconds");
            filaDequeTimeMedianPoll += filaDequeTimePoll;
        }
        filaDequeTimeMedian = filaDequeTimeMedian / runs;
        filaDequeTimeMedianPoll = filaDequeTimeMedianPoll / runs;
        System.out.println("\n");
        System.out.println("FilaDequeMedian: " + (filaDequeTimeMedian / 1000.0) + " seconds");
        System.out.println("FilaDequeMedianPoll: " + (filaDequeTimeMedianPoll / 1000.0) + " seconds");

        separator();

        filaQueue.clear();
        filaQueueTimeMedian = 0;
        filaQueueTimeMedianPoll = 0;
        filaDeque.clear();
        filaDequeTimeMedian = 0;
        filaDequeTimeMedianPoll = 0;

        for (int i = 0; i < runs; i++) {
            long startTime = System.currentTimeMillis();
            for (int j = 0; j < 1000000; j++) {
                filaQueue.add("" + j);
            }
            long endTime = System.currentTimeMillis();
            filaQueueTime = (endTime - startTime);
            System.out.println("FilaQueueAdd: " + (filaQueueTime / 1000.0) + " seconds");
            filaQueueTimeMedian += filaQueueTime;
            startTime = System.currentTimeMillis();
            for (int j = 0; j < 500000; j++) {
                filaQueue.remove();
            }
            endTime = System.currentTimeMillis();
            filaQueueTimePoll = (endTime - startTime);
            System.out.println("FilaQueueRemove: " + (filaQueueTimePoll / 1000.0) + " seconds");
            filaQueueTimeMedianPoll += filaQueueTimePoll;
        }
        filaQueueTimeMedian = filaQueueTimeMedian / runs;
        filaQueueTimeMedianPoll = filaQueueTimeMedianPoll / runs;
        System.out.println("\n");
        System.out.println("FilaQueueMedian: " + (filaQueueTimeMedian / 1000.0) + " seconds");
        System.out.println("FilaQueueMedianPoll: " + (filaQueueTimeMedianPoll / 1000.0) + " seconds");

        separator();

        for (int i = 0; i < runs; i++) {
            long startTime = System.currentTimeMillis();
            for (int j = 0; j < 1000000; j++) {
                filaDeque.addLast("" + j);
            }
            long endTime = System.currentTimeMillis();
            filaDequeTime = (endTime - startTime);
            System.out.println("FilaDequeAdd: " + (filaDequeTime / 1000.0) + " seconds");
            filaDequeTimeMedian += filaDequeTime;
            startTime = System.currentTimeMillis();
            for (int j = 0; j < 500000; j++) {
                filaDeque.removeFirst();
            }
            endTime = System.currentTimeMillis();
            filaDequeTimePoll = (endTime - startTime);
            System.out.println("FilaDequeRemove: " + (filaDequeTimePoll / 1000.0) + " seconds");
            filaDequeTimeMedianPoll += filaDequeTimePoll;
        }
        filaDequeTimeMedian = filaDequeTimeMedian / runs;
        filaDequeTimeMedianPoll = filaDequeTimeMedianPoll / runs;
        System.out.println("\n");
        System.out.println("FilaDequeMedian: " + (filaDequeTimeMedian / 1000.0) + " seconds");
        System.out.println("FilaDequeMedianPoll: " + (filaDequeTimeMedianPoll / 1000.0) + " seconds");
    }

    public static void separator() {
        System.out.println(" ");
        System.out.println("============================");
        System.out.println(" ");
    }
}
