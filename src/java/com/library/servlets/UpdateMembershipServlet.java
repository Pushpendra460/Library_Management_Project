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

//@WebServlet("/UpdateMembershipServlet")
public class UpdateMembershipServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String membershipNo = request.getParameter("membership_no");
        String extendBy = request.getParameter("extend_by");
        String cancelMembership = request.getParameter("cancel_membership");

        try (Connection conn = DBConnection.getConnection()) {
            if ("yes".equals(cancelMembership)) {
              
                String sql = "DELETE FROM members WHERE membership_no = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, membershipNo);
                stmt.executeUpdate();
                response.sendRedirect("user_dashboard.jsp?message=Membership Canceled Successfully");
            } else {
                
                String sql = "UPDATE members SET membership_type = ? WHERE membership_no = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, extendBy);
                stmt.setString(2, membershipNo);
                stmt.executeUpdate();
                response.sendRedirect("user_dashboard.jsp?message=Membership Extended Successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("update_membership.jsp"); 
}
}
