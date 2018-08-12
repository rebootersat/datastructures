package tree.bst;

public class BinaryTree {

	private Node root;

	public Node getRoot() {
		return root;
	}

	public void add(int value) {
		if (this.root == null)
			this.root = new Node(value);
		else
			add(root, value);

	}

	private Node add(Node root, int value) {
		if (root == null)
			return new Node(value);

		if (value < root.value)
			root.left = add(root.left, value);
		else if (value > root.value)
			root.right = add(root.right, value);

		return root;
	}

	private StringBuilder result = new StringBuilder();

	public String traverse() {
		traverse(root);
		return result.toString();
	}

	private void traverse(Node root) {
		if (root == null)
			return;
		traverse(root.left);
		result.append(root.value).append("-");
		traverse(root.right);
	}

	public int height() {
		return height(root);
	}
	
	public int height(Node root) {
		if(root == null)
			return -1;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return Math.max(leftHeight, rightHeight) + 1;
	}
	
}