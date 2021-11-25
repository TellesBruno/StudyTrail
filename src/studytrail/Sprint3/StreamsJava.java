package studytrail.Sprint3;

import studytrail.sprint2.People;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsJava {
    public static void main(String[] args) {
        Consumer<Object> print = System.out::print;
        Consumer<Object> println = System.out::println;
        Stream<String> stream = Stream.of("a", "b", "c");
        List<String> list = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");
        Stream<String> stream1 = list.stream();
        Stream<People> peopleStream = Stream.
                of(new People("Ana", "123"), new People("Bianca", "456"), new People("Cristina", "789"));
        Stream<People> peopleStream2 = Stream.
                of(new People("Ana", "123"), new People("Bianca", "456"), new People("Cristina", "789"));

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        stream.forEach(println);
        try{
            stream.forEach(println);
        } catch(Exception e){
            System.out.println("Exception: "+e);
        }

        System.out.println("\nStream: ");
        list.stream().forEach(print);
        System.out.println("\nStream parallel: ");
        list.parallelStream().forEach(print);

        System.out.println("\n=======================");

        //map
        stream1 = list.stream().map(String::toUpperCase);
        stream1.forEach(print);
        System.out.println("\n");
        list.stream().map(String::toUpperCase).forEach(print);
        System.out.println("\n=======================");

        Stream<String> peopleNameStream = peopleStream.map(People::getName);
        List<String> nameList = peopleNameStream.toList();
        //peopleNameStream.forEach(System.out::println);
        System.out.println(nameList);

        System.out.println("\n=======================");

        //flatMap
        Stream<String> flatMapStream = peopleStream2.flatMap(p -> Stream.of(p.getName(), p.getCpf()));
        List<String> flatNameList = flatMapStream.toList();
        //flatMapStream.forEach(System.out::println);
        System.out.println(flatNameList);

        //allMatch and anyMatch
        System.out.println("All Match: "+nameList
                .stream().allMatch(a -> Objects.equals(a, "Ana")));
        System.out.println("Any Match: "+nameList
                .stream().anyMatch(a -> Objects.equals(a, "Ana")));

        //collect
        List<Integer> collectStream = Stream.of(1,2,3,4).map(value -> value*value).collect(Collectors.toList());
        System.out.println(collectStream.get(0));

        //

//        //paralelismo???
//        for (int i = 0; i < 10; i++) {
//            list1.add(i);
//            list2.add(i);
//        }
//        list1.parallelStream().forEach((i) -> {
//            System.out.println("Lista 1: "+i);
//        });
//        list2.parallelStream().forEach((i) -> {
//            System.out.println("Lista 2: "+i);
//        });
    }
}
