import java.util.InputMismatchException;
import java.util.Scanner;

public class ProjectTryCatch {
    public static void main(String[] args) {
        float firstValue;
        float secondValue;
        float result;
        Scanner scannerLocal = new Scanner(System.in);

        try {
            System.out.println("Digite o dividendo valor");
            firstValue = scannerLocal.nextFloat();

            System.out.println("Digite o divisor valor");
            secondValue = scannerLocal.nextFloat();

            if(secondValue == 0){
                throw new ArithmeticException();
            }



            result = firstValue/secondValue;
            System.out.println("O resultado é: " + result);

            System.exit(0);

        } catch (InputMismatchException exception){
            System.out.println("Erro!");
            System.out.println("Use apenas numeros Racionais ou Inteiros!");

        } catch (ArithmeticException exception){
            System.out.println("Divisior não pode ser zero!");
        } finally {
            System.out.println("Teste");
        }
    }
}
