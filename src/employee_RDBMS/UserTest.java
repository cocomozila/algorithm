package employee_RDBMS;

import java.util.Scanner;

public class UserTest {
	
	static boolean exit = false;

	public static void main(String[] args) {
		
		UserDAO dao = new UserDAO();
		Scanner scan = new Scanner(System.in);
		User e1 = User.builder().
						user_no(0).
						user_id("whtpdbs94").
						user_pw("1q2w3e4r").
						user_email("joseyun94@naver.com").
						user_rate(1).
						build();
		
		while (exit == false) {
			System.out.println("====================================");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("(1) 회원등록 // (2) 회원검색 // (3) 종료");
			switch (scan.nextInt()) {
			case 1:
				System.out.println("회원등록 입니다.");
				dao.insertUser(e1);
				break;
			case 3:
				System.out.println("종료합니다.");
				exit = true;
				break;
			}
			
		}
	}
}
