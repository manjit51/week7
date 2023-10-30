package projects;
import java.sql.*;
import projects.dao.DbConnection;

public class ProjectsApp {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		try {
		DbConnection.getConnection();
		} catch(SQLException e) {
			System.out.println("rip bozo");
		}
	}

}
