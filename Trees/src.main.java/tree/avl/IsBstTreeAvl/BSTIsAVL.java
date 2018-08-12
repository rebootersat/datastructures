package tree.avl.IsBstTreeAvl;

import tree.bst.Node;

public class BSTIsAVL {

	public boolean isAvl(Node root) {
		if(root == null)
			return true;
		if(!isAvl(root.left))
			return false;
		else if(!isAvl(root.right))
			return false;
		
		if(getHeightDiff(root.left, root.right) > 1)
			return false;
		root.height = Math.max(getHeight(root.left), getHeight(root.right)) + 1;
		
		return true;
	}
	
	
	private int getHeightDiff(Node left, Node right) {
		if(left == null && right == null)
			return 0;
		
		if(left != null && right != null)
			return Math.abs(left.height - right.height);
		
		if(left == null)
			return Math.abs(right.height);
		if(right == null)
			return Math.abs(left.height);
		
		return -1;
	}

	private int getHeight(Node root) {
		if(root == null)
			return -1;
		else
			return root.height;
	}
	
}
