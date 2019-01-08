import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cb.beans.Book;
import cb.dao.BookDAO;

public class MainBookDAO_NamedTemplate {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("connection.xml");
		BookDAO bookDAO = (BookDAO) context.getBean("BookDAO_named");
		//add book
		int rows = bookDAO.addBook(new Book(97815674L, "Learning Modular Java Programming",  
				"Packt publication", 40, "Explore the modular Java  programming","T.M. Jog"));
	    if(rows > 0)
	    	System.out.println("book inserted successfully");
	    else
	    	System.out.println("SORRY! could not add book");

	    //update the book
		rows = bookDAO.updateBook(97815674L, 55);
	    if(rows > 0)
	    	System.out.println("book updated successfully");
	    else
	    	System.out.println("SORRY! could not update book");

	    //delete the book
	    boolean deleted = bookDAO.deleteBook(97815674L);
	    if(deleted)
	    	System.out.println("book deleted successfully");
	    else
	    	System.out.println("SORRY! could not delete book");

	}


}
