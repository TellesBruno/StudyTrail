public class ProjectOOP {
    public static void separator(){
        System.out.println("=====================//=====================");
    }

    public static int incrementer(int cont){
        cont++;
        System.out.println("Valor incrementado para " + cont);
        return(cont);
    }

    public static void main(String[] args) {
        Car mostMileage = new Car("","","",0f,"",0,"","");
        Car lesserMileage  = new Car("","","",0f,"",0,"","");

        //mutável
        Skate mySkate = new Skate();

        int increment = 0;

        Car[] cars = new Car[3];
        //imutável
        cars[0] = new Car("abc", "cba","abc1234", 84136.4f, "blue", 2,"FWD", "Sedan");
        cars[1] = new Car("def", "fed", "def5678", 65651.1f, "red", 2, "RWD", "muscle");
        cars[2] = new Car("xyz", "zyx", "xtz9876", 56870.9f, "silver", 4, "AWD","SUV");

        ProjectOOP.separator();

        //sobrecarga
        Car.myVehicle(cars[0].getAll());
        Car.myVehicle(cars[0].getBrand(), cars[0].getModel(), cars[0].getPlate(), cars[0].getMileage());
        Car.myVehicle(cars[1].getAll());

        lesserMileage = cars[0];
        for (Car car:cars
             ) {
            if(mostMileage.getMileage() < car.getMileage()){
                mostMileage.setMileage(car.getMileage());
                mostMileage.setModel(car.getModel());
                mostMileage.setBrand(car.getBrand());
                mostMileage.setPlate(car.getPlate());
            }
            if(lesserMileage.getMileage() > car.getMileage()){
                lesserMileage.setMileage(car.getMileage());
                lesserMileage.setModel(car.getModel());
                lesserMileage.setBrand(car.getBrand());
                lesserMileage.setPlate(car.getPlate());
            }

            System.out.println(car.getModel());
        }

        ProjectOOP.separator();

        System.out.println(mostMileage.getAll());
        System.out.println(lesserMileage.getAll());

        ProjectOOP.separator();

        increment = incrementer(increment);
        increment = incrementer(increment);
        increment = incrementer(increment);
        increment = incrementer(increment);

        try {
            System.out.println(mySkate.getColor().toUpperCase());
            System.out.println(mySkate.getSize().toUpperCase());
        } catch (Exception ex) {
            //Exceção unchecked
            System.out.println("Exceção: "+ ex);
        }
    }
}
