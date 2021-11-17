package studytrail.sprintold;

import java.util.Arrays;
import java.util.List;

public class Car extends Vehicle{
    private Integer doors;
    private String driveSystem;
    private String type;

    public Car(String brand, String model, String plate, Float mileage, String color, Integer doors, String driveSystem, String type){
        this.setAll(brand, model, plate, mileage, color, doors, driveSystem, type);
    }

    public Integer getDoors() { return doors; }
    public void setDoors(Integer doors) { this.doors = doors; }

    public String getDriveSystem(){ return driveSystem; }
    public void setDriveSystem(String driveSystem) { this.driveSystem = driveSystem; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public List getAll(){
        return Arrays.asList(getBrand(), getModel(), getPlate(), getMileage(), getColor(), getDoors(), getDriveSystem(), getType());
    }

    public void setAll(String brand, String model, String plate, Float mileage, String color, Integer doors, String driveSystem, String type) {
        this.setAll(brand, model, plate, mileage, color);
        this.setDoors(doors);
        this.setDriveSystem(driveSystem);
        this.setType(type);
    }

    public static void myVehicle(String vehicleBrand, String vehicleModel, String vehiclePlate, Float vehicleMileage){//sobrescrita
        System.out.println("3 - Meu Carro: ["+vehicleBrand+", "+vehicleModel+", "+vehiclePlate+", "+vehicleMileage+"]");
    }
}