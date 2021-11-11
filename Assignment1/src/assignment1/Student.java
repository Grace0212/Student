package assignment1;

import java.sql.*;
public class Student {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		// Connect to database
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/db1?" +
			    	                                   "serverTimezone=Asia/Shanghai&user=root&password=1234");	
			
				// Create a statement to retrieve objects
				Statement s = conn.createStatement();        

				// Retrieve results from the table
				ResultSet rs = s.executeQuery ("Select * from Students"); 
				
				// Print columns headers
				ResultSetMetaData rsmd =rs.getMetaData(); 
				int i =rsmd.getColumnCount( );
				
				for(int j=1; j<=i; j++) { 
					System.out.print(rsmd.getColumnName(j)+"\t"); 
					System.out.print(" "); 
				} 

				// Print records
				while(rs.next( ) ) { 
					for(int j=1; j<=i; j++) 
					{ 
						System.out.print ( rs.getString( j)+"\t"); 
					}
				}

	}

}
