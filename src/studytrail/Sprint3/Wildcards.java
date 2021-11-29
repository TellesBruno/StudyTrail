package studytrail.Sprint3;

import studytrail.sprint2.People;

import java.util.*;

public class Wildcards {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "d", "e");
        Set<String> set = Set.of("a", "b", "c", "d", "e");
        ClasseGenerica<String> classeGenerica = new ClasseGenerica<>("João");
        ClasseGenerica<Integer> classeGenerica2 = new ClasseGenerica<>(1);
        ClasseGenerica<People> classeGenerica3 = new ClasseGenerica<>(new People("João", "123"));
        ClasseGenerica<List> classeGenerica4 = new ClasseGenerica<>(list);
        ClasseGenerica classeGenerica5 = new ClasseGenerica<>(1234);

        ClasseGenericaFilha<Integer> classeGenericaFilha = new ClasseGenericaFilha<>(10, 123);

        List<? extends People> employers = List.of(
                new Employer("João", "123", 1234),
                new Employer("Maria", "465", 4567),
                new Employer("Ana", "890", 9876));

        printCollection(list);
        printCollection(set);

        printCollectionPeople(employers);
    }

    static void printCollection(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }

    static void printCollectionPeople(Collection<? extends People> c) {
        for (People e : c) {
            System.out.println(e.getName());
        }
    }
}
