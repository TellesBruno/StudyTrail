package studytrail.sprintold;

import java.util.Arrays;
import java.util.List;

public abstract class Vehicle {
    private String brand;
    private String model;
    private String plate;
    private Float mileage;
    private String color;

    public String getBrand(){
        return  (brand);
    }
    public void setBrand(String newBrand){
        brand = newBrand;
    }

    public String getModel(){
        return (model);
    }
    public void  setModel(String newModel){
        model = newModel;
    }

    public String getPlate(){
        return (plate);
    }
    public void  setPlate(String newPlate){
        plate = newPlate;
    }

    public Float getMileage(){
        return (mileage);
    }
    public void setMileage(Float newMileage){
        mileage = newMileage;
    }

    public String getColor() { return (color); }
    public void setColor(String newColor) { color = newColor; }


    public List getAll(){
        return Arrays.asList(brand, model, plate, mileage);
    }

    public void setAll(String newBrand, String newModel, String newPlate, Float newMileage, String newColor){
        brand = newBrand;
        model = newModel;
        plate = newPlate;
        mileage = newMileage;
        color = newColor;
    }

    public void foward(){ System.out.println("Indo para frente");}
    public void backward(){System.out.println("Indo para trás");}
    public void turnLeft(){System.out.println("Virando para esquerda");}
    public void turnRight(){System.out.println("Virando para direita");}



    public static void myVehicle(List myVehicle){
        System.out.println("1 - Meu veiculo: " + myVehicle);
    }

    public static void myVehicle(String vehicleBrand, String vehicleModel, String vehiclePlate, Float vehicleMileage){//sobrecarga
        System.out.println("2 - Meu Veiculo: ["+vehicleBrand+", "+vehicleModel+", "+vehiclePlate+", "+vehicleMileage+"]");
    }

}
