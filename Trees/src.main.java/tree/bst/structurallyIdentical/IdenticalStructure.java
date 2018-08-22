package tree.bst.structurallyIdentical;

import tree.bst.BinarySearchTree;
import tree.bst.Node;

public class IdenticalStructure {

	public boolean isStructurallyIdentical(BinarySearchTree tree1, BinarySearchTree tree2) {
		return isIdentical(tree1.getRoot(), tree2.getRoot());
	}

	private boolean isIdentical(Node root1, Node root2) {
		if(root1 == null & root2 == null)
			return true;
		if(root1 != null & root2 == null)
			return false;
		if(root1 == null & root2 != null)
			return false;
		if(!isIdentical(root1.left, root2.left))
			return false;
		if(!isIdentical(root1.right, root2.right))
			return false;
		return true;
	}
	
}
