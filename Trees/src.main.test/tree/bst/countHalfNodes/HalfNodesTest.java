package tree.bst.countHalfNodes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tree.bst.BinarySearchTree;

public class HalfNodesTest {
	
	private HalfNodes halfNodes;

	@Before
	public void setUp() throws Exception {
		halfNodes = new HalfNodes();
	}

	@Test
	public void test() {
		BinarySearchTree binarySearchTree = BinarySearchTree.getBinarySearchTree();
		binarySearchTree.add(15);
		binarySearchTree.add(26);
		binarySearchTree.add(67);
		int count = halfNodes.count(binarySearchTree);
		assertEquals(3, count);
	}

}
