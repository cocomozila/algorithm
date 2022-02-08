package employee_RDBMS;

import java.util.Scanner;

public class UserTest {
	
	static boolean exit = false;

	public static void main(String[] args) {
		
		UserDAO dao = new UserDAO();
		Scanner scan = new Scanner(System.in);
		
		while (exit == false) {
			System.out.println("====================================");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("(1) 회원등록 // (2) 회원 전체검색 // (3) 종료");
			switch (scan.nextInt()) {
			case 1:
				dao.insertUserData();
				break;
			case 2:
				dao.searchUserId();
				break;
			case 3:
				System.out.println("종료합니다.");
				exit = true;
				break;
			}
			
		}
	}
}
