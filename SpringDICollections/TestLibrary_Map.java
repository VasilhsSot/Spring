import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cb.beans.Library_Map;

public class TestLibrary_Map {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("books.xml");
		Library_Map map = (Library_Map) context.getBean("library_map");
		map.displayBooks();

	}

}
