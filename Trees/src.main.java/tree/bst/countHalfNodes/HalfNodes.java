package tree.bst.countHalfNodes;

import tree.bst.BinarySearchTree;
import tree.bst.Node;

public class HalfNodes {

	public int count(BinarySearchTree binarySearchTree) {
		return getCount(binarySearchTree.getRoot());
	}

	private int getCount(Node root) {
		if(root == null)
			return 0;
		int left = getCount(root.left);
		int right = getCount(root.right);
		if(root.left == null && root.right != null)
			return right + 1;
		if(root.left != null && root.right == null)
			return left + 1;
		
		return left + right;
	}
}
