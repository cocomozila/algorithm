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
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("(1) ȸ����� // (2) ȸ���˻� // (3) ����");
			switch (scan.nextInt()) {
			case 1:
				System.out.println("ȸ����� �Դϴ�.");
				dao.insertUser(e1);
				break;
			case 3:
				System.out.println("�����մϴ�.");
				exit = true;
				break;
			}
			
		}
	}
}
