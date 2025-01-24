package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class maintenance_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Library Management - Maintenance</title>\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-color: #f8f9fa;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            margin-top: 50px;\n");
      out.write("        }\n");
      out.write("        .card {\n");
      out.write("            margin-bottom: 30px;\n");
      out.write("        }\n");
      out.write("        h3, h4 {\n");
      out.write("            color: #007bff;\n");
      out.write("        }\n");
      out.write("        .form-group label {\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .btn {\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("        .navbar {\n");
      out.write("            margin-bottom: 40px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2 class=\"text-center text-primary mb-5\">Welcome to Library Management - Maintenance</h2>\n");
      out.write("\n");
      out.write("        <!-- Navigation -->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light mb-4\">\n");
      out.write("            <ul class=\"navbar-nav mx-auto\">\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"add_book.jsp\">Add Book</a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"update_book.jsp\">Update Book</a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"add_membership.jsp\">Add Membership</a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"update_membership.jsp\">Update Membership</a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"ManageUsers.jsp\">Manage Users</a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"LogoutServlet\">Logout</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!-- Maintenance Actions -->\n");
      out.write("        <div class=\"maintenance-actions\">\n");
      out.write("\n");
      out.write("            <h3>Select an option to perform maintenance tasks</h3>\n");
      out.write("\n");
      out.write("            <!-- Add Book Form -->\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-header\">\n");
      out.write("                    <h4>Add Book</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form action=\"AddBookServlet\" method=\"post\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"bookTitle\">Book Title</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"bookTitle\" name=\"bookTitle\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"author\">Author</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"author\" name=\"author\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"genre\">Genre</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"genre\" name=\"genre\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"publisher\">Publisher</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"publisher\" name=\"publisher\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"price\">Price</label>\n");
      out.write("                            <input type=\"number\" class=\"form-control\" id=\"price\" name=\"price\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Add Book</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Update Book Form -->\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-header\">\n");
      out.write("                    <h4>Update Book</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form action=\"UpdateBookServlet\" method=\"post\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"bookId\">Book ID</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"bookId\" name=\"bookId\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"newTitle\">New Title</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"newTitle\" name=\"newTitle\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"newAuthor\">New Author</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"newAuthor\" name=\"newAuthor\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"newPrice\">New Price</label>\n");
      out.write("                            <input type=\"number\" class=\"form-control\" id=\"newPrice\" name=\"newPrice\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-warning\">Update Book</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Add Membership Form -->\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-header\">\n");
      out.write("                    <h4>Add Membership</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form action=\"AddMembershipServlet\" method=\"post\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"membershipNo\">Membership No</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"membershipNo\" name=\"membershipNo\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"name\">Member Name</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"name\" name=\"name\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"membershipType\">Membership Type</label>\n");
      out.write("                            <select class=\"form-control\" id=\"membershipType\" name=\"membershipType\">\n");
      out.write("                                <option value=\"6 Months\" selected>6 Months</option>\n");
      out.write("                                <option value=\"1 Year\">1 Year</option>\n");
      out.write("                                <option value=\"2 Years\">2 Years</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"phone\">Phone</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"phone\" name=\"phone\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Add Membership</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Update Membership Form -->\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-header\">\n");
      out.write("                    <h4>Update Membership</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form action=\"UpdateMembershipServlet\" method=\"post\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"membershipNoToUpdate\">Membership No</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"membershipNoToUpdate\" name=\"membershipNoToUpdate\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"newMembershipType\">New Membership Type</label>\n");
      out.write("                            <select class=\"form-control\" id=\"newMembershipType\" name=\"newMembershipType\">\n");
      out.write("                                <option value=\"6 Months\" selected>6 Months</option>\n");
      out.write("                                <option value=\"1 Year\">1 Year</option>\n");
      out.write("                                <option value=\"2 Years\">2 Years</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-warning\">Update Membership</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap JS, Popper.js, and jQuery -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
