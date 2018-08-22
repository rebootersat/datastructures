package tree.bst.structurallyIdentical;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tree.bst.BinarySearchTree;

public class IdenticalStructureTest {

	private IdenticalStructure identicalStructure;
	
	@Before
	public void setUp() throws Exception {
		identicalStructure = new IdenticalStructure();
	}

	@Test
	public void test() {
		BinarySearchTree tree1 = new BinarySearchTree();
		tree1.add(71);
		tree1.add(35);
		tree1.add(15);
		tree1.add(17);
		tree1.add(50);
		tree1.add(100);
		tree1.add(80);
		tree1.add(150);
		
		BinarySearchTree tree2 = new BinarySearchTree();
		tree2.add(20);
		tree2.add(15);
		tree2.add(100);
		tree2.add(80);
		tree2.add(10);
		tree2.add(17);
		tree2.add(11);
		tree2.add(150);
		boolean isIdentical = identicalStructure.isStructurallyIdentical(tree1, tree2);
		assertEquals(true, isIdentical);
	}

}
