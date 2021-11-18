package studytrail.sprint2;

import java.util.*;

public class SetJava {
    public static void main(String[] args) {
        Set<People> peoples = new HashSet<>();
        Set heterogeneous = new HashSet<>();
        People guest = new People("Ana", "123");
        Set<People> lotsOfPeople = new HashSet<>();

        Set<String> names = new HashSet<>();
        Set<String> names2 = new LinkedHashSet<>();
        Set<String> names3 = new TreeSet<>();
        SortedSet<Integer> numbers = new TreeSet<>();

        names.add("Maria");
        names.add("Ana");
        names.add("Joao");
        names.add("Carlos");

        names2.add("Maria");
        names2.add("Ana");
        names2.add("Joao");
        names2.add("Carlos");

        names3.add("Maria");
        names3.add("Ana");
        names3.add("Joao");
        names3.add("Carlos");

        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);

        peoples.add(guest);
        peoples.add(new People("Marcelo", "456"));
        peoples.add(new People("Ana", "789"));
        guest.setName("Maria");
        peoples.add(guest);
        peoples.add(null);
        peoples.add(null);

        Iterator<People> peopleIterator = peoples.iterator();

        System.out.println("=============================");
        System.out.println(peopleIterator.next());
        System.out.println("=============================");
        System.out.println(peopleIterator.next());
        System.out.println("=============================");
        System.out.println(peopleIterator.next());

//        for (int i = 0; i < 1000000; i++) {
//            lotsOfPeople.add(new People("Nome "+i, "CPF: "+i));
//        }

        heterogeneous.add(new People("Maria", "123"));
        heterogeneous.add("João");
        heterogeneous.add(null);
        heterogeneous.add(14862.0f);
        heterogeneous.add(7985); int integer = 157;

        System.out.println("=============================");
        for (People people : peoples) {
            System.out.println(people);
        }
        
        System.out.println("=============================");
        for (Object obj : heterogeneous) {
            System.out.println(obj);
        }

        for (People people : lotsOfPeople) {
            System.out.println(people);
        }

//        for (int i = 0; i < 500000; i++) {
//            lotsOfPeople.remove(new People("Nome "+i, "CPF: "+i));
//        }
//        for (People people : lotsOfPeople) {
//            System.out.println(people);
//        }

        System.out.println("=============================");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("=============================");
        for (String name : names2) {
            System.out.println(name);
        }

        names2.remove("Maria");

        System.out.println("=============================");
        for (String name : names2) {
            System.out.println(name);
        }

//        names2.add("Maria");
//
//        System.out.println("=============================");
//        for (String name : names2) {
//            System.out.println(name);
//        }

        System.out.println("=============================");
        for (String name : names3) {
            System.out.println(name);
        }

        System.out.println("=============================");
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println("Menor: "+numbers.first());
        System.out.println("Maior: "+numbers.last());

        System.out.println("SubSet: "+numbers.subSet(2, 4));
        System.out.println("HeadSet: "+numbers.headSet(4));
        System.out.println("TailSet: "+numbers.tailSet(3));
    }
}
