import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cb.beans.Book;
import cb.dao.BookDAO;

public class MainBookDAO_operations {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("connection.xml");
		BookDAO bookDAO = (BookDAO) context.getBean("bookDAO_jdbcTemplate");
		
		// add book
		int rows = bookDAO.addBook(new Book(97815674L, "Java EE 7 Developer Handbook", 
				"Packt publications", 32,
				"Explore the Java EE7 programming", "Peter Pilgrim"));
		if (rows > 0)
			System.out.println("book inserted successfully");
		else
			System.out.println("SORRY! could not add book");

		// update the book
		rows = bookDAO.updateBook(97815674L, 55);
		if (rows > 0)
			System.out.println("book updated successfully");
		else
			System.out.println("SORRY! could not update book");

		// delete the book
		boolean deleted = bookDAO.deleteBook(97815674L);
		if (deleted)
			System.out.println("book deleted successfully");
		else
			System.out.println("SORRY! could not delete book");

	}

}
