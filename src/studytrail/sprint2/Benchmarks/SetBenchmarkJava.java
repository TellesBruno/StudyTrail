package studytrail.sprint2.Benchmarks;

import java.util.*;

public class SetBenchmarkJava {
    public static void main(String[] args) {

        int runs = 10;

        Set<String> set = new HashSet<>();
        long HashSetTime = 0;
        long HashSetTimeExclude = 0;
        long HashSetTimeMedian = 0;
        long HashSetTimeMedianExclude = 0;

        Set<String> set2 = new LinkedHashSet<>();
        long LinkedHashSetTime = 0;
        long LinkedHashSetTimeExclude = 0;
        long LinkedHashSetTimeMedian = 0;
        long LinkedHashSetTimeMedianExclude = 0;

        Set<String> set3 = new TreeSet<>();
        long TreeSetTime = 0;
        long TreeSetTimeExclude = 0;
        long TreeSetTimeMedian = 0;
        long TreeSetTimeMedianExclude = 0;

        SortedSet<String> set4 = new TreeSet<>();
        long SortedSetTime = 0;
        long SortedSetTimeExclude = 0;
        long SortedSetTimeMedian = 0;
        long SortedSetTimeMedianExclude = 0;

        for (int i = 0; i < runs; i++) {
            long startTime = System.currentTimeMillis();
            for (int j = 0; j < 1000000; j++) {
                set.add("" + j);
            }
            long endTime = System.currentTimeMillis();
            HashSetTime = (endTime - startTime);
            System.out.println("HashSetTime: " + (HashSetTime / 1000.0) + " seconds");
            HashSetTimeMedian += HashSetTime;
            startTime = System.currentTimeMillis();
            for (int j = 0; j < 500000; j++) {
                set.remove("" + j);
            }
            endTime = System.currentTimeMillis();
            HashSetTimeExclude = (endTime - startTime);
            System.out.println("HashSetTimeExclude: " + (HashSetTimeExclude / 1000.0) + " seconds");
            HashSetTimeMedianExclude += HashSetTimeExclude;

        }
        HashSetTimeMedian = HashSetTimeMedian / runs;
        HashSetTimeMedianExclude = HashSetTimeMedianExclude / runs;
        System.out.println("\n");
        System.out.println("HashSetTimeMedian: " + (HashSetTimeMedian / 1000.0) + " seconds");
        System.out.println("HashSetTimeMedianExclude: " + (HashSetTimeMedianExclude / 1000.0) + " seconds");

        separator();

        for (int i = 0; i < runs; i++) {
            long startTime = System.currentTimeMillis();
            for (int j = 0; j < 1000000; j++) {
                set2.add("" + j);
            }
            long endTime = System.currentTimeMillis();
            LinkedHashSetTime = (endTime - startTime);
            System.out.println("LinkedHashSetTime: " + (LinkedHashSetTime / 1000.0) + " seconds");
            LinkedHashSetTimeMedian += LinkedHashSetTime;
            startTime = System.currentTimeMillis();
            for (int j = 0; j < 500000; j++) {
                set2.remove("" + j);
            }
            endTime = System.currentTimeMillis();
            LinkedHashSetTimeExclude = (endTime - startTime);
            System.out.println("LinkedHashSetTimeExclude: " + (LinkedHashSetTimeExclude / 1000.0) + " seconds");
            LinkedHashSetTimeMedianExclude += LinkedHashSetTimeExclude;
        }
        LinkedHashSetTimeMedian = LinkedHashSetTimeMedian / runs;
        LinkedHashSetTimeMedianExclude = LinkedHashSetTimeMedianExclude / runs;
        System.out.println("\n");
        System.out.println("LinkedHashSetTimeMedian: " + (LinkedHashSetTimeMedian / 1000.0) + " seconds");
        System.out.println("LinkedHashSetTimeMedianExclude: " + (LinkedHashSetTimeMedianExclude / 1000.0) + " seconds");

        separator();

        for (int i = 0; i < runs; i++) {
            long startTime = System.currentTimeMillis();
            for (int j = 0; j < 1000000; j++) {
                set3.add("" + j);
            }
            long endTime = System.currentTimeMillis();
            TreeSetTime = (endTime - startTime);
            System.out.println("TreeSetTime: " + (TreeSetTime / 1000.0) + " seconds");
            TreeSetTimeMedian += TreeSetTime;
            startTime = System.currentTimeMillis();
            for (int j = 0; j < 500000; j++) {
                set3.remove("" + j);
            }
            endTime = System.currentTimeMillis();
            TreeSetTimeExclude = (endTime - startTime);
            System.out.println("TreeSetTimeExclude: " + (TreeSetTimeExclude / 1000.0) + " seconds");
            TreeSetTimeMedianExclude += TreeSetTimeExclude;
        }
        TreeSetTimeMedian = TreeSetTimeMedian / runs;
        TreeSetTimeMedianExclude = TreeSetTimeMedianExclude / runs;
        System.out.println("\n");
        System.out.println("TreeSetTimeMedian: " + (TreeSetTimeMedian / 1000.0) + " seconds");
        System.out.println("TreeSetTimeMedianExclude: " + (TreeSetTimeMedianExclude / 1000.0) + " seconds");

        separator();

        for (int i = 0; i < runs; i++) {
            long startTime = System.currentTimeMillis();
            for (int j = 0; j < 1000000; j++) {
                set4.add("" + j);
            }
            long endTime = System.currentTimeMillis();
            SortedSetTime = (endTime - startTime);
            System.out.println("SortedSetTime: " + (SortedSetTime / 1000.0) + " seconds");
            SortedSetTimeMedian += SortedSetTime;
            startTime = System.currentTimeMillis();
            for (int j = 0; j < 500000; j++) {
                set4.remove("" + j);
            }
            endTime = System.currentTimeMillis();
            SortedSetTimeExclude = (endTime - startTime);
            System.out.println("SortedSetTimeExclude: " + (SortedSetTimeExclude / 1000.0) + " seconds");
            SortedSetTimeMedianExclude += SortedSetTimeExclude;
        }
        SortedSetTimeMedian = SortedSetTimeMedian / runs;
        SortedSetTimeMedianExclude = SortedSetTimeMedianExclude / runs;
        System.out.println("\n");
        System.out.println("SortedSetTimeMedian: " + (SortedSetTimeMedian / 1000.0) + " seconds");
        System.out.println("SortedSetTimeMedianExclude: " + (SortedSetTimeMedianExclude / 1000.0) + " seconds");
    }

    public static void separator() {
        System.out.println(" ");
        System.out.println("============================");
        System.out.println(" ");
    }
}
