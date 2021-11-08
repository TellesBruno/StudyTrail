package studytrail.sprint2;

import studytrail.sprintold.Car;

import java.util.ArrayList;
import java.util.List;

public class ListJava {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        List<People> peoples = new ArrayList<>();

        List<Integer> integers = new ArrayList<>();

        cars.add(new Car("abc", "cba","abc1234", 84136.4f, "blue", 4,"FWD", "Sedan"));
        cars.add(new Car("def", "fed", "def5678", 65651.1f, "red", 2, "RWD", "Muscle"));
        cars.add(new Car("xyz", "zyx", "xtz9876", 56870.9f, "silver", 4, "AWD","SUV"));
        cars.add(new Car("mno", "onm", "mno1234", 52974.5f, "blue", 4, "RWD", "Muscle"));

        cars.remove(1);

        peoples.add(new People("João", "123"));
        peoples.add(new People("Maria", "456"));
        peoples.add(new People("José", "789"));

        peoples.add(new People("Maria", "456"));

        System.out.println(peoples.get(1).equals(peoples.get(3)));

        peoples.remove(new People("José", "789"));

        for (Car car : cars) {
            System.out.println(car.getBrand());
        }

        for (People people : peoples) {
            System.out.println(people.getName());
        }
        System.out.println(peoples.get(1).getName());

        for (int i = 0; i < 90000000; i++) {
            integers.add(i);
        }

        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
