package tree.avl;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RotationsTest {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void llRotation_ifNodeNull_throwNullPointerException() {
		exception.expect(NullPointerException.class);
		exception.expectMessage("Node cannot be null");
		Rotations.llRotation(null);
	}

	@Test
	public void llRotation_returnRootNode() {
		AVLTree tree = new AVLTree();
		tree.add(50);
		tree.add(40);
		tree.add(30);
		Node rt = Rotations.llRotation(tree.getRoot());
		Assert.assertThat(rt.value + "-" + rt.left.value + "-" + rt.right.value, equalTo("40-30-50"));
		assertEquals(rt.value, 40);
	}

	@Test
	public void rrRotation_ifNodeNull_throwNullPointerException() {
		exception.expect(NullPointerException.class);
		exception.expectMessage("Node cannot be null");
		Rotations.rrRotation(null);
	}

	@Test
	public void rrRotation_returnRootNode() {
		AVLTree tree = new AVLTree();
		tree.add(50);
		tree.add(60);
		tree.add(70);
		Node rt = Rotations.rrRotation(tree.getRoot());
		Assert.assertThat(rt.value + "-" + rt.left.value + "-" + rt.right.value, equalTo("60-50-70"));
		assertEquals(rt.value, 60);
	}

	@Test
	public void lrRotation_ifNodeNull_throwNullPointerException() {
		exception.expect(NullPointerException.class);
		exception.expectMessage("Node cannot be null");
		Rotations.lrRotation(null);
	}

	@Test
	public void lrRotation_returnRootNode() {
		AVLTree tree = new AVLTree();
		tree.add(50);
		tree.add(40);
		tree.add(45);
		Node rt = Rotations.lrRotation(tree.getRoot());
		Assert.assertThat(rt.value + "-" + rt.left.value + "-" + rt.right.value, equalTo("45-40-50"));
		assertEquals(rt.value, 45);
	}

	@Test
	public void rlRotation_ifNodeNull_throwNullPointerException() {
		exception.expect(NullPointerException.class);
		exception.expectMessage("Node cannot be null");
		Rotations.rlRotation(null);
	}

	@Test
	public void rlRotation_returnRootNode() {
		AVLTree tree = new AVLTree();
		tree.add(50);
		tree.add(60);
		tree.add(55);
		Node rt = Rotations.rlRotation(tree.getRoot());
		Assert.assertThat(rt.value + "-" + rt.left.value + "-" + rt.right.value, equalTo("55-50-60"));
		assertEquals(rt.value, 55);
	}
	
	@Test
	public void llRotation_calculateHeight_shouldReturnRootNode() {
		AVLTree tree = new AVLTree();
		tree.add(50);
		tree.add(40);
		tree.add(30);
		Node rt = Rotations.llRotation(tree.getRoot());
		Assert.assertThat(rt.height + "-" + rt.left.height + "-" + rt.right.height, equalTo("1-0-0"));
	}
	
	@Test
	public void rrRotation_calculateHeight_shouldReturnRootNode() {
		AVLTree tree = new AVLTree();
		tree.add(50);
		tree.add(60);
		tree.add(70);
		Node rt = Rotations.rrRotation(tree.getRoot());
		Assert.assertThat(rt.height + "-" + rt.left.height + "-" + rt.right.height, equalTo("1-0-0"));
	}
	
	@Test
	public void lrRotation_calculateHeight_shouldReturnRootNode() {
		AVLTree tree = new AVLTree();
		tree.add(50);
		tree.add(40);
		tree.add(45);
		Node rt = Rotations.lrRotation(tree.getRoot());
		Assert.assertThat(rt.height + "-" + rt.left.height + "-" + rt.right.height, equalTo("1-0-0"));
	}
	
	@Test
	public void rlRotation_calculateHeight_shouldReturnRootNode() {
		AVLTree tree = new AVLTree();
		tree.add(50);
		tree.add(60);
		tree.add(55);
		Node rt = Rotations.rlRotation(tree.getRoot());
		Assert.assertThat(rt.height + "-" + rt.left.height + "-" + rt.right.height, equalTo("1-0-0"));
	}
}
