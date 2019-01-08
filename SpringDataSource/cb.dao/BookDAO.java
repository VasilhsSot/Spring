package cb.dao;

import java.util.ArrayList;

import cb.beans.Book;

public interface BookDAO {
	public int addBook(Book book);
	public ArrayList<Book> getBooks();
}
