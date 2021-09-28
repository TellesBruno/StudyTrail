import java.util.Arrays;
import java.util.List;

public class Car {
    private String brand;
    private String model;
    private String plate;
    private float mileage;

    Car(String iniBrand, String iniModel, String iniPlate, float iniMileage){
        brand = iniBrand;
        model = iniModel;
        plate = iniPlate;
        mileage = iniMileage;
    };

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
        return (model);
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

    List getAll(){
        return Arrays.asList(brand, model, plate, mileage);
    }

    void setAll(String newBrand, String newModel, String newPlate, float newMileage){
        brand = newBrand;
        model = newModel;
        plate = newPlate;
        mileage = newMileage;
    }
}
