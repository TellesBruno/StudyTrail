package studytrail.sprint2.Benchmarks;

import java.util.*;

public class ListaBenchmarkJava {
    public static void main(String[] args) {
         int runs = 10;

         ArrayList<String> listaArrayList = new ArrayList<>();
         long ArrayListTime = 0;
         long ArrayListTimeMedian = 0;
         long ArrayListTimeRemove = 0;
         long ArrayListTimeRemoveMedian = 0;

         LinkedList<String> listaLinkedList = new LinkedList<>();
         long LinkedListTime = 0;
         long LinkedListTimeMedian = 0;
         long LinkedListTimeRemove = 0;
         long LinkedListTimeRemoveMedian = 0;

         for (int i = 0; i < runs; i++) {
             long startTime = System.currentTimeMillis();
             for (int j = 0; j < 1000000; j++) {
                 listaArrayList.add(""+j);
             }
             long endTime = System.currentTimeMillis();
             ArrayListTime = (endTime - startTime);
             System.out.println("ArrayListTime: " + (ArrayListTime / 1000.0) + " seconds");
             ArrayListTimeMedian += ArrayListTime;
             startTime = System.currentTimeMillis();
             for (int j = 0; j < 500000; j++) {
                 listaArrayList.remove(""+j);
             }
             endTime = System.currentTimeMillis();
             ArrayListTimeRemove = (endTime - startTime);
             System.out.println("ArrayListTimeRemove: " + (ArrayListTimeRemove / 1000.0) + " seconds");
             ArrayListTimeRemoveMedian += ArrayListTimeRemove;
             listaArrayList.clear();
         }
         ArrayListTimeMedian = ArrayListTimeMedian / runs;
         ArrayListTimeRemoveMedian = ArrayListTimeRemoveMedian / runs;
         System.out.println("\n");
         System.out.println("ArrayListTimeMedian: " + (ArrayListTimeMedian / 1000.0) + " seconds");
         System.out.println("ArrayListTimeRemoveMedian: " + (ArrayListTimeRemoveMedian / 1000.0) + " seconds");

         separator();

         for (int i = 0; i < runs; i++) {
             long startTime = System.currentTimeMillis();
             for (int j = 0; j < 1000000; j++) {
                 listaLinkedList.add(""+j);
             }
             long endTime = System.currentTimeMillis();
             LinkedListTime = (endTime - startTime);
             System.out.println("LinkedListTime: " + (LinkedListTime / 1000.0) + " seconds");
             LinkedListTimeMedian += LinkedListTime;
             startTime = System.currentTimeMillis();

             for (int j = 0; j < 500000; j++) {
                 listaLinkedList.remove(""+j);
             }
             endTime = System.currentTimeMillis();
             LinkedListTimeRemove = (endTime - startTime);
             System.out.println("LinkedListTimeRemove: " + (LinkedListTimeRemove / 1000.0) + " seconds");
             LinkedListTimeRemoveMedian += LinkedListTimeRemove;
             listaLinkedList.clear();
         }
         LinkedListTimeMedian = LinkedListTimeMedian / runs;
         LinkedListTimeRemoveMedian = LinkedListTimeRemoveMedian / runs;
         System.out.println("\n");
         System.out.println("LinkedListTimeMedian: " + (LinkedListTimeMedian / 1000.0) + " seconds");
         System.out.println("LinkedListTimeRemoveMedian: " + (LinkedListTimeRemoveMedian / 1000.0) + " seconds");
    }

    public static void separator() {
        System.out.println(" ");
        System.out.println("============================");
        System.out.println(" ");
    }
}
