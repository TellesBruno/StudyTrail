import java.util.LinkedList;

public class LIFOlist {

    public static void main(String[] args) {
        LinkedList<Email> emailList = new LinkedList<Email>();
        newEmail(new Email("Maria", "Olá", "18/10/21"), emailList);
        newEmail(new Email("João", "Olá", "19/10/21"), emailList);
        newEmail(new Email("Carlos", "Olá", "20/10/21"), emailList);
        newEmail(new Email("Ana", "Olá", "21/10/21"), emailList);

        deleteEmail(emailList);
        deleteEmail(emailList);
        deleteEmail(emailList);

    }

    static void newEmail(Email email, LinkedList list){
        System.out.println("Novo email de: " + email.getSender());
        list.addFirst(email);
    }

    static void deleteEmail(LinkedList list){
        String temp = ((Email)list.getFirst()).getSender();
        System.out.println("Email de: \"" + temp + "\" excluido!");
        list.removeFirst();
    }
}