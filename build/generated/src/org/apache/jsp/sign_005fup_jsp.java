package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sign_005fup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Library Membership Sign-Up</title>\n");
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
      out.write("            padding: 30px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        h2 {\n");
      out.write("            color: #007bff;\n");
      out.write("        }\n");
      out.write("        .form-group label {\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .btn {\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("        .error-message {\n");
      out.write("            color: red;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2 class=\"text-center mb-4\">Library Membership Registration</h2>\n");
      out.write("\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <form action=\"SignUpServlet\" method=\"post\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"membership_no\">Membership No</label>\n");
      out.write("                    <input type=\"number\" class=\"form-control\" name=\"membership_no\" required>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"name\">Full Name</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"name\" required>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"membership_type\">Membership Type</label>\n");
      out.write("                    <select class=\"form-control\" name=\"membership_type\">\n");
      out.write("                        <option value=\"6 months\">6 months</option>\n");
      out.write("                        <option value=\"1 year\">1 year</option>\n");
      out.write("                        <option value=\"2 years\">2 years</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"address\">Address</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"address\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"phone\">Phone</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"phone\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"username\">Username</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"username\" required>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"password\">Password</label>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" name=\"password\" required>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"role\">Role</label>\n");
      out.write("                    <select class=\"form-control\" name=\"role\">\n");
      out.write("                        <option value=\"user\">User</option>\n");
      out.write("                        <option value=\"admin\">Admin</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Sign Up</button>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <p class=\"error-message mt-3\">\n");
      out.write("                ");
      out.print( request.getAttribute("errorMessage") != null ? request.getAttribute("errorMessage") : "" );
      out.write("\n");
      out.write("            </p>\n");
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
