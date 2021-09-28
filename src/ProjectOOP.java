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
        Car mostMileage = new Car("","","", 0f);
        Car lesserMileage  = new Car("","","", 0f);

        int increment = 0;

        Car[] veicles = new Car[3];
        veicles[0] = new Car("Volkswagen", "Fusca", "abc1234", 50725.7f);
        veicles[1] = new Car("Fiat", "147", "omn1234", 80495.7f);
        veicles[2] = new Car("Ford", "Chevette", "xyz1234", 68465.7f);

        ProjectOOP.separator();

//        lesserMileage = veicles[0];
//        for(int i = 0; i < veicles.length; i++){
        for (Car veicle:veicles
             ) {
//            if(mostMileage.getMileage() < veicles[i].getMileage()){
            if(mostMileage.getMileage() < veicle.getMileage()){
//                mostMileage.setMileage(veicles[i].getMileage());
                mostMileage.setMileage(veicle.getMileage());
                mostMileage.setModel(veicle.getModel());
                mostMileage.setBrand(veicle.getBrand());
                mostMileage.setPlate(veicle.getPlate());
            }
            if(lesserMileage.getMileage() > veicle.getMileage()){
                lesserMileage.setMileage(veicle.getMileage());
                lesserMileage.setModel(veicle.getModel());
                lesserMileage.setBrand(veicle.getBrand());
                lesserMileage.setPlate(veicle.getPlate());
            }

//            switch (condição){
//                case 1:
//                    tratamento
//                    break;
//                case 2:
//                    tratamento
//                    break;
//            }

            System.out.println(veicle.getModel());
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
