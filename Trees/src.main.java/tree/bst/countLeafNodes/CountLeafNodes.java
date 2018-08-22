package tree.bst.countLeafNodes;

import tree.bst.BinarySearchTree;
import tree.bst.Node;

public class CountLeafNodes {

	public int countLeafNode(BinarySearchTree bst) {
		return getLeafNodeCount(bst.getRoot());
	}

	private int getLeafNodeCount(Node root) {
		if(root == null)
			return 0;
		int left = getLeafNodeCount(root.left);
		int right = getLeafNodeCount(root.right);
		if(root.left == null & root.right ==null)
			return left + right + 1;
		return left + right;
	}
	
}
