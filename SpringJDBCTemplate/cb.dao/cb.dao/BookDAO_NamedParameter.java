package cb.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import cb.beans.Book;

@Repository(value = "BookDAO_named")
public class BookDAO_NamedParameter implements BookDAO {

	@Autowired
	private NamedParameterJdbcTemplate namedTemplate;
	
	@Override
	public int addBook(Book book) {		
		int rows = 0;
		String INSERT_BOOK = "insert into book values(:ISBN,:bookName,:publication,:price,:description,:author)";
		Map<String, Object>params = new HashMap<String,Object>();
		params.put("ISBN", book.getISBN());
		params.put("bookName", book.getBookName());
		params.put("publication", book.getPublication());
		params.put("price", book.getPrice());
		params.put("description", book.getDescription());
		params.put("author", book.getAuthor());
		rows = namedTemplate.update(INSERT_BOOK, params); 

		return rows;

	}

	@Override
	public int updateBook(long ISBN, int price) {

		int rows = 0;
		String UPDATE_BOOK = "update book set price=:price where ISBN=:ISBN";
		
		Map<String,Object>params = new HashMap<String,Object>();
		params.put("ISBN", ISBN);
		params.put("price",price);
		rows = namedTemplate.update(UPDATE_BOOK, params);
		return rows;
	}

	@Override
	public boolean deleteBook(long ISBN) {

		int rows = 0;
		boolean flag = false;
		String DELETE_BOOK = "delete from book where ISBN=:ISBN";
		
		Map<String,Object>params = new HashMap<String,Object>();
		params.put("ISBN", ISBN);
		rows=namedTemplate.update(DELETE_BOOK, params);
		if(rows > 0)
		  flag = true;

		return flag;
	}

}
