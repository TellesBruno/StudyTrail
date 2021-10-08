import java.util.InputMismatchException;
import java.util.Scanner;

public class ProjectTryCatch {
    public static void main(String[] args) {
        float firstValue;
        float secondValue;
        float result;
        boolean retry = true;
        Scanner scannerLocal = new Scanner(System.in);

        try {
            System.out.println("Digite o dividendo valor");
            firstValue = scannerLocal.nextFloat();

            System.out.println("Digite o divisor valor");
            secondValue = scannerLocal.nextFloat();

            if (secondValue == 0) {
                throw new ArithmeticException();
            }


            result = firstValue / secondValue;
            System.out.println("O resultado é: " + result);

        } catch (InputMismatchException exception) {
            retry = true;
            System.out.println("Erro!");
            System.out.println("Use apenas numeros Racionais ou Inteiros!");

        } catch (ArithmeticException exception) { //unchecked
            System.out.println("Divisior não pode ser zero!");
        }
        //Exemplo de catch de 2 exeções. Suportado a partir do java SE 7;
        /*catch (TipeOfExeptionOne|TipeOfExeptionTwo ex){
            System.out.println("Mesmo tratamento para ambas as exceções");
        }*/ finally {
            System.out.println("Teste");
        }

    }
}
