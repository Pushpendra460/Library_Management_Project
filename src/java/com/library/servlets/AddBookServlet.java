package com.library.servlets;

import com.library.util.DBConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String category = request.getParameter("category");

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO books (title, author, category) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, title);
            stmt.setString(2, author);
            stmt.setString(3, category);
            stmt.executeUpdate();
            response.sendRedirect("admin_dashboard.jsp?message=Book added successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("add_book.jsp"); 
}

}

