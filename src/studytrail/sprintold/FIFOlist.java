package studytrail.sprintold;

import java.util.LinkedList;

public class FIFOlist {

    public static void main(String[] args) {
        LinkedList<String> linkedListName = new LinkedList<String>();
        entrouNaFila("Maria", linkedListName);
        entrouNaFila("Carlos", linkedListName);
        entrouNaFila("João", linkedListName);
        entrouNaFila("Ana", linkedListName);

        saiuNaFila(linkedListName);
        saiuNaFila(linkedListName);
        saiuNaFila(linkedListName);
    }

    static void entrouNaFila(String name, LinkedList list){
        System.out.println(name + " entrou na fila!");
        list.addLast(name);
        System.out.println("Fila atual: " + list);
    }

    static void saiuNaFila(LinkedList list){
        System.out.println(list.getFirst() + " foi atendino e saiu da fila!");
        list.removeFirst();
        System.out.println("Fila atual: " + list);
    }
}
