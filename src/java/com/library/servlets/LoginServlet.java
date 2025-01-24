package com.library.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class LoginServlet extends HttpServlet {

    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String DB_USERNAME = "lib_sys";
    private static final String DB_PASSWORD = "library";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        System.out.println("Received Login Request: Username = " + username + ", Role = " + role);

        if (validateLogin(username, password, role)) {
            System.out.println("Login Successful!");
            if ("admin".equals(role)) {
                response.sendRedirect("admin_dashboard.jsp");
            } else if ("user".equals(role)) {
                response.sendRedirect("user_dashboard.jsp");
            }
        } else {
            System.out.println("Invalid Credentials!");
            request.setAttribute("errorMessage", "Invalid username, password, or role.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("login.jsp");
    }

    private boolean validateLogin(String username, String password, String role) {
        boolean isValid = false;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            String query = "SELECT password, role FROM members WHERE username = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, username);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String storedPassword = resultSet.getString("password");
                String storedRole = resultSet.getString("role");

                if (storedPassword.equals(password) && storedRole.equalsIgnoreCase(role)) {
                    isValid = true;
                }
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isValid;
    }
}
