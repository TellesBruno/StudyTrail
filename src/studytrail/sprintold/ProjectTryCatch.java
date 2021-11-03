package studytrail.sprintold;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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

            if (secondValue == 0) {
                throw new ArithmeticException();
            }


            result = firstValue / secondValue;
            System.out.println("O resultado é: " + result);

        } catch (InputMismatchException exception) {
            System.out.println("Erro!");
            System.out.println("Use apenas numeros Racionais ou Inteiros!");

        } catch (ArithmeticException exception) { //unchecked
            System.out.println("Divisior não pode ser zero!");
        }
         finally {
            System.out.println("Bloco finally, executa sempre no final do try chatch");
        }

        try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
        } catch (Exception ex){
            System.out.println("Arquivo não encontrado!");
        }

        //Exemplo de catch de 2 exeções. Suportado a partir do java SE 7;
        /*catch (TipeOfExeptionOne|TipeOfExeptionTwo ex){
            System.out.println("Mesmo tratamento para ambas as exceções");
        }*/

    }
}
