package tree.avl.IsBstTreeAvl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tree.bst.BinarySearchTree;
import tree.bst.Node;

public class BSTIsAVLTest {

	private BSTIsAVL isAvlTree;
	
	@Before
	public void setUp() {
		isAvlTree = new BSTIsAVL();
	}
	
	@Test
	public void isAvl() {
		BinarySearchTree tree = new BinarySearchTree();
		tree.add(15);
		tree.add(10);
		tree.add(12);
		tree.add(5);
		tree.add(4);
		Node root = tree.getRoot();
		boolean isAVL = isAvlTree.isAvl(root);
		assertFalse(isAVL);
	}
}
