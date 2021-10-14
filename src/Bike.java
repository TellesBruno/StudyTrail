public class Bike extends Vehicle{
    private int CC;
    private boolean cargoPod;
    private String type;

    Bike(String brand, String model, String plate, float mileage, String color, int CC, boolean cargoPod, String type){
        this.setAll(brand, model, plate, mileage, color, CC, cargoPod, type);
    }

    int getCC() { return CC; }
    void setCC(int CC) { this.CC = CC; }

    boolean getCargoPod(){ return cargoPod; }
    void setCargoPod(boolean cargoPod) { this.cargoPod = cargoPod; }

    String getType() { return type; }
    void setType(String type) { this.type = type; }

    void setAll(String brand, String model, String plate, float mileage, String color, int CC, boolean cargoPod, String type) {
        this.setAll(brand, model, plate, mileage, color);
        this.setCC(CC);
        this.setCargoPod(cargoPod);
        this.setType(type);
    }
}
