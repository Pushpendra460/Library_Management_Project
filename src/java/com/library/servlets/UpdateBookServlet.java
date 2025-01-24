package com.library.servlets;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/UpdateBookServlet")
public class UpdateBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int bookId = Integer.parseInt(request.getParameter("bookId"));
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        
       
        try {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "lib_sys", "library");

            String updateQuery = "UPDATE books SET title = ?, author = ?, quantity = ? WHERE book_id = ?";
            PreparedStatement ps = conn.prepareStatement(updateQuery);
            ps.setString(1, title);
            ps.setString(2, author);
            ps.setInt(3, quantity);
            ps.setInt(4, bookId);

            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated > 0) {
               
                response.sendRedirect("admin_dashboard.jsp");
            } else {
               
                request.setAttribute("errorMessage", "Failed to update the book details.");
                request.getRequestDispatcher("update_Book.jsp").forward(request, response);
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Database error: " + e.getMessage());
            request.getRequestDispatcher("update_Book.jsp").forward(request, response);
        }
    }
     @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("update_book.jsp"); 
}
}
