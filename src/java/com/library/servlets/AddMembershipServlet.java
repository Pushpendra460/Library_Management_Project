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

//@WebServlet("/AddMembershipServlet")
public class AddMembershipServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String membershipType = request.getParameter("membership_type");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO members (name, membership_type, address, phone) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, membershipType);
            stmt.setString(3, address);
            stmt.setString(4, phone);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                response.sendRedirect("user_dashboard.jsp?message=Membership Added Successfully");
            } else {
                response.sendRedirect("add_membership.jsp?error=Failed to Add Membership");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("add_membership.jsp"); 
}
}
