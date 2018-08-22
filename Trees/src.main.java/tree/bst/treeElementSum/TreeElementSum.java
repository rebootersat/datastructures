package tree.bst.treeElementSum;

import tree.bst.BinarySearchTree;
import tree.bst.Node;

public class TreeElementSum {

	public int getTotal(BinarySearchTree tree) {
		// TODO Auto-generated method stub
		return getTotal(tree.getRoot());
	}

	
	private int getTotal(Node root) {
		if(root == null)
			return 0;
		return getTotal(root.left) + getTotal(root.right) + root.value;
	}
	
}
