package studytrail.sprintold;

import java.util.Arrays;
import java.util.List;

public class Bike extends Vehicle{
    private Integer CC;
    private Boolean cargoPod;
    protected Boolean directEdit = false;

    protected Bike(String brand, String model, String plate, Float mileage, String color, Integer CC, Boolean cargoPod){
        this.setAll(brand, model, plate, mileage, color, CC, cargoPod);
    }

    public Integer getCC() { return CC; }
    public void setCC(Integer CC) { this.CC = CC; }

    public Boolean getCargoPod(){ return cargoPod; }
    public void setCargoPod(boolean cargoPod) { this.cargoPod = cargoPod; }

    public void setAll(String brand, String model, String plate, Float mileage, String color, Integer CC, Boolean cargoPod) {
        this.setAll(brand, model, plate, mileage, color);
        this.setCC(CC);
        this.setCargoPod(cargoPod);
    }

    public List getAll(){
        return Arrays.asList(getBrand(), getModel(), getPlate(), getMileage(), getColor(), getCC(), getCargoPod());
    }

    protected void drive(){
        System.out.println("Pilotando minha moto!");
    }
}
