package studytrail.sprint2;

import java.util.*;

public class Sprint2Java {
    public static void main(String[] args) {
        People people = new People("Ana", "123");
        People people2 = new People("João", "456");
        People people3 = new People("Ana", "123");
        Set<People> peopleList = Set.of(people, people2, new People("Maria", "789"));
        Optional<People> optionalPeople = Optional.empty();

        System.out.println(Objects.toString(people));

        System.out.println(Objects.equals(people3, people));

        System.out.println(Objects.deepEquals(people, people3));

        System.out.println(Objects.requireNonNull(people, "people is null"));

        System.out.println(optionalPeople);
        optionalPeople = Optional.of(people);
        System.out.println(optionalPeople);
        optionalPeople = Optional.ofNullable(searshPeople("456", peopleList));
        System.out.println(optionalPeople);
        optionalPeople = Optional
                .ofNullable(searshPeopleByName("Ana", peopleList))
                .filter(p -> p.getCpf().equals("456"));
        System.out.println(optionalPeople);
    }
    public static People searshPeople(String cpf, Set<People> peopleList) {
        People peopleFound = null;
        for (People people : peopleList) {
            if (Objects.equals(people.getCpf(), cpf)) {
                peopleFound = people;
            }
        }
        return peopleFound;
    }

    public static People searshPeopleByName(String name, Set<People> peopleList) {
        People peopleFound = null;
        for (People people : peopleList) {
            if (Objects.equals(people.getCpf(), name)) {
                peopleFound = people;
            }
        }
        return peopleFound;
    }
}
