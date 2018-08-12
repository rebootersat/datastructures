package tree.avl.zeroBalanceFactor;

import org.junit.Before;
import org.junit.Test;

public class TreeZeroBalanceFactor {

	private ZeroBalanceFactorTree tree;

	@Before
	public void setUp() {
		tree = new ZeroBalanceFactorTree();
	}

	@Test
	public void create() {
		tree.create(3);
		tree.preorder();
	}
	@Test
	public void createWithCounter() {
		tree.preorder(tree.createWithCounter(3));
	}

}
