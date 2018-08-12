package tree.avl.zeroBalanceFactor;

import tree.avl.Node;

/**
 * Create a tree for given height with balance factor zero.
 * @author SANDEEP
 *
 */
public class ZeroBalanceFactorTree {

	private Node root;
	
	/**
	 * Create a tree with balance factor zero
	 * @param value
	 */
	public void create(int value) {
		this.root = create(null, value);
	}

	/**
	 * Creates a node where each node value represents height of the node
	 * @param root 
	 * @param height  height for which tree should be created
	 * @return Root
	 */
	private Node create(Node root, int height) {
		if(root == null)
			root = new Node(height);
		if(height > 0) {
			root.left = create(root.left, height -1);
			root.right = create(root.right, height -1);
		}
		return root;
	}
	
	private int counter = 0;
	/**
	 * 
	 * Counter variable is maintained to fill the values in nodes.
	 * 
	 * @param height height for which tree should be created
	 * @return
	 */
	public Node createWithCounter(int height) {
		Node root;
		if(height == -1)
			return null;
		root = new Node();
		root.left = createWithCounter(height -1);
		root.value = counter++;
		root.right = createWithCounter(height-1);
		return root;
		
	}
	
	
	public void preorder() {
		preorder(root);
	}
	
	public void preorder(Node root) {
		if(root != null) {
			preorder(root.left);
			System.out.print(root.value+" - ");
			preorder(root.right);
		}
	}
	
}
