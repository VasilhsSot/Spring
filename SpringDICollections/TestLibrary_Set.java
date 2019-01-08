import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cb.beans.Library_Set;


public class TestLibrary_Set {
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("books.xml");
		Library_Set set=(Library_Set)context.getBean("library_set");
		set.displayBooks();
	}
}
