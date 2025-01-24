package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pay_005ffine_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Fine Payment</title>\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-color: #f8f9fa;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            max-width: 600px;\n");
      out.write("            margin-top: 50px;\n");
      out.write("        }\n");
      out.write("        .form-container {\n");
      out.write("            background-color: #ffffff;\n");
      out.write("            padding: 30px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("        h2 {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .form-group {\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("        }\n");
      out.write("        .form-control {\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
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
      out.write("            <h2 class=\"text-center\">Pay Fine</h2>\n");
      out.write("            <form action=\"FinePaymentServlet\" method=\"post\">\n");
      out.write("\n");
      out.write("                <!-- Book Name -->\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"bookName\">Book Name:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"book_name\" value=\"");
      out.print( request.getParameter("book") );
      out.write("\" readonly>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Fine Amount -->\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"fineAmount\">Fine Amount:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"fine_amount\" value=\"");
      out.print( request.getParameter("fine") );
      out.write("\" readonly>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Fine Paid Checkbox -->\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"finePaid\">Fine Paid:</label>\n");
      out.write("                    <div class=\"form-check\">\n");
      out.write("                        <input type=\"checkbox\" class=\"form-check-input\" name=\"fine_paid\" value=\"yes\">\n");
      out.write("                        <label class=\"form-check-label\" for=\"finePaid\">Yes</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Remarks -->\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"remarks\">Remarks:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"remarks\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Submit Button -->\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary btn-custom\">Confirm Payment</button>\n");
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
