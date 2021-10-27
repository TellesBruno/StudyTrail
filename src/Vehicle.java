import java.util.Arrays;
import java.util.List;

public abstract class Vehicle {
    private String brand;
    private String model;
    private String plate;
    private float mileage;
    private String color;

    String getBrand(){
        return  (brand);
    }
    void setBrand(String newBrand){
        brand = newBrand;
    }

    String getModel(){
        return (model);
    }
    void  setModel(String newModel){
        model = newModel;
    }

    String getPlate(){
        return (plate);
    }
    void  setPlate(String newPlate){
        plate = newPlate;
    }

    float getMileage(){
        return (mileage);
    }
    void setMileage(float newMileage){
        mileage = newMileage;
    }

    String getColor() { return (color); }
    void setColor(String newColor) { color = newColor; }


    List getAll(){
        return Arrays.asList(brand, model, plate, mileage);
    }

    void setAll(String newBrand, String newModel, String newPlate, float newMileage, String newColor){
        brand = newBrand;
        model = newModel;
        plate = newPlate;
        mileage = newMileage;
        color = newColor;
    }

    void foward(){ System.out.println("Indo para frente");}
    void backward(){System.out.println("Indo para trás");}
    void turnLeft(){System.out.println("Virando para esquerda");}
    void turnRight(){System.out.println("Virando para direita");}



    public static void myVehicle(List myVehicle){
        System.out.println("1 - Meu veiculo: " + myVehicle);
    }

    public static void myVehicle(String vehicleBrand, String vehicleModel, String vehiclePlate, float vehicleMileage){
        System.out.println("2 - Meu Veiculo: ["+vehicleBrand+", "+vehicleModel+", "+vehiclePlate+", "+vehicleMileage+"]");
    }

}
