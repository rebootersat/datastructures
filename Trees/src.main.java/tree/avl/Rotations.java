package tree.avl;

public class Rotations {

	public static Node llRotation(Node root) {
		if (root == null)
			throw new NullPointerException("Node cannot be null");
		Node W = root.left;
		root.left = W.right;
		root.height = max(root.left, root.right) + 1;
		W.right = root;
		W.height = max(W.left, root) + 1;
		return W;
	}

	public static Node rrRotation(Node root) {
		if (root == null)
			throw new NullPointerException("Node cannot be null");
		Node W = root.right;
		root.right = W.left;
		root.height = max(root.left, root.right) + 1;
		W.left = root;
		W.height = max(root, W.right) + 1;
		return W;
	}

	public static Node lrRotation(Node root) {
		if (root == null)
			throw new NullPointerException("Node cannot be null");
		root.left = rrRotation(root.left);
		return llRotation(root);
	}

	public static Node rlRotation(Node root) {
		if (root == null)
			throw new NullPointerException("Node cannot be null");
		root.right = llRotation(root.right);
		return rrRotation(root);
	}
	
	private static int max(Node n1, Node n2) {
		if (n1 != null && n2 != null)
			return Math.max(n1.height, n2.height);
		if (n1 == null && n2 == null)
			return -1;
		if (n1 == null)
			return n2.height;
		else
			return n1.height;
	}
}
