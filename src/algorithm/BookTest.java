package algorithm;

public class BookTest {

	public static void main(String[] args) throws Exception {
		
		BookDTO dto = BookDTO.
				builder()
				.bookNo("B004")
				.bookTitle("자바스크립트")
				.bookAuthor("강길동")
				.bookYear(2020)
				.bookPrice(28000)
				.bookPublisher("서울출판사")
				.build();
		
		BookDAO dao = new BookDAO();
		dao.insertBook(dto);
		dao.selectBook();
	}

}
