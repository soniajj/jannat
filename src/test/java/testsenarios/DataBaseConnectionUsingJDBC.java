package testsenarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseConnectionUsingJDBC {
	// Connect to Database from Eclipse
		// 1. Download the JDBC dependency
		static Connection cnn;
		static Statement stmt;
		static ResultSet resultset;


	public static void main(String[] args) throws Exception {
		// Connect the DB
				String databaseURL = "jdbc:mysql://127.0.0.1:3306/jannat_database";
				String username = "root";
				String password = "root";

				Class.forName("com.mysql.cj.jdbc.Driver");
				cnn = DriverManager.getConnection(databaseURL, username, password);
				System.out.println("DataBase connection done");
				// Write the sql query
				String myquery = "SELECT * FROM Employies;";
				stmt = cnn.createStatement();

				// Run the sql query- Execute the Query
				resultset = stmt.executeQuery(myquery);
				// The statement execution done, the results will store into resultset variable
				// [temp store into
				// RMA location]
				// Print the results into Console
				// Run while loop n number of rows ...
				while (resultset.next()) {
					// STD_ID, STD_NAME, EMAIL, ADDRESS, CITY, STATE, COUNTRY
					String STD_ID = resultset.getString(1);
					String STD_NAME = resultset.getString(2);
					String EMAIL = resultset.getString(3);
					String CITY = resultset.getString(4);
					

					System.out.println(STD_ID + "\t" + STD_NAME + "\t" + EMAIL + "\t" + CITY);

				} // while loop end

				// Close the database connection
				cnn.close();
				System.out.println("DataBase connection closed");

			}

		


	}


