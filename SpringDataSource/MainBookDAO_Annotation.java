import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cb.beans.Book;
import cb.dao.BookDAO;

public class MainBookDAO_Annotation {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("connection_new.xml");
		BookDAO bookDAO = (BookDAO) context.getBean("bookDAO_new");
		int rows = bookDAO.addBook(new Book(9781236L, "Learning Modular Java Programming", "Packt Publications", 40,
				"Explore the power of Modular programming", "T.M. Jog"));
		if (rows > 0)
			System.out.println("book inserted successfully");
		else
			System.out.println("SORRY! could not add book");

		ArrayList<Book> books = bookDAO.getBooks();
		if (books.size() != 0) {
			for (Book book : books)
				System.out.println(book);
		}
	}
}
