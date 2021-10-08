public class Car extends Vehicle{
    private String doors;
    private String driveSystem;
    private String type;

    Car(String brand, String model, String plate, float mileage, String color, String doors, String driveSystem, String type){
        this.setAll(brand, model, plate, mileage, color, doors, driveSystem, type);
    }

    String getDoors() { return doors; }
    void setDoors(String doors) { this.doors = doors; }

    String getDriveSystem(){ return driveSystem; }
    void setDriveSystem(String driveSystem) { this.driveSystem = driveSystem; }

    String getType() { return type; }
    void setType(String type) { this.type = type; }

    void setAll(String brand, String model, String plate, float mileage, String color, String doors, String driveSystem, String type) {
        this.setAll(brand, model, plate, mileage, color);
        this.setDoors(doors);
        this.setDriveSystem(driveSystem);
        this.setType(type);
    }
}
