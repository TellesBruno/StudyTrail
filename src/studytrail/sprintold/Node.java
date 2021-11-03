package studytrail.sprintold;

public class Node {
    private int value;
    private Node parent;
    private Node[] children;

    Node(int nodeValue){
        this.value = nodeValue;
        this.children = new Node[2];
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getParent() {
        return parent;
    }

    public void setChildren(Node[] newChildren) {
        this.children = newChildren;
    }

    public Node[] getChildren() {
        return children;
    }

    public Node getBiggerChild(){ return children[1]; }

    public Node getSmallerChild(){ return children[0]; }

    public Node addChild(int childValue){
        Node childNode = new Node(childValue);
        childNode.setParent(this);
        if((childNode.getValue() > this.getValue())){
            if(this.children[1] == null) {
                this.children[1] = childNode;
            } else {
                this.children[1].addChild(childNode.getValue());
            }
        } else {
            if(this.children[0] == null) {
                this.children[0] = childNode;
            } else {
                this.children[0].addChild(childNode.getValue());
            }
        }
        return childNode;
    }
}
