package projects.dao;
import java.sql.*;

public class DbConnection {
	
	private static String HOST = "localhost";
	private static String PASSWORD = "159875321asdW";
	private static int PORT = 3306;
	private static String SCHEMA = "projects";
	private static String USER = "root";
	
	public static Connection getConnection() throws SQLException{
		String uri = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s", HOST, PORT, SCHEMA, USER, PASSWORD);
		Connection dm = null;
		try {
			dm = DriverManager.getConnection(uri, USER, PASSWORD);
			System.out.println("Connection succesfull!");
			return dm;
		} catch(SQLException e) {
			System.out.println("Connection failed!  "+uri);
			throw new SQLException("DbException");
		}
	}
}
