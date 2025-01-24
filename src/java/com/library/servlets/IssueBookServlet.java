package com.library.servlets;

import com.library.util.DBConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/IssueBookServlet")
public class IssueBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String bookName = request.getParameter("book_name");
        String author = request.getParameter("author");
        String issueDate = request.getParameter("issue_date");
        String returnDate = request.getParameter("return_date");

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO transactions (user_id, book_id, issue_date, return_date) " +
                         "VALUES (?, (SELECT book_id FROM books WHERE title=? AND author=?), ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, (Integer) request.getSession().getAttribute("userId"));
            stmt.setString(2, bookName);
            stmt.setString(3, author);
            stmt.setString(4, issueDate);
            stmt.setString(5, returnDate);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                response.sendRedirect("user_dashboard.jsp?message=Book Issued Successfully");
            } else {
                response.sendRedirect("issue_book.jsp?error=Book Not Available");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("issue_book.jsp");
}
}
