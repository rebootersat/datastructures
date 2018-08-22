package tree.bst.nonLeafNodes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tree.bst.BinarySearchTree;

public class CountNonLeafNodesTest {
	
	private CountNonLeafNodes countNonLeafnodes;

	@Before
	public void setUp() throws Exception {
		countNonLeafnodes = new CountNonLeafNodes();
	}

	@Test
	public void countNonLeafNoned() {
		int count = countNonLeafnodes.count(BinarySearchTree.getBinarySearchTree());
		assertEquals(4, count);
	}

}
