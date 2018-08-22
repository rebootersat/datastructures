package tree.bst.deepestNode;

import tree.bst.BinarySearchTree;
import tree.bst.Node;

public class DeepestNode {

	private int value;
	private int maxHeight;

	public int getDeepestNodeValue(BinarySearchTree tree) {
		if(tree == null)
			throw new NullPointerException("Null");
		if(tree.getRoot() == null)
			throw new NullPointerException("No Node");
		
		findMaxHeightValue(tree.getRoot(), 0);
		return value;
	}

	private void findMaxHeightValue(Node root, int i) {
		if(root == null)
			return;
		findMaxHeightValue(root.left, i + 1);
		findMaxHeightValue(root.right, i + 1);
		if(maxHeight < i) {
			maxHeight = i;
			value  = root.value;
		}
	}

}
