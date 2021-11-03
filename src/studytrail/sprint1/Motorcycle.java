package studytrail.sprint1;

import studytrail.sprintold.Bike;

public class Motorcycle extends Bike {
    protected Motorcycle(String brand, String model, String plate, float mileage, String color, int CC, boolean cargoPod) {
        super(brand, model, plate, mileage, color, CC, cargoPod);
    }

    public void riding(){
        directEdit = true;
        this.drive();
        System.out.println("Direct Edit: " + directEdit);
    }
}
