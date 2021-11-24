package studytrail.Sprint3;

import studytrail.sprint2.People;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.BaseStream;
import java.util.stream.Stream;

public class StreamsJava {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a", "b", "c");
        stream.forEach(System.out::println);
        List<String> list = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");
        Stream<String> stream1 = list.stream();
        Stream<People> peopleStream = Stream.
                of(new People("Ana", "123"), new People("Bianca", "456"), new People("Cristina", "789"));
        Stream<People> peopleStream2 = Stream.
                of(new People("Ana", "123"), new People("Bianca", "456"), new People("Cristina", "789"));


        try{
            stream.forEach(System.out::println);
        } catch(Exception e){
            System.out.println("Exception: "+e);
        }

        System.out.println("\nStream: ");
        list.stream().forEach(System.out::print);
        System.out.println("\nStream parallel: ");
        list.parallelStream().forEach(System.out::print);

        System.out.println("\n=======================");

        //map
        stream1 = list.stream().map(String::toUpperCase);
        stream1.forEach(System.out::print);
        System.out.println("\n");
        list.stream().map(String::toUpperCase).forEach(System.out::print);
        System.out.println("\n=======================");

        Stream<String> peopleNameStream = peopleStream.map(People::getName);
        List<String> nameList = peopleNameStream.toList();
        //peopleNameStream.forEach(System.out::print);

        System.out.println("\n=======================");

        //flatMap
        Stream<String> flatMapStream = nameList.stream().flatMap(name -> Stream.of(name));
        flatMapStream.forEach(System.out::println);
    }
}
