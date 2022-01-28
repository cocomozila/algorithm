package binarySearchTree;

import java.util.Scanner;

public class Test {	
	
	static BinarySearchTree bst = new BinarySearchTree();

	public static void main(String[] args) {
		
		productManager();

	}
	
	static void productManager() {
		
		Scanner scan = new Scanner(System.in);		
		
		while(true) {
			System.out.println("(1) ��ǰ ���  (2) ��ǰ ����  (3) ��ǰ �˻�  (4) ��ü ��ǰ ��ȸ  (5) ��ǰ ���");
			System.out.print("�޴� ���� : ");			
			int pointer = scan.nextInt();
			
			if(pointer <= 0 || pointer > 5) {
				System.out.println("1~5 ������ ���ڸ� �Է��ϼ���.");
				continue;
			}
			
			if(pointer == 1) {
				System.out.println("��ǰ ���");
				System.out.print("��ǰ ��ȣ �Է� : ");
				int a = scan.nextInt();
				System.out.print("��ǰ�� �Է� : ");
				String str = scan.next();
				bst.addProduct(a, str);
				System.out.println();
			}
			
			else if (pointer == 2) {
				System.out.println("��ǰ ����");
				System.out.print("��ǰ ��ȣ �Է� : ");
				int a = scan.nextInt();
				if(bst.deleteProduct(a)) {
					System.out.println("��ǰ ���� �Ϸ�");
				} else {
					System.out.println("��ǰ ���� ����");
				}
				System.out.println();
			}
			
			else if (pointer == 3) {
				System.out.println("��ǰ �˻�");
				System.out.print("��ǰ ��ȣ �Է� : ");
				int a = scan.nextInt();
				bst.searchProduct(a);
				System.out.println();
			}
			
			else if (pointer == 4) {
				bst.allSearchProduct(bst.root);
				System.out.println();
			}
			
			else {
				System.out.println("�����մϴ�.");
				return;
			}
		}
	}

}
