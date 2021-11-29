package studytrail.Sprint3;

import studytrail.sprint2.People;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;
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

        System.out.println("\n=======================");


        //allMatch and anyMatch
        System.out.println("All Match: "+nameList
                .stream().allMatch(a -> Objects.equals(a, "Ana")));
        System.out.println("Any Match: "+nameList
                .stream().anyMatch(a -> Objects.equals(a, "Ana")));

        System.out.println("\n=======================");


        //collect
        List<Integer> collectStream = Stream.of(1,2,3,4).map(value -> value*value).collect(Collectors.toList());
        System.out.println(collectStream.get(3));

        System.out.println("\n=======================");

        //FindAny and findFirst
        Stream.of(1,2,3,4,5,6).parallel().findAny().ifPresent(println);
        Stream.of(1,2,3,4,5,6).findFirst().ifPresent(println);

        System.out.println("\n=======================");

        //iterate and generate
        Supplier<Double> supplier = Math::random;
        Stream.generate(supplier).limit(10).forEach(println);
        Stream.iterate(0, n -> n + 2).limit(10).forEach(println);

        System.out.println("\n=======================");

        //max and min
        Stream.of(1,2,3,4,5,6).max(Integer::compareTo).ifPresent(println);
        Stream.of(1,2,3,4,5,6).min(Integer::compareTo).ifPresent(println);

        System.out.println("\n=======================");

        //reduce
        System.out.println(Stream.of(1,2,3,4,5,6).reduce(0, Integer::sum));
        System.out.println(Stream.of("Olá ", "bom ", "dia", "!").reduce("String única: ", String::concat));

        System.out.println("\n=======================");

        //sorted
        Stream.of(9,4,8,7,1,3,5,2,0,6).sorted(Integer::compareTo).forEach(print);
        flatNameList.stream().sorted().forEach(println);

        System.out.println("\n=======================");

        //parallel Stream como eu queria ter feito do começo:
        for (int i = 0; i < 1000; i++) {
            list1.add(i);
            list2.add(i);
        }
        parallerStreamWithThread(list1, "Lista 1: ");
        parallerStreamWithThread(list2, "Lista 2: ");
        parallerStreamWithThread(list1, "Lista 3: ");
        parallerStreamWithThread(list2, "Lista 4: ");
        parallerStreamWithThread(list1, "Lista 5: ");
        parallerStreamWithThread(list2, "Lista 6: ");
    }

    public static void parallerStreamWithThread(List<Integer> list, String message){
        Thread thread = new Thread(() -> {
            list.parallelStream().forEach(i -> {
                System.out.println(message+i);
            });
        });
        thread.start();
    }
}
