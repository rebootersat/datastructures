package tree.avl;


public class Node{

    public Node left;
    public Node right;
    public int value;
    public int height;

    public Node() {
	}
    
    public Node(int value){
        this.value = value;
    }

}