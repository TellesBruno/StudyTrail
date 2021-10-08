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
        Car mostMileage = new Car();
        Car lesserMileage  = new Car();

        int increment = 0;

        Car[] cars = new Car[3];
        cars[0] = new Car();
        cars[1] = new Car();
        cars[2] = new Car();

        ProjectOOP.separator();

        //sobrecarga
        Car.myCar(cars[0].getAll());
        Car.myCar(cars[0].getBrand(), cars[0].getModel(), cars[0].getPlate(), cars[0].getMileage());
        Car.myCar(cars[1].getAll());

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
    }
}
