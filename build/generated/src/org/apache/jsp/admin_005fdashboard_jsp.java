package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fdashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Admin Dashboard</title>\n");
      out.write("    <!-- Bootstrap CSS Link -->\n");
      out.write("    <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-color: #f8f9fa;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .dashboard-container {\n");
      out.write("            max-width: 900px;\n");
      out.write("            margin: 50px auto;\n");
      out.write("            padding: 30px;\n");
      out.write("            background-color: #fff;\n");
      out.write("            box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);\n");
      out.write("            border-radius: 8px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .dashboard-container h2 {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-bottom: 30px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .list-group-item {\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .list-group-item:hover {\n");
      out.write("            background-color: #e2e6ea;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .logout-btn {\n");
      out.write("            margin-top: 30px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"dashboard-container\">\n");
      out.write("        <h2>Welcome, Admin</h2>\n");
      out.write("\n");
      out.write("        <div class=\"list-group\">\n");
      out.write("            <a href=\"add_book.jsp\" class=\"list-group-item list-group-item-action\">Add Book</a>\n");
      out.write("            <a href=\"add_membership.jsp\" class=\"list-group-item list-group-item-action\">Add Membership</a>\n");
      out.write("            <a href=\"maintenance.jsp\" class=\"list-group-item list-group-item-action\">Maintenance</a>\n");
      out.write("            <a href=\"reports.jsp\" class=\"list-group-item list-group-item-action\">Generate Reports</a>\n");
      out.write("            <a href=\"transactions.jsp\" class=\"list-group-item list-group-item-action\">Transactions</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Logout Button -->\n");
      out.write("        <div class=\"logout-btn\">\n");
      out.write("            <form action=\"LogoutServlet\" method=\"get\">\n");
      out.write("                <button type=\"submit\" class=\"btn btn-danger btn-block\">Logout</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap JS and jQuery Scripts -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
