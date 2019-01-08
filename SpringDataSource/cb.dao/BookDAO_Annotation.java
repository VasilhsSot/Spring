package cb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cb.beans.Book;

@Repository(value = "bookDAO_new")
public class BookDAO_Annotation implements BookDAO {
	@Autowired
	private DataSource dataSource;

	@Override
	public int addBook(Book book) {

		int rows = 0;
		String INSERT_BOOK = "insert into book values(?, ?, ?, ?, ?, ?)";
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(INSERT_BOOK);
			ps.setLong(1, book.getISBN());
			ps.setString(2, book.getBookName());
			ps.setString(3, book.getPublication());
			ps.setInt(4, book.getPrice());
			ps.setString(5, book.getDescription());
			ps.setString(6, book.getAuthor());
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

	@Override
	public ArrayList<Book> getBooks() {
		ResultSet rs;
		ArrayList<Book> books = new ArrayList<Book>();
		String query = "select * from book;";
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(query);
			rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					Book book = new Book();
					book.setAuthor(rs.getString("author"));
					book.setBookName(rs.getString("bookName"));
					book.setDescription(rs.getString("description"));
					book.setISBN(rs.getLong("ISBN"));
					book.setPrice(rs.getInt("price"));
					book.setPublication(rs.getString("publication"));
					books.add(book);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return books;
	}

}
