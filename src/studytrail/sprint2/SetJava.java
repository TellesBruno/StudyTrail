package studytrail.sprint2;

import java.util.HashSet;
import java.util.Set;

public class SetJava {
    public static void main(String[] args) {
        Set<People> peoples = new HashSet();
        People guest = new People("Ana", "123");

        peoples.add(guest);
        peoples.add(new People("Marcelo", "456"));
        peoples.add(new People("Ana", "789"));
        guest.setName("Maria");
        peoples.add(guest);
        peoples.add(null);
        peoples.add(null);

        for (People people : peoples) {
            System.out.println(people);
        }
    }
}
