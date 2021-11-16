package studytrail.sprint2;

import studytrail.sprintold.Car;

import java.util.*;

public class MapJava {
    public static void main(String[] args) {

        Car[] cars = new Car[4];
        People[] people = new People[3];
        People guest = new People("João", "123");

        cars[0] = new Car("Mercedes", "cba","abc1234", 84136.4f, "blue", 4,"FWD", "Sedan");
        cars[1] = new Car("Ford", "fed", "def5678", 65651.1f, "red", 2, "RWD", "Muscle");
        cars[2] = new Car("Fiat", "zyx", "xtz9876", 56870.9f, "silver", 4, "AWD","SUV");
        cars[3] = new Car("Chevrolet", "onm", "mno1234", 52974.5f, "blue", 4, "RWD", "Muscle");

        people[0] = new People("João", "123");
        people[1] = new People("Maria", "456");
        people[2] = new People("José", "789");



        Map<Car, People> map = new HashMap<>();
        //Map<Car,People> map = new Hashtable<>();

        map.put(cars[0], people[0]);
        map.put(cars[1], people[2]);
        map.put(cars[2], people[1]);
        map.put(cars[3], people[1]);
        map.put(cars[3], null);
        map.put(cars[2], null);
        map.put(null, people[0]);
        map.put(null, people[2]);

        System.out.println("==============================");

        System.out.println(map.get(cars[0]).hashCode());
        System.out.println(map.get(cars[1]).hashCode());

        System.out.println(people[0].hashCode());
        System.out.println(people[1].hashCode());
        System.out.println(people[2].hashCode());

        System.out.println("==============================");

        Integer a = 0;
        Integer b = 0;
        System.out.println(a.equals(b));

        People p = guest;
        People p2 = guest;
        System.out.println(p.equals(p2));

        System.out.println(guest.equals(people[0]));


        System.out.println("==============================");

        for (Map.Entry<Car, People> entry: map.entrySet()) {
            if(entry.getKey() != null){
                System.out.println("Car: "+entry.getKey().getBrand());
            } else {
                System.out.println("Car: Null");
            }
            if (entry.getValue() != null) {
                System.out.println("Owner: " + entry.getValue().getName());
            } else {
                System.out.println("Owner: Null");
            }
            System.out.println("==============================");
        }

        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(2, people[0].getName());
        sortedMap.put(3, people[2].getName());
        sortedMap.put(4, people[1].getName());
        sortedMap.put(5, people[1].getName());
        sortedMap.put(1, people[0].getName());
        System.out.println(sortedMap);
//        sortedMap.remove(2);
//        System.out.println(sortedMap);

        System.out.println("==============================");

        System.out.println("Menor chave: "+sortedMap.firstKey());
        System.out.println("Maior chave: "+sortedMap.lastKey());

        System.out.println("SubMap: "+sortedMap.subMap(2, 4));
        System.out.println("HeadMap: "+sortedMap.headMap(3));
        System.out.println("TailMap: "+sortedMap.tailMap(3));
    }
}
