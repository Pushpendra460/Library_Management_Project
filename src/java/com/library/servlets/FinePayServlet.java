package com.library.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

//@WebServlet("/PayFineServlet")
public class FinePayServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

   
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String DB_USERNAME = "lib_sys";  
    private static final String DB_PASSWORD = "library";  

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        
        String membershipNo = request.getParameter("membershipNo");
        double fineAmount = Double.parseDouble(request.getParameter("fineAmount"));

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

          
            String checkQuery = "SELECT fine FROM membership WHERE membership_no = ?";
            preparedStatement = connection.prepareStatement(checkQuery);
            preparedStatement.setString(1, membershipNo);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                double currentFine = resultSet.getDouble("fine");

               
                if (currentFine > 0) {
                    double updatedFine = currentFine - fineAmount;

                    
                    String updateQuery = "UPDATE membership SET fine = ? WHERE membership_no = ?";
                    preparedStatement = connection.prepareStatement(updateQuery);
                    preparedStatement.setDouble(1, updatedFine);
                    preparedStatement.setString(2, membershipNo);
                    int rowsUpdated = preparedStatement.executeUpdate();

                    if (rowsUpdated > 0) {
                        out.println("<html><body><h3>Fine paid successfully!</h3>");
                        out.println("<p>Updated Fine: " + updatedFine + "</p>");
                        out.println("<a href='Dashboard.jsp'>Go back to Dashboard</a></body></html>");
                    } else {
                        out.println("<html><body><h3>Error: Fine payment failed.</h3></body></html>");
                    }
                } else {
                    out.println("<html><body><h3>No fine due for this membership number.</h3></body></html>");
                }
            } else {
                out.println("<html><body><h3>Error: Invalid Membership Number.</h3></body></html>");
            }
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
    @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("pay_fine.jsp"); 
}
}
