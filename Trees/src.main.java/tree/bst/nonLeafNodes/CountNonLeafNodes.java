package tree.bst.nonLeafNodes;

import tree.bst.BinarySearchTree;
import tree.bst.Node;

public class CountNonLeafNodes {

	public int count(BinarySearchTree binarySearchTree) {
		return getCount(binarySearchTree.getRoot());
	}

	private int getCount(Node root) {
		if(root == null)
			return 0;
		int left = getCount(root.left);
		int right = getCount(root.right);
		
		if(root.left != null & root.right != null)
			return left + right + 1;
		return left + right;
	}
}
