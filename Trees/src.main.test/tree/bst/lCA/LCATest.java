package tree.bst.lCA;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tree.bst.BinarySearchTree;

public class LCATest {

	private LCA tree;
	
	@Before
	public void setUp() throws Exception {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(11);
		bst.add(5);
		bst.add(25);
		bst.add(2);
		bst.add(7);
		bst.add(15);
		bst.add(30);
		bst.add(4);
		bst.add(17);
		tree = new LCA(bst);
	}

	@Test
	public void getLCA_whenBothValuePresent() {
		int lca = tree.getLCA(4,17);
		// Result 11
		System.out.println(lca);
		lca = tree.getLCA(4,1);
		// Result Exception
		System.out.println(lca);
		lca = tree.getLCA(1,17);
		// Result Exception
		System.out.println(lca);
	}

}
