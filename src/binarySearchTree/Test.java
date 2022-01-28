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
			System.out.println("(1) 상품 등록  (2) 상품 삭제  (3) 상품 검색  (4) 전체 상품 조회  (5) 상품 등록");
			System.out.print("메뉴 선택 : ");			
			int pointer = scan.nextInt();
			
			if(pointer <= 0 || pointer > 5) {
				System.out.println("1~5 사이의 숫자를 입력하세요.");
				continue;
			}
			
			if(pointer == 1) {
				System.out.println("상품 등록");
				System.out.print("상품 번호 입력 : ");
				int a = scan.nextInt();
				System.out.print("상품명 입력 : ");
				String str = scan.next();
				bst.addProduct(a, str);
				System.out.println();
			}
			
			else if (pointer == 2) {
				System.out.println("상품 삭제");
				System.out.print("상품 번호 입력 : ");
				int a = scan.nextInt();
				if(bst.deleteProduct(a)) {
					System.out.println("상품 삭제 완료");
				} else {
					System.out.println("상품 삭제 실패");
				}
				System.out.println();
			}
			
			else if (pointer == 3) {
				System.out.println("상품 검색");
				System.out.print("상품 번호 입력 : ");
				int a = scan.nextInt();
				bst.searchProduct(a);
				System.out.println();
			}
			
			else if (pointer == 4) {
				bst.allSearchProduct(bst.root);
				System.out.println();
			}
			
			else {
				System.out.println("종료합니다.");
				return;
			}
		}
	}

}
