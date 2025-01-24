package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_005fmembership_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Update Membership</title>\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-color: #f8f9fa;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            margin-top: 50px;\n");
      out.write("        }\n");
      out.write("        .form-container {\n");
      out.write("            background-color: white;\n");
      out.write("            padding: 30px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("        header h2 {\n");
      out.write("            color: #343a40;\n");
      out.write("        }\n");
      out.write("        footer {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 30px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <!-- Header Section -->\n");
      out.write("        <header>\n");
      out.write("            <h2>Update Membership</h2>\n");
      out.write("            <nav>\n");
      out.write("                <ul class=\"list-unstyled\">\n");
      out.write("                    <li><a href=\"admin_dashboard.jsp\" class=\"btn btn-link\">Back to Dashboard</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <!-- Update Membership Form Section -->\n");
      out.write("        <section class=\"form-container\">\n");
      out.write("            <form action=\"UpdateMembershipServlet\" method=\"post\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"membership_no\">Membership Number:</label>\n");
      out.write("                    <input type=\"text\" id=\"membership_no\" name=\"membership_no\" class=\"form-control\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"extend_by\">Extend Membership By:</label>\n");
      out.write("                    <select id=\"extend_by\" name=\"extend_by\" class=\"form-control\" required>\n");
      out.write("                        <option value=\"6 months\" selected>6 months</option>\n");
      out.write("                        <option value=\"1 year\">1 year</option>\n");
      out.write("                        <option value=\"2 years\">2 years</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group form-check\">\n");
      out.write("                    <input type=\"checkbox\" class=\"form-check-input\" id=\"cancel_membership\" name=\"cancel_membership\" value=\"yes\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"cancel_membership\">Cancel Membership</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group text-center\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Update Membership</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Footer Section -->\n");
      out.write("        <footer>\n");
      out.write("            <p>&copy; 2025 Library Management System</p>\n");
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
