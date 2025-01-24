package com.library.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


//@WebServlet("/SignUpServlet") 
public class SignUpServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        
        String membershipNo = request.getParameter("membership_no");
        String name = request.getParameter("name");
        String membershipType = request.getParameter("membership_type");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); 

           
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "lib_sys", "library");

           
            String query = "INSERT INTO MEMBERS (MEMBERSHIP_NO, NAME, MEMBERSHIP_TYPE, ADDRESS, PHONE, USERNAME, PASSWORD, ROLE) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, Integer.parseInt(membershipNo));
            ps.setString(2, name);
            ps.setString(3, membershipType);
            ps.setString(4, address);
            ps.setString(5, phone);
            ps.setString(6, username);
            ps.setString(7, password);
            ps.setString(8, role);

            int result = ps.executeUpdate();

            if (result > 0) {
                response.sendRedirect("success.jsp");  
            } else {
                request.setAttribute("errorMessage", "Sign-up failed. Please try again.");
                request.getRequestDispatcher("sign_up.jsp").forward(request, response);
            }

           
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "An error occurred: " + e.getMessage());
            request.getRequestDispatcher("sign_up.jsp").forward(request, response);
        }
    }
     @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("sign_up.jsp"); 
}
}
