package tree.bst;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {

	private BinarySearchTree tree;

	@Before
	public void setUp() {
		tree = new BinarySearchTree();
	}

	@Test
	public void height_whenNodeNotExistForGivenvalue_returnMinusOne() {
		int height = tree.height();
		assertEquals(-1, height);
	}

	@Test
	public void height_NodeExistForGivenValue_shouldReturnHeight() {
		tree.add(10);
		tree.add(7);
		tree.add(5);
		tree.add(9);
		tree.add(8);
		tree.add(13);
		tree.add(12);
		assertEquals(3, tree.height());
	}

}
