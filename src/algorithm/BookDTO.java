package algorithm;

public class BookDTO {
	
	private String bookNo;
	private String bookTitle;
	private String bookAuthor;
	private int bookYear;
	private int bookPrice;
	private String bookPublisher;
	
	private BookDTO(Builder builder) {
		this.bookNo = builder.bookNo;
		this.bookTitle = builder.bookTitle;
		this.bookAuthor = builder.bookAuthor;
		this.bookYear = builder.bookYear;
		this.bookPrice = builder.bookPrice;
		this.bookPublisher = builder.bookPublisher;
	}
	
	public static Builder builder() {
		return new Builder();
	}	
	
	public String getBookNo() {
		return bookNo;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public int getBookYear() {
		return bookYear;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public static class Builder {
		
		private String bookNo;
		private String bookTitle;
		private String bookAuthor;
		private int bookYear;
		private int bookPrice;
		private String bookPublisher;
		
		private Builder() {}
		
		public Builder bookNo(String bookNo) {
			this.bookNo = bookNo;
			return this;
		}
		public Builder bookTitle(String bookTitle) {
			this.bookTitle = bookTitle;
			return this;
		}
		public Builder bookAuthor(String bookAuthor) {
			this.bookAuthor = bookAuthor;
			return this;
		}
		public Builder bookYear(int bookYear) {
			this.bookYear = bookYear;
			return this;
		}
		public Builder bookPrice(int bookPrice) {
			this.bookPrice = bookPrice;
			return this;
		}
		public Builder bookPublisher(String bookPublisher) {
			this.bookPublisher = bookPublisher;
			return this;
		}
		public BookDTO build() {
			return new BookDTO(this);
		}
	}
	
	
}
