package studytrail.sprintold;

import java.util.Arrays;
import java.util.List;

public class Bike extends Vehicle{
    private int CC;
    private boolean cargoPod;
    protected boolean directEdit = false;

    protected Bike(String brand, String model, String plate, float mileage, String color, int CC, boolean cargoPod){
        this.setAll(brand, model, plate, mileage, color, CC, cargoPod);
    }

    public int getCC() { return CC; }
    public void setCC(int CC) { this.CC = CC; }

    public boolean getCargoPod(){ return cargoPod; }
    public void setCargoPod(boolean cargoPod) { this.cargoPod = cargoPod; }

    public void setAll(String brand, String model, String plate, float mileage, String color, int CC, boolean cargoPod) {
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
