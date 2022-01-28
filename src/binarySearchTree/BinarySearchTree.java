package binarySearchTree;

public class BinarySearchTree {
	
	Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public void addProduct(int key, String value) {
		
		Node newNode = new Node(key, value);
		if (root == null) {
			root = newNode;
			return;
		}
		
		Node current = root;
		Node parent = null;
		
		while (true) {
			parent = current;
			if(current.getKey() == key) {
				System.out.println("중복된 키값은 설정할 수 없습니다.");
				return;
			}
			if (current.getKey() > key) {
				current = current.getLeft();
				
				if (current == null) {
					parent.setLeft(newNode);
					return;
				}
			}
			else {
				current = current.getRight();
				
				if (current == null) {
					parent.setRight(newNode);
					return;
				}
			}
		}
	}
	
	public boolean deleteProduct(int key) {
		
		Node p = root;
		Node parent = null;	
		boolean isLeftChild = true;	

		while (true) {
			if (p == null) {
				return false;
			}
			if(key == p.getKey()) {	
				break;
			}
			else {
				parent = p;
				if (key < p.getKey()) {
					isLeftChild = true;
					p = p.left;	
				} else {
					isLeftChild = false;
					p = p.right;
				}				
			}
		}
		
		if (p.left == null) {
			if (p == root)					 
				root = p.right;
			else if (isLeftChild)
				parent.left  = p.right;
			else
				parent.right = p.right;
		} else if (p.right == null) {
			if (p == root)
				root = p.left;
			else if (isLeftChild)
				parent.left  = p.left;
			else
				parent.right = p.left;
		} else {
			parent = p;
			Node left = p.left;
			isLeftChild = true;
			while (left.right != null) {
				parent = left;
				left = left.right;
				isLeftChild = false;
			}
			p.key  = left.key;
			if (isLeftChild)
				parent.left  = left.left;
			else
				parent.right = left.left;
		}
		return true;
	}
	
	public void searchProduct(int key) {
		if (root == null) {
			System.out.println("등록된 상품이 없습니다.");
			return;
		}		
		Node current = root;
		
		while(current != null) {
			if(current.getKey() == key) {
				System.out.println("상품명 : "+current.getValue());
				break;
			}
			else if (current.getKey() > key) {
				current = current.getLeft();
			}
			else {
				current = current.getRight();
			}
		}		
	}
	
	public void allSearchProduct(Node n) {
		if(root == null) {
			System.out.println("등록된 상품이 없습니다.");
			return;
		}				
		if (n != null) {
			allSearchProduct(n.getLeft());
			System.out.println(n.getKey()+" "+n.getValue());
			allSearchProduct(n.getRight());
		}
	}
	
	

}
