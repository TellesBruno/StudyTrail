package studytrail.sprintold;

import java.util.ArrayList;

public class ProjevtReferenceCopy {
    public static void main(String []args){

        ProjevtReferenceCopy referenceCopy = new ProjevtReferenceCopy();

        ArrayList list = new ArrayList();
        int a, b, c;

        a = 1;
        b = 2;
        c = 3;

        System.out.println("A: " + a + ", B: " + b);
        System.out.println("A = B");
        a = b;
        System.out.println("A = 4");
        a = 4;

        System.out.println("A: " + a + ", B: " + b);

        list.add(a);
        list.add(b);
        list.add(c);

        System.out.println("Lista: " + list);

        a = 5;
        b = 6;
        c = 7;

        System.out.println("Lista: " + list);

        referenceCopy.addToList(list);

        System.out.println("Lista: " + list);

        referenceCopy.changeABC(a, b, c);

        System.out.println("A: " + a + ", B: " + b + ", C: " + c);
    }

    private void addToList(ArrayList newList) {
        newList.add(8);
        newList.add(9);
    }

    private void changeABC(int newA, int newB, int newC){
        newA = 10;
        newB = 11;
        newC = 12;
    }


}
