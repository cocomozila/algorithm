package employee_RDBMS;

import java.util.Scanner;

public class UserTest {
	
	static boolean exit = false;

	public static void main(String[] args) {
		
		UserDAO dao = new UserDAO();
		Scanner scan = new Scanner(System.in);
		
		while (exit == false) {
			System.out.println("====================================");
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("(1) ȸ����� // (2) ȸ�� ��ü�˻� // (3) ����");
			switch (scan.nextInt()) {
			case 1:
				dao.insertUserData();
				break;
			case 2:
				dao.searchUserId();
				break;
			case 3:
				System.out.println("�����մϴ�.");
				exit = true;
				break;
			}
			
		}
	}
}
