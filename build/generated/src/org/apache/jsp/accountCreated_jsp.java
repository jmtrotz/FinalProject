package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class accountCreated_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv = \"Content-Type\" content = \"text/html; charset=UTF-8\">\n");
      out.write("        <title>\n");
      out.write("            Easel\n");
      out.write("        </title>\n");
      out.write("        <link rel = \"shortcut icon\" href = \"images/logo.png\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid bg-1 text-center\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>\n");
      out.write("                    Login\n");
      out.write("                    (<font color = \"red\">*</font> = required)\n");
      out.write("                </legend>\n");
      out.write("                <h1>\n");
      out.write("                    Your account has been created! Please try logging in\n");
      out.write("                </h1>\n");
      out.write("                <form action = \"login\" method = \"post\">\n");
      out.write("                    <label>\n");
      out.write("                        <font color = \"red\">*</font>Username: \n");
      out.write("                        <input type = \"text\" name = \"username\"/>\n");
      out.write("                    </label>\n");
      out.write("                    <br>\n");
      out.write("                    <label>\n");
      out.write("                        <font color = \"red\">*</font>Password: \n");
      out.write("                        <input type = \"password\" name = \"password\"/>\n");
      out.write("                    </label>\n");
      out.write("                    <br>\n");
      out.write("                    <input type = \"submit\" value = \"Login\"/>\n");
      out.write("                    <br>\n");
      out.write("                </form>\n");
      out.write("            </fieldset>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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