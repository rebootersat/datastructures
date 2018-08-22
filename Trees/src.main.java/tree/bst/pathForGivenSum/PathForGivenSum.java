package tree.bst.pathForGivenSum;

import tree.bst.BinarySearchTree;
import tree.bst.Node;

public class PathForGivenSum {

	public boolean isPathExist(int sum, BinarySearchTree tree) {
		// TODO Auto-generated method stub
		return isPathExist(tree.getRoot(), sum);
	}
	
	private boolean isPathExist(Node root, int sum) {
		if(root == null)
			return false;
		
		sum = sum - root.value;
		if(sum == 0)
			return true;
		if(sum < 0)
			return false;
		boolean left = isPathExist(root.left, sum);
		if(left)
			return true;
		boolean right = isPathExist(root.right, sum);
		if(right)
			return true;
		return false;
	}

}
