package com.library.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/GenerateReportsServlet")
public class GenerateReportServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Database connection details
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String DB_USERNAME = "lib_sys"; 
    private static final String DB_PASSWORD = "library";  

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
           
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            
            String query = "SELECT title, author, category FROM books";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

           
            out.println("<html><body>");
            out.println("<h2>Library Book Report</h2>");
            out.println("<table border='1'><tr><th>Title</th><th>Author</th><th>Category</th></tr>");
            while (resultSet.next()) {
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                String category = resultSet.getString("category");

                out.println("<tr>");
                out.println("<td>" + title + "</td>");
                out.println("<td>" + author + "</td>");
                out.println("<td>" + category + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("<br>");
            out.println("<a href='admin_dashboard.jsp'>Back to Dashboard</a>");
            out.println("</body></html>");
        } catch (Exception e) {
            e.printStackTrace();
            out.println("<html><body><h3>Error: " + e.getMessage() + "</h3></body></html>");
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        
    }
    
}
