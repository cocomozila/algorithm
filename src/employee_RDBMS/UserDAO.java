package employee_RDBMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;

public class UserDAO {
	
	
	public void insertUserData() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("회원등록 입니다.");
		System.out.print("아이디 : ");
		String id = scan.next();
		System.out.print("패스워드 : ");
		String pw = scan.next();
		System.out.print("Email : ");
		String email = scan.next();
		System.out.print("랭크 : ");
		int rate = scan.nextInt();
		
		User e1 = User.builder().
				user_no(0).
				user_id(id).
				user_pw(pw).
				user_email(email).
				user_rate(rate).
				build();
		
		insertUser(e1);
	}
	
	public void insertUser(User user) {
		
		try {
						
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn =
			DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "root", "1234");
			
			String insertSQL = "insert into users value(null,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(insertSQL);
			
			ps.setString(1, user.getUser_id());
			ps.setString(2, user.getUser_pw());
			ps.setString(3, user.getUser_email());
			ps.setString(4, String.valueOf(user.getUser_rate()));
			
			ps.executeUpdate();
			ps.close();
			conn.close();
			
			System.out.println(user.getUser_id()+"님의 회원등록을 완료하였습니다.");			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void searchAndDeleteUserId() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn =
			DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb","root","1234");
			
			String selectSQL = "select * from users";

			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(selectSQL);
			HashMap<Integer, String> selectQuery = new HashMap<>();
			Scanner scan = new Scanner(System.in);
			
			while(true) {
				int cnt = 0;
				while(rs.next()) {
					cnt++;
					int no = rs.getInt("user_no");
					String id = rs.getString("user_id");					
					selectQuery.put(no, id);					
					String email = rs.getString("user_email");
					int rate = rs.getInt("user_rate");
					System.out.println(no+"\t"+id+"\t"+email+"\t"+rate);
				}
				System.out.println("[ 조회완료 : 총 "+cnt+"명 조회 ] [ (1) 삭제 // 나머지 - 종료 ]");
				
				//delete
				int t = scan.nextInt();
				if(t == 1) {
					System.out.println("삭제할 번호를 입력하세요.");
					int deleteNumber = scan.nextInt();
					
					String deleteSQL = "delete from users where user_no = ?";
					PreparedStatement ps = conn.prepareStatement(deleteSQL);
					
					ps.setInt(1, deleteNumber);
					
					ps.executeUpdate();
					ps.close();
					conn.close();
					System.out.println(deleteNumber+"번 user Data를 삭제하였습니다.");
					break;
				}
				else {
					System.out.println("종료합니다.");
					break;
				}				
			}
			rs.close();
			st.close();
			
			conn.close();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
