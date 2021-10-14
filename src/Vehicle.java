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

    public static void myCar(List myCar){
        System.out.println("1 - Meu carro: " + myCar);
    }

    public static void myCar(String carBrand, String carModel, String carPlate, float carMileage){
        System.out.println("2 - Meu carro: ["+carBrand+", "+carModel+", "+carPlate+", "+carMileage+"]");
    }

}
