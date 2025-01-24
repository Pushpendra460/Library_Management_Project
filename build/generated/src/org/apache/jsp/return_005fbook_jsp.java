package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class return_005fbook_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Return Book</title>\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-color: #f8f9fa;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("            max-width: 600px;\n");
      out.write("            margin-top: 50px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-container {\n");
      out.write("            background-color: #ffffff;\n");
      out.write("            padding: 30px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h2 {\n");
      out.write("            margin-bottom: 30px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-group {\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn-custom {\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"form-container\">\n");
      out.write("            <h2 class=\"text-center\">Return a Book</h2>\n");
      out.write("\n");
      out.write("            <form action=\"ReturnBookServlet\" method=\"post\">\n");
      out.write("\n");
      out.write("                <!-- Book Name -->\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"book_name\">Book Name:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"book_name\" name=\"book_name\" required>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Author -->\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"author\">Author:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"author\" name=\"author\" required>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Serial No -->\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"serial_no\">Serial No:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"serial_no\" name=\"serial_no\" required>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Issue Date -->\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"issue_date\">Issue Date:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"issue_date\" name=\"issue_date\" required>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Return Date -->\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"return_date\">Return Date:</label>\n");
      out.write("                    <input type=\"date\" class=\"form-control\" id=\"return_date\" name=\"return_date\" required>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Submit Button -->\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary btn-custom\">Return Book</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap JS and jQuery -->\n");
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
