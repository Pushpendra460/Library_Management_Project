package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005fdashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>User Dashboard</title>\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-color: #f8f9fa;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            margin-top: 50px;\n");
      out.write("        }\n");
      out.write("        header h2 {\n");
      out.write("            color: #343a40;\n");
      out.write("        }\n");
      out.write("        .dashboard-list {\n");
      out.write("            list-style: none;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        .dashboard-list li {\n");
      out.write("            margin: 15px 0;\n");
      out.write("        }\n");
      out.write("        footer {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 30px;\n");
      out.write("        }\n");
      out.write("        .logout-btn {\n");
      out.write("            margin-top: 30px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <!-- Header Section -->\n");
      out.write("        <header>\n");
      out.write("            <h2>Welcome, User</h2>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <!-- User Dashboard Navigation -->\n");
      out.write("        <section>\n");
      out.write("            <h4>Select an option to proceed:</h4>\n");
      out.write("            <ul class=\"dashboard-list\">\n");
      out.write("                <li><a href=\"reports.jsp\" class=\"btn btn-primary btn-lg btn-block\">Generate Reports</a></li>\n");
      out.write("                <li><a href=\"transactions.jsp\" class=\"btn btn-success btn-lg btn-block\">Transactions</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Logout Button -->\n");
      out.write("        <div class=\"logout-btn\">\n");
      out.write("            <form action=\"LogoutServlet\" method=\"get\">\n");
      out.write("                <button type=\"submit\" class=\"btn btn-danger btn-lg btn-block\">Logout</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Footer Section -->\n");
      out.write("        <footer>\n");
      out.write("            <p>@This application was developed by Pushpendra Kumar Shah</p>\n");
      out.write("        </footer>\n");
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
