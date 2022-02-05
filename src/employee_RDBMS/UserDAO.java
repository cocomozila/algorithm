package employee_RDBMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {

	
	public void insertUser(User user) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("연결 성공");
			
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
			
			System.out.println("연결종료");			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
