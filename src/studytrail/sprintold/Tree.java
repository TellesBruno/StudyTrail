package studytrail.sprintold;

public class Tree {
    private Node root;

    Tree(int startValue){
        root = new Node(startValue);
        root.setChildren(new Node[2]);
    }

    public static void main(String[] args) {
        Tree myTree = new Tree(7);
        myTree.root.addChild(4);
        myTree.root.addChild(9);
        myTree.root.addChild(2);
        myTree.root.addChild(5);
        myTree.root.addChild(8);
        myTree.root.addChild(10);

        for (Node child:myTree.root.getChildren()
             ) {
            System.out.println("Child value: "+child.getValue());
            System.out.println("Parent value: "+child.getParent().getValue());
        }
        System.out.println(myTree.root.getSmallerChild().getSmallerChild().getValue());
        System.out.println(myTree.root.getSmallerChild().getBiggerChild().getValue());
        System.out.println(myTree.root.getBiggerChild().getBiggerChild().getValue());
        System.out.println(myTree.root.getBiggerChild().getSmallerChild().getValue());
    }
}
