package studytrail.sprint2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueJava {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Diogo");

        System.out.println("Element: "+fila.element());
        System.out.println("Element: "+fila.element());

        System.out.println("Peek: "+fila.peek());
        System.out.println("Peek: "+fila.peek());

        System.out.println("=============================");

        System.out.println("Remove: "+fila.remove());
        System.out.println("Remove: "+fila.remove());

        System.out.println("Poll: "+fila.poll());
        System.out.println("Poll: "+fila.poll());

        System.out.println("=============================");

        try {
            System.out.println("Element: " + fila.element());
        } catch (Exception e) {
            System.out.println("Erro: "+e);
        }
        System.out.println("Peek: "+fila.peek());

        System.out.println("=============================");

        try {
            System.out.println("Remove: " + fila.remove());
        } catch (Exception e) {
            System.out.println("Erro Remove: "+e);
        }
        System.out.println("Poll: "+fila.poll());
    }
}
