package com.library.servlets;

import com.library.util.DBConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/ReturnBookServlet")
public class ReturnBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String bookName = request.getParameter("book_name");
        String serialNo = request.getParameter("serial_no");
        String returnDate = request.getParameter("return_date");

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT issue_date FROM transactions WHERE book_id = " +
                         "(SELECT book_id FROM books WHERE title = ?) " +
                         "AND serial_no = ? AND return_date IS NULL";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, bookName);
            stmt.setString(2, serialNo);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String issueDate = rs.getString("issue_date");

                
                long fine = 0;
                long daysLate = (new SimpleDateFormat("yyyy-MM-dd").parse(returnDate).getTime() - 
                                 new SimpleDateFormat("yyyy-MM-dd").parse(issueDate).getTime()) / (1000 * 60 * 60 * 24);
                if (daysLate > 15) {
                    fine = (daysLate - 15) * 10; 
                }

               
                sql = "UPDATE transactions SET return_date = ?, fine = ? " +
                      "WHERE book_id = (SELECT book_id FROM books WHERE title = ?) AND serial_no = ?";
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, returnDate);
                stmt.setLong(2, fine);
                stmt.setString(3, bookName);
                stmt.setString(4, serialNo);
                stmt.executeUpdate();

               
                if (fine > 0) {
                    response.sendRedirect("pay_fine.jsp?book=" + bookName + "&fine=" + fine);
                } else {
                    response.sendRedirect("user_dashboard.jsp?message=Book Returned Successfully");
                }
            } else {
                response.sendRedirect("return_book.jsp?error=Book Not Found");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("return_book.jsp?error=An error occurred while processing the return.");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("return_book.jsp"); 
    }
}
