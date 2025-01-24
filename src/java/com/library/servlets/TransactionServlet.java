package com.library.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/TransactionServlet")
public class TransactionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

   
    private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:xe"; 
    private static final String JDBC_USERNAME = "lib_sys"; 
    private static final String JDBC_PASSWORD = "library"; 

    
    private Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookId = request.getParameter("bookId");
        String membershipNo = request.getParameter("membershipNo");
        String transactionType = request.getParameter("transactionType");

        String successMessage = "";
        String errorMessage = "";

        try {
           
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);

           
            if ("borrow".equalsIgnoreCase(transactionType)) {
                String checkAvailabilityQuery = "SELECT availability FROM books WHERE book_id = ?";
                stmt = conn.prepareStatement(checkAvailabilityQuery);
                stmt.setString(1, bookId);
                rs = stmt.executeQuery();

                if (rs.next() && rs.getInt("availability") > 0) {
                   
                    String updateBookQuery = "UPDATE books SET availability = availability - 1 WHERE book_id = ?";
                    stmt = conn.prepareStatement(updateBookQuery);
                    stmt.setString(1, bookId);
                    stmt.executeUpdate();

                   
                    String insertTransactionQuery = "INSERT INTO transactions (book_id, membership_no, transaction_type) VALUES (?, ?, ?)";
                    stmt = conn.prepareStatement(insertTransactionQuery);
                    stmt.setString(1, bookId);
                    stmt.setString(2, membershipNo);
                    stmt.setString(3, transactionType);
                    stmt.executeUpdate();

                    successMessage = "Transaction processed successfully!";
                } else {
                    errorMessage = "Book is not available for borrowing.";
                }
            } else if ("return".equalsIgnoreCase(transactionType)) {
               
                String updateBookQuery = "UPDATE books SET availability = availability + 1 WHERE book_id = ?";
                stmt = conn.prepareStatement(updateBookQuery);
                stmt.setString(1, bookId);
                stmt.executeUpdate();

                
                String insertTransactionQuery = "INSERT INTO transactions (book_id, membership_no, transaction_type) VALUES (?, ?, ?)";
                stmt = conn.prepareStatement(insertTransactionQuery);
                stmt.setString(1, bookId);
                stmt.setString(2, membershipNo);
                stmt.setString(3, transactionType);
                stmt.executeUpdate();

                successMessage = "Transaction processed successfully!";
            }

        } catch (SQLException e) {
            errorMessage = "Error: " + e.getMessage();
        } finally {
           
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                errorMessage = "Error while closing resources: " + e.getMessage();
            }
        }

      
        request.setAttribute("successMessage", successMessage);
        request.setAttribute("errorMessage", errorMessage);
        request.getRequestDispatcher("transaction.jsp").forward(request, response);
    }
     @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("transaction.jsp"); 
}
}
