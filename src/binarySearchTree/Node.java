package binarySearchTree;

public class Node {
	
	int key;
	String value;
	Node left;
	Node right;
	
	
	public Node(int key, String value) {
		this.key = key;
		this.value = value;
	}

	Node(int key, String value, Node left, Node right) {
		this.key = key;
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}	
}


