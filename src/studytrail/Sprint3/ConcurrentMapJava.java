package studytrail.Sprint3;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class ConcurrentMapJava {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        ConcurrentHashMap<Integer, String> mapLots = new ConcurrentHashMap<>();
        Map<Integer, String> mapNormal = new HashMap<>();

        map.put(1, "Joao");
        map.put(2, "Maria");
        map.put(3, "Pedro");
        map.put(4, "Jose");
        map.put(5, "Ana");

        Runnable r1 = removeMap(map, 1);
        Runnable r2 = putMap(map, 6, "Joao");
        Runnable r3 = getMap(map, 1);


        Runnable lots1 = addLots(mapLots);
        Runnable lots2 = removeLots(mapLots);
        Runnable lots3 = getLots(mapLots);

        Runnable r4 = addMap(mapNormal);
        Runnable r5 = removeMap(mapNormal);
        Runnable r6 = getMap(mapNormal);

//        new Thread(r1).start();
//        new Thread(r2).start();
//        new Thread(r3).start();
//
//        new Thread(lots1).start();
//        new Thread(lots2).start();
//        new Thread(lots3).start();

        new Thread(r4).start();
        new Thread(r5).start();

        Thread threadR6 = new Thread(r6);
        threadR6.start();

        threadR6.join();
        new Thread(r6).start();

    }

    public static Runnable removeMap(ConcurrentHashMap<Integer, String> map, Integer key) {
        return () -> {
            try {
                System.out.println("Removing " + map.remove(key));
            } catch (Exception e) {
                System.out.println("Key not found");
            }
        };
    }

    public static Runnable putMap(ConcurrentHashMap<Integer, String> map, Integer key, String value) {
        return () -> {
            try {
                System.out.println("Putting " + value);
                map.put(key, value);
            } catch (Exception e) {
                System.out.println("Value not added");
            }
        };
    }

    public static Runnable getMap(ConcurrentHashMap<Integer, String> map, Integer key) {
        return () -> {
            try {
                System.out.println("Getting " + map.get(key));
            } catch (Exception e) {
                System.out.println("Key not found");
            }
        };
    }

    public static Runnable removeLots(ConcurrentHashMap<Integer, String> map) {
        return () -> {
            try {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Removing " + map.remove(i));
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        };
    }

    public static Runnable addLots(ConcurrentHashMap<Integer, String> map) {
        return () -> {
            try {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Putting " + i);
                    map.put(i, "Value: "+i);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        };
    }

    public static Runnable getLots(ConcurrentHashMap<Integer, String> map) {
        return () -> {
            try {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Getting " + map.get(i));
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        };
    }

    public static Runnable removeMap(Map<Integer, String> map) {
        return () -> {
            try {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Removing " + map.remove(i));
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        };
    }

    public static Runnable addMap(Map<Integer, String> map) {
        return () -> {
            try {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Putting " + i);
                    map.put(i, "Value: "+i);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        };
    }

    public static Runnable getMap(Map<Integer, String> map) {
        return () -> {
            try {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Getting " + map.get(i));
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        };
    }
}
