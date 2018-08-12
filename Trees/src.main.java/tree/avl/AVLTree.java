package tree.avl;

public class AVLTree {

	private Node root;

	public Node getRoot() {
		return root;
	}

	public void add(int value) {
		if (this.root == null)
			this.root = new Node(value);
		else
			this.root = add(root, value);
	}

	private Node add(Node root, int value) {
		if (root == null)
			return new Node(value);

		if (value < root.value) {
			root.left = add(root.left, value);
			if(getHeight(root.left) - getHeight(root.right) == 2) {
				if(value < root.left.value)
					root = Rotations.llRotation(root);
				else
					root = Rotations.lrRotation(root);
			}
		} else if (value > root.value) {
			root.right = add(root.right, value);
			if(getHeight(root.right) - getHeight(root.left) == 2) {
				if(value > root.right.value)
					root = Rotations.rrRotation(root);
				else
					root = Rotations.rlRotation(root);
			}
		}

		root.height = max(root.left, root.right) + 1;
		return root;
	}

	private StringBuilder result = new StringBuilder();

	public String traverse() {
		traverse(root);
		return result.toString();
	}

	private int max(Node n1, Node n2) {
		if (n1 != null && n2 != null)
			return Math.max(n1.height, n2.height);
		if (n1 == null && n2 == null)
			return -1;
		if (n1 == null)
			return n2.height;
		else
			return n1.height;
	}

	private void traverse(Node root) {
		if (root == null)
			return;
		traverse(root.left);
		result.append(root.value).append("-");
		traverse(root.right);
	}

	private int getHeight(Node root) {
		if (root == null)
			return -1;
		return root.height;
	}

	public int height(int value) {
		return height(value, root);
	}

	public int height(int value, Node root) {
		if (root == null)
			return -1;

		if (root.value == value)
			return root.height;

		if (value < root.value)
			return height(value, root.left);
		else if (value > root.value)
			return height(value, root.right);
		return -1;
	}

}