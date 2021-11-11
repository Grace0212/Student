package student;

import java.sql.*;
import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) throws Exception {
		Studentmvc model = StuDatabase();
		StudentView view = new StudentView();
		Controller controller =new Controller(model, view);
		controller.selectView();
		
	}

	private static Studentmvc StuDatabase() throws Exception {
		String url="jdbc:mysql://localhost:3307/db1?&serverTimezone=Asia/Shanghai";
		String name="root";
		String password="1234";
		
		Connection com=DriverManager.getConnection(url,name,password);
		
		System.out.println("Please enter the id:");
		int a = new Scanner(System.in).nextInt();
		
		String sql="select id,Name,MathMark,ScienceMark from Student where id='"+a+"'";
		
		Statement ps=com.prepareStatement(sql);
		ResultSet rs =ps.executeQuery(sql);
		Studentmvc stud=new Studentmvc();
		
		 while(rs.next()){
			 stud.setId(rs.getInt(1));
			 stud.setName(rs.getString(2));
			 stud.setMathMark(rs.getString(3));
			 stud.setScienceMark(rs.getString(4));
			 
//	            for () {
//	                System.out.println( rs.getString(i) );
//	            }
	        }
	
		return stud;
		// TODO Auto-generated method stub
		
	}

}
