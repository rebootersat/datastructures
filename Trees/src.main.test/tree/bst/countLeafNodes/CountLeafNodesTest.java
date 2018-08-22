package tree.bst.countLeafNodes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tree.bst.BinarySearchTree;

public class CountLeafNodesTest {
	
	private CountLeafNodes leafNode;
	

	@Before
	public void setUp() throws Exception {
		leafNode = new CountLeafNodes();
	}

	@Test
	public void t() {
		BinarySearchTree bst = BinarySearchTree.getBinarySearchTree();
		int count = leafNode.countLeafNode(bst);
		assertEquals(5, count);
	}

}
