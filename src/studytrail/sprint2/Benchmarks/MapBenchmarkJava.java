package studytrail.sprint2.Benchmarks;

import java.util.*;

public class MapBenchmarkJava {
    public static void main(String[] args) {

        int runs = 10;

        Map<String, String> map = new HashMap<>();
        long HashMapTime;
        long HashMapTimeExclude;
        long HashMapTimeMedian = 0;
        long HashMapTimeMedianExclude = 0;

        Map<String, String> map2 = new Hashtable<>();
        long HashtableTime;
        long HashtableTimeExclude;
        long HashtableTimeMedian = 0;
        long HashtableTimeMedianExclude = 0;

        Map<String, String> map3 = new LinkedHashMap<>();
        long LinkedHashMapTime;
        long LinkedHashMapTimeExclude;
        long LinkedHashMapTimeMedian = 0;
        long LinkedHashMapTimeMedianExclude = 0;

        SortedMap<String, String> map4 = new TreeMap<>();
        long TreeMapTime;
        long TreeMapTimeExclude;
        long TreeMapTimeMedian = 0;
        long TreeMapTimeMedianExclude = 0;

        for (int i = 0; i < runs; i++) {
            long startTime = System.currentTimeMillis();
            for (int j = 0; j < 1000000; j++) {
                map.put("key: " + j, "value: " + j);
            }
            long endTime = System.currentTimeMillis();
            HashMapTime = endTime - startTime;
            System.out.println("Time taken HashMap: " + (HashMapTime / 1000.0) + " seconds");
            HashMapTimeMedian += HashMapTime;
            startTime = System.currentTimeMillis();
            for (int j = 0; j < 500000; j++) {
                map.remove("key: " + j);
            }
            endTime = System.currentTimeMillis();
            HashMapTimeExclude = endTime - startTime;
            System.out.println("Time taken HashMap Exclude: " + (HashMapTimeExclude / 1000.0) + " seconds");
            HashMapTimeMedianExclude += HashMapTimeExclude;
        }
            HashMapTimeMedian = HashMapTimeMedian / runs;
            HashMapTimeMedianExclude = HashMapTimeMedianExclude / runs;
            System.out.println("\n");
            System.out.println("Median Time taken HashMap: " + (HashMapTimeMedian / 1000.0) + " seconds");
            System.out.println("Median Time taken HashMap Exclude: " + (HashMapTimeMedianExclude / 1000.0) + " seconds");

            separator();

        for (int i = 0; i < runs; i++) {
            long startTime = System.currentTimeMillis();
            for (int j = 0; j < 1000000; j++) {
                map2.put("key: " + j, "value: " + j);
            }
            long endTime = System.currentTimeMillis();
            HashtableTime = endTime - startTime;
            System.out.println("Time taken Hashtable: " + (HashtableTime / 1000.0) + " seconds");
            HashtableTimeMedian += HashtableTime;
            startTime = System.currentTimeMillis();
            for (int j = 0; j < 500000; j++) {
                map2.remove("key: " + j);
            }
            endTime = System.currentTimeMillis();
            HashtableTimeExclude = endTime - startTime;
            System.out.println("Time taken Hashtable Exclude: " + (HashtableTimeExclude / 1000.0) + " seconds");
            HashtableTimeMedianExclude += HashtableTimeExclude;
        }
            HashtableTimeMedian = HashtableTimeMedian / runs;
            HashtableTimeMedianExclude = HashtableTimeMedianExclude / runs;
            System.out.println("\n");
            System.out.println("Median Time taken Hashtable: " + (HashtableTimeMedian / 1000.0) + " seconds");
            System.out.println("Median Time taken Hashtable Exclude: " + (HashtableTimeMedianExclude / 1000.0) + " seconds");

            separator();

        for (int i = 0; i < runs; i++) {
            long startTime = System.currentTimeMillis();
            for (int j = 0; j < 1000000; j++) {
                map3.put("key: " + j, "value: " + j);
            }
            long endTime = System.currentTimeMillis();
            LinkedHashMapTime = endTime - startTime;
            System.out.println("Time taken LinkedHashMap: " + (LinkedHashMapTime / 1000.0) + " seconds");
            LinkedHashMapTimeMedian += LinkedHashMapTime;
            startTime = System.currentTimeMillis();
            for (int j = 0; j < 500000; j++) {
                map3.remove("key: " + j);
            }
            endTime = System.currentTimeMillis();
            LinkedHashMapTimeExclude = endTime - startTime;
            System.out.println("Time taken LinkedHashMap Exclude: " + (LinkedHashMapTimeExclude / 1000.0) + " seconds");
            LinkedHashMapTimeMedianExclude += LinkedHashMapTimeExclude;
        }
            LinkedHashMapTimeMedian = LinkedHashMapTimeMedian / runs;
            LinkedHashMapTimeMedianExclude = LinkedHashMapTimeMedianExclude / runs;
            System.out.println("\n");
            System.out.println("Median Time taken LinkedHashMap: " + (LinkedHashMapTimeMedian / 1000.0) + " seconds");
            System.out.println("Median Time taken LinkedHashMap Exclude: " + (LinkedHashMapTimeMedianExclude / 1000.0) + " seconds");

            separator();

        for (int i = 0; i < runs; i++) {
            long startTime = System.currentTimeMillis();
            for (int j = 0; j < 1000000; j++) {
                map4.put("key: " + j, "value: " + j);
            }
            long endTime = System.currentTimeMillis();
            TreeMapTime = endTime - startTime;
            System.out.println("Time taken TreeMap: " + (TreeMapTime / 1000.0) + " seconds");
            TreeMapTimeMedian += TreeMapTime;
            startTime = System.currentTimeMillis();
            for (int j = 0; j < 500000; j++) {
                map4.remove("key: " + j);
            }
            endTime = System.currentTimeMillis();
            TreeMapTimeExclude = endTime - startTime;
            System.out.println("Time taken TreeMap Exclude: " + (TreeMapTimeExclude / 1000.0) + " seconds");
            TreeMapTimeMedianExclude += TreeMapTimeExclude;
        }
            TreeMapTimeMedian = TreeMapTimeMedian / runs;
            TreeMapTimeMedianExclude = TreeMapTimeMedianExclude / runs;
            System.out.println("\n");
            System.out.println("Median Time taken TreeMap: " + (TreeMapTimeMedian / 1000.0) + " seconds");
            System.out.println("Median Time taken TreeMap Exclude: " + (TreeMapTimeMedianExclude / 1000.0) + " seconds");
    }

    public static void separator() {
        System.out.println(" ");
        System.out.println("============================");
        System.out.println(" ");
    }
}
