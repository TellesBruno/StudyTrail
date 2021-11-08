package studytrail.sprint2;

import java.util.HashSet;
import java.util.Set;

public class SetJava {
    public static void main(String[] args) {
        Set<People> peoples = new HashSet<People>();
        Set heterogeneous = new HashSet();
        People guest = new People("Ana", "123");
        Set<People> lotsOfPeople = new HashSet<People>();

        peoples.add(guest);
        peoples.add(new People("Marcelo", "456"));
        peoples.add(new People("Ana", "789"));
        guest.setName("Maria");
        peoples.add(guest);
        peoples.add(null);
        peoples.add(null);

        for (int i = 0; i < 1000000; i++) {
            lotsOfPeople.add(new People("Nome "+i, "CPF: "+i));
        }

        heterogeneous.add(new People("Maria", "123")); //continuar a parte de implementação raw
        heterogeneous.add("João");
        heterogeneous.add(null);
        heterogeneous.add(14862.0f);
        heterogeneous.add(7985);

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

        for (int i = 0; i < 500000; i++) {
            lotsOfPeople.remove(new People("Nome "+i, "CPF: "+i));
        }
        for (People people : lotsOfPeople) {
            System.out.println(people);
        }
    }
}
