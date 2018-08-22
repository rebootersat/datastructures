package tree.bst.pathForGivenSum;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tree.bst.BinarySearchTree;

public class PathForGivenSumTest {

	private PathForGivenSum pathForGivenSum;
	
	@Before
	public void setUp() throws Exception {
		pathForGivenSum = new PathForGivenSum();
	}

	@Test
	public void test() {
		BinarySearchTree tree = new BinarySearchTree();
		tree.add(40);
		tree.add(20);
		tree.add(70);
		tree.add(19);
		tree.add(32);
		tree.add(25);
		tree.add(60);
		tree.add(75);
		boolean isExist = pathForGivenSum.isPathExist(92, tree);
		assertEquals(true, isExist);
	}

}
