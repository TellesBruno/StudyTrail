package studytrail.sprint1;

import studytrail.sprint2.People;
import studytrail.sprintold.Car;

public class AccessModifiers {
    public static void main(String[] args) {
        Car car = new Car("mno", "onm", "mno1234", 52974.5f, "blue", 4, "RWD", "Muscle");
        People people = new People("João", "12345678900");
        //Bike bike = new Bike("ghi","ihg", "ghi1234", 48612.1f, "green", 750, false);
        Motorcycle motorcycle = new Motorcycle("ghi","ihg", "ghi1234", 48612.1f, "green", 750, false);
        System.out.println("Carro: "+car.getAll());
        //motorcycle.drive();
        motorcycle.riding();
    }
}
