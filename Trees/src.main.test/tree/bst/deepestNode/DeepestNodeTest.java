package tree.bst.deepestNode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import tree.bst.BinarySearchTree;

public class DeepestNodeTest {

	private DeepestNode deepNode;
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Before
	public void setUp() throws Exception {
		deepNode = new DeepestNode();
	}
	

	@Test
	public void getDeepestNodevalue_whenTreeNull_shouldThrowException() {
		exception.expectMessage("Null");
		exception.expect(NullPointerException.class);
		deepNode.getDeepestNodeValue(null);
	}
	
	@Test
	public void getDeepestNodevalue_whenTreeHasNoNode_shouldThrowException() {
		exception.expectMessage("No Node");
		exception.expect(NullPointerException.class);
		deepNode.getDeepestNodeValue(new BinarySearchTree());
	}
	
	@Test
	public void getDeepestNodevalue() {
		BinarySearchTree tree = new BinarySearchTree();
		tree.add(50);
		tree.add(25);
		tree.add(75);
		tree.add(20);
		tree.add(30);
		tree.add(27);
		tree.add(60);
		tree.add(90);
		int value = deepNode.getDeepestNodeValue(tree);
		assertEquals(27, value);
	}

}
