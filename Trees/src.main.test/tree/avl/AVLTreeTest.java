package tree.avl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AVLTreeTest {

	private AVLTree tree;

	@Before
	public void setUp() {
		tree = new AVLTree();
	}

	@Test
	public void height_whenNodeNotExistForGivenvalue_returnMinusOne() {
		int height = tree.height(35);
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
		
		assertEquals(0, tree.height(5));
		assertEquals(0, tree.height(8));
		assertEquals(1, tree.height(12));
		assertEquals(2, tree.height(9));
		assertEquals(0, tree.height(13));
		assertEquals(1, tree.height(7));
		assertEquals(0, tree.height(10));
	}

}
