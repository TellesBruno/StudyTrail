package studytrail.sprint2;

import java.util.Stack;

public class StackJava {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Ana");
        stack.push("Bia");
        stack.push("Carlos");

        System.out.println("=============================");

        System.out.println("Peek: "+stack.peek());

        System.out.println("=============================");

        for (String name : stack) {
            System.out.println(name);
        }

        System.out.println("=============================");

        System.out.println("Pop: "+stack.pop());
        System.out.println("Pop: "+stack.pop());
        System.out.println("Pop: "+stack.pop());

        System.out.println("=============================");

        try {
            System.out.println("Pop: " + stack.pop());
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
}
