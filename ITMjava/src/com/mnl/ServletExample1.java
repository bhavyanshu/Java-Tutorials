package com.mnl;

/**
 * Program 2.1
 * 
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class ServletExample1 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title> Login Details </title>");
		out.println("</head>");
		out.println("<body bgcolor=\"white\">");
		out.println("<h1> Username : " + username + "</h1><br/>");
		out.println("<h1> Password : " + password + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}

/**
 HTML Page that calls this servlet -> login.html
    <HTML>  
    <head>  
    <title>Login page </title>  
    </head>  
    <BODY>  
    <br>  
    <p> <h3><center>Please enter your user name and password</center></h3></p>  
    <br>  
    <br>  
    <form method="get" action="servlet/ServletExample1">  
    <center>username</center>  
    <center><input type = "text" name="username"></center>  
    <center>password</center>  
    <center><input type = "password" name ="password"></center>  
    <center><input type="submit" name="Submit"value="submit"></center>  
    </form>  
    </BODY>  
    </HTML>
 */