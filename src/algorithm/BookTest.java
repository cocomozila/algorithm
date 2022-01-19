package algorithm;

public class BookTest {

	public static void main(String[] args) throws Exception {
		
		BookDTO dto = BookDTO.
				builder()
				.bookNo("B004")
				.bookTitle("�ڹٽ�ũ��Ʈ")
				.bookAuthor("���浿")
				.bookYear(2020)
				.bookPrice(28000)
				.bookPublisher("�������ǻ�")
				.build();
		
		BookDAO dao = new BookDAO();
		dao.insertBook(dto);
		dao.selectBook();
	}

}
