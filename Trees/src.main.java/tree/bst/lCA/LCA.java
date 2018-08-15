package tree.bst.lCA;

import tree.bst.BinarySearchTree;
import tree.bst.Node;

public class LCA {
	
	private BinarySearchTree bst;
	
	public LCA(BinarySearchTree bst) {
		this.bst = bst;
	}

	public int getLCA(int first, int second) {
		Node node = getLCA(bst.getRoot(), first, second);
		if(node == null)
			throw new IllegalArgumentException("No nodes found for given values");
		else if(node.value == first)
			throw new IllegalArgumentException("No node found for "+second);
		else if(node.value == second)
			throw new IllegalArgumentException("No node found for "+first);
		
		return node.value;
	}
	
	private Node getLCA(Node root, int first, int second) {
		if(root == null)
			return root;
		
		if(root.value == first || root.value == second)
			return root;
		
		Node left = getLCA(root.left, first, second);
		Node right = getLCA(root.right, first, second);
		
		if(left != null && right != null)
			return root;
		else if(left == null)
			return right;
		
		return left;
	}

}
