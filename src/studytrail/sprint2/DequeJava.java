package studytrail.sprint2;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeJava {
    public static void main(String[] args) {

        //FilaDeque();
        //PilhaDeque();
        //OutroDeque();
    }

    static void FilaDeque() {
        Deque<String> filaDeque = new ArrayDeque<>();

        filaDeque.addLast("Ana");
        filaDeque.offerLast("Bia");
        filaDeque.add("Carlos");
        filaDeque.offer("Diego");

        System.out.println("=============================");

        System.out.println("Peek First: "+filaDeque.peekFirst());
        System.out.println("Peek: "+filaDeque.peek());
        System.out.println("Get First: "+filaDeque.getFirst());
        System.out.println("Element: "+filaDeque.element());

        System.out.println("=============================");

        for(String s: filaDeque) {
            System.out.println(s);
        }

        System.out.println("=============================");

        System.out.println("Remove First: "+filaDeque.removeFirst());
        System.out.println("Remove: "+filaDeque.remove());

        System.out.println("Poll First: "+filaDeque.pollFirst());
        System.out.println("Poll"+filaDeque.poll());

        System.out.println("=============================");

        try {
            System.out.println("Element: " + filaDeque.element());
        } catch (Exception e) {
            System.out.println("Erro Element: "+e);
        }
        System.out.println("Peek: "+filaDeque.peek());

        System.out.println("=============================");

        try {
            System.out.println("Remove: " + filaDeque.remove());
        } catch (Exception e) {
            System.out.println("Erro Remove: "+e);
        }
        System.out.println("Poll: "+filaDeque.poll());
        try {
            System.out.println("Remove First: " + filaDeque.removeFirst());
        } catch (Exception e) {
            System.out.println("Erro Remove First: "+e);
        }
        System.out.println("Poll First: "+filaDeque.pollFirst());
    }

    static void PilhaDeque() {
        Deque<String> pilhaDeque = new ArrayDeque<>();

        pilhaDeque.addFirst("Ana");
        pilhaDeque.offerFirst("Bia");
        pilhaDeque.push("Carlos");
        pilhaDeque.push("Diego");

        System.out.println("=============================");

        System.out.println("Peek: "+pilhaDeque.peek());
        System.out.println("Peek First: "+pilhaDeque.peekFirst());

        System.out.println("=============================");

        for(String s: pilhaDeque) {
            System.out.println(s);
        }
        System.out.println("=============================");

        System.out.println("Remove: "+pilhaDeque.remove());
        System.out.println("Remove First: "+pilhaDeque.removeFirst());

        System.out.println("Pop: "+pilhaDeque.pop());
        System.out.println("Poll First: "+pilhaDeque.pollFirst());

        System.out.println("=============================");

        System.out.println("Peek: "+pilhaDeque.peek());

        System.out.println("=============================");

        try {
            System.out.println("Remove: " + pilhaDeque.remove());
        } catch (Exception e) {
            System.out.println("Erro Remove: "+e);
        }
        try {
            System.out.println("Remove First: " + pilhaDeque.removeFirst());
        } catch (Exception e) {
            System.out.println("Erro Remove First: "+e);
        }
        System.out.println("Poll: "+pilhaDeque.poll());
    }

    static void OutroDeque() {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Ana");
        deque.addLast("Bia");
        deque.addFirst("Carlos");
        deque.addLast("Diego");

        System.out.println("Peek First: "+deque.peekFirst());
        System.out.println("Peek Last: "+deque.peekLast());

        System.out.println("Get First: "+deque.getFirst());
        System.out.println("Get Last: "+deque.getLast());

        System.out.println("=============================");

        for(String s: deque) {
            System.out.println(s);
        }

        System.out.println("=============================");

        System.out.println("Remove First: "+deque.removeFirst());
        System.out.println("Remove Last: "+deque.removeLast());

        System.out.println("Poll First: "+deque.pollFirst());
        System.out.println("Poll Last: "+deque.pollLast());

        System.out.println("=============================");

        try {
            System.out.println("Element: " + deque.element());
        } catch (Exception e) {
            System.out.println("Erro Element: "+e);
        }
        System.out.println("Peek: "+deque.peek());

        System.out.println("=============================");

        try {
            System.out.println("Remove First: " + deque.removeFirst());
        } catch (Exception e) {
            System.out.println("Erro Remove First: "+e);
        }
        System.out.println("Poll First: "+deque.pollFirst());
        try {
            System.out.println("Remove Last: " + deque.removeLast());
        } catch (Exception e) {
            System.out.println("Erro Remove Last: "+e);
        }
        System.out.println("Poll Last: "+deque.pollLast());


    }
}
