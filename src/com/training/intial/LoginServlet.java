package comVan;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
		try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		String url = "jdbc:sqlserver://localhost:1433;"+"databaseName=uk;"+"encrypt=true;trustServerCertificate=true";

		String user="sa";
						
		String password="Brother@12345";
		
		
		Connection con = DriverManager.getConnection(url,user,password);
		
		String query="select *from Login;";
		
		
	java.sql.Statement stmt= con.createStatement();
		ResultSet rs= stmt.executeQuery(query);
		
		String usernameFromDb=null;
		String passwordFromDb=null;
		
			
		
		while(rs.next())
		{
			System.out.println("inside database");
			
			
			usernameFromDb=rs.getString("username");
			System.out.println(usernameFromDb);
			passwordFromDb=rs.getString("password");
			
		}
		
		String n=request.getParameter("username");
		
		String pwd=request.getParameter("password");
		
		PrintWriter out=response.getWriter();
		
	
		if(usernameFromDb.equalsIgnoreCase(n))
		{
			request.setAttribute("username",n);
			
			RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
			
		}
		else
		{
			
			out.println("Sorry invalid credentials.. Try again");
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
	
			rd.include(request, response);
			
		}}
			
		catch (ClassNotFoundException |SQLException e) {
			
			e.printStackTrace();
		}
			
	}
}
	
				
				
				
		
		
	


