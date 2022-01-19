package algorithm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookDAO {
	
	public void insertBook (BookDTO bookDTO) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn =
			DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb","root","1234");
			
			String insertSQL = "insert into book values ('"+bookDTO.getBookNo()+"','"+bookDTO.getBookTitle()+
														"','"+bookDTO.getBookAuthor()+"',"+bookDTO.getBookYear()+
																","+bookDTO.getBookPrice()+",'"+bookDTO.getBookPublisher()+"')";
			Statement st = conn.createStatement();
			st.executeUpdate(insertSQL);			
			
			conn.close();
			st.close();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void selectBook () {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn =
			DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb","root","1234");
			
			String selectSQL = "select * from book";
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(selectSQL);
			
			while (rs.next()) {
				String bookNo = rs.getString("bookNo");
				String bookTitle = rs.getString("bookTitle");
				String bookAuthor = rs.getString("BookAuthor");
				int bookYear = rs.getInt("BookYear");
				int bookPrice = rs.getInt("BookPrice");
				String bookPublisher = rs.getString("BookPublisher");
				System.out.println(bookNo + "\t" + bookTitle + "\t" + bookAuthor + "\t" + bookYear + "\t" + bookPrice + "\t" + bookPublisher);
			}
			conn.close();
			st.close();
			rs.close();			
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
