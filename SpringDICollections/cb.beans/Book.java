package cb.beans;

public class Book {
	private String isbn;
	private String book_name;
	private int price;
	private String publication;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public Book() {
		isbn = "310IND";
		book_name = "unknown";
		price = 300;
		publication = "publication1";
	}

	public Book(String isbn, String book_name, int price, String publication) {
		this.isbn = isbn;
		this.book_name = book_name;
		this.price = price;
		this.publication = publication;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return book_name + "\t" + isbn + "\t" + price + "\t" + publication;
	}

	@Override
	public boolean equals(Object object) {
		// TODO Auto-generated method stub
		Book book = (Book) object;
		return this.isbn.equals(book.getIsbn());
	}

	public int hashCode() {
		return book_name.length() / 2;
	}

}
