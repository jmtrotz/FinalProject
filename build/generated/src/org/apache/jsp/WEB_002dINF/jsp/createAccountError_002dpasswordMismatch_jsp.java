package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createAccountError_002dpasswordMismatch_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Easel</title>\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/logo.png\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container-fluid\" align=\"center\">\r\n");
      out.write("            <fieldset>\r\n");
      out.write("                <img src=\"images/error.png\">\r\n");
      out.write("                <h1>Error creating account: Passwords don't match</h1>\r\n");
      out.write("                <form action=\"createAccount.htm\">\r\n");
      out.write("                    <label>\r\n");
      out.write("                        <font color=\"red\">*</font>Student ID: \r\n");
      out.write("                        <input type=\"text\" name=\"studentID\"/>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <label>\r\n");
      out.write("                        <font color=\"red\">*</font>First Name: \r\n");
      out.write("                        <input type=\"text\" name=\"firstName\"/>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <label>\r\n");
      out.write("                        <font color=\"red\">*</font>Last Name: \r\n");
      out.write("                        <input type=\"text\" name=\"lastName\"/>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <label>\r\n");
      out.write("                        <font color=\"red\">*</font>Username: \r\n");
      out.write("                        <input type=\"text\" name=\"username\"/>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <label>\r\n");
      out.write("                        <font color=\"red\">*</font>Password: \r\n");
      out.write("                        <input type=\"password\" name=\"password\"/>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <label>\r\n");
      out.write("                        <font color=\"red\">*</font>Confirm Password: \r\n");
      out.write("                        <input type=\"password\" name=\"confirmPassword\"/>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <label>\r\n");
      out.write("                        Class 1: \r\n");
      out.write("                        <select id=\"classes1\" name=\"class1\">\r\n");
      out.write("                            <option selected value=\"null\">None</option>\r\n");
      out.write("                            <option value=\"cs225\">CS 225</option>\r\n");
      out.write("                            <option value=\"cs230\">CS 230</option>\r\n");
      out.write("                            <option value=\"cs316\">CS 316</option>\r\n");
      out.write("                            <option value=\"ct376\">CT 376</option>\r\n");
      out.write("                            <option value=\"ct406\">CT 406</option>\r\n");
      out.write("                            <option value=\"se321\">SE 321</option>\r\n");
      out.write("                            <option value=\"se458\">SE 458</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <label>\r\n");
      out.write("                        Class 2: \r\n");
      out.write("                        <select id=\"classes2\" name=\"class2\">\r\n");
      out.write("                            <option selected value=\"null\">None</option>\r\n");
      out.write("                            <option value=\"cs225\">CS 225</option>\r\n");
      out.write("                            <option value=\"cs230\">CS 230</option>\r\n");
      out.write("                            <option value=\"cs316\">CS 316</option>\r\n");
      out.write("                            <option value=\"ct376\">CT 376</option>\r\n");
      out.write("                            <option value=\"ct406\">CT 406</option>\r\n");
      out.write("                            <option value=\"se321\">SE 321</option>\r\n");
      out.write("                            <option value=\"se458\">SE 458</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <label>\r\n");
      out.write("                        Class 3: \r\n");
      out.write("                        <select id=\"classes3\" name=\"class3\">\r\n");
      out.write("                            <option selected value=\"null\">None</option>\r\n");
      out.write("                            <option value=\"cs225\">CS 225</option>\r\n");
      out.write("                            <option value=\"cs230\">CS 230</option>\r\n");
      out.write("                            <option value=\"cs316\">CS 316</option>\r\n");
      out.write("                            <option value=\"ct376\">CT 376</option>\r\n");
      out.write("                            <option value=\"ct406\">CT 406</option>\r\n");
      out.write("                            <option value=\"se321\">SE 321</option>\r\n");
      out.write("                            <option value=\"se458\">SE 458</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <label>\r\n");
      out.write("                        Class 4: \r\n");
      out.write("                        <select id=\"classes4\" name=\"class4\">\r\n");
      out.write("                            <option selected value=\"null\">None</option>\r\n");
      out.write("                            <option value=\"cs225\">CS 225</option>\r\n");
      out.write("                            <option value=\"cs230\">CS 230</option>\r\n");
      out.write("                            <option value=\"cs316\">CS 316</option>\r\n");
      out.write("                            <option value=\"ct376\">CT 376</option>\r\n");
      out.write("                            <option value=\"ct406\">CT 406</option>\r\n");
      out.write("                            <option value=\"se321\">SE 321</option>\r\n");
      out.write("                            <option value=\"se458\">SE 458</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <label>\r\n");
      out.write("                        Class 5: \r\n");
      out.write("                        <select id=\"classes5\" name=\"class5\">\r\n");
      out.write("                            <option selected value=\"null\">None</option>\r\n");
      out.write("                            <option value=\"cs225\">CS 225</option>\r\n");
      out.write("                            <option value=\"cs230\">CS 230</option>\r\n");
      out.write("                            <option value=\"cs316\">CS 316</option>\r\n");
      out.write("                            <option value=\"ct376\">CT 376</option>\r\n");
      out.write("                            <option value=\"ct406\">CT 406</option>\r\n");
      out.write("                            <option value=\"se321\">SE 321</option>\r\n");
      out.write("                            <option value=\"se458\">SE 458</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <label>\r\n");
      out.write("                        Class 6: \r\n");
      out.write("                        <select id=\"classes6\" name=\"class6\">\r\n");
      out.write("                            <option selected value=\"null\">None</option>\r\n");
      out.write("                            <option value=\"cs225\">CS 225</option>\r\n");
      out.write("                            <option value=\"cs230\">CS 230</option>\r\n");
      out.write("                            <option value=\"cs316\">CS 316</option>\r\n");
      out.write("                            <option value=\"ct376\">CT 376</option>\r\n");
      out.write("                            <option value=\"ct406\">CT 406</option>\r\n");
      out.write("                            <option value=\"se321\">SE 321</option>\r\n");
      out.write("                            <option value=\"se458\">SE 458</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <label>\r\n");
      out.write("                        Class 7: \r\n");
      out.write("                        <select id=\"classes7\" name=\"class7\">\r\n");
      out.write("                            <option selected value=\"null\">None</option>\r\n");
      out.write("                            <option value=\"cs225\">CS 225</option>\r\n");
      out.write("                            <option value=\"cs230\">CS 230</option>\r\n");
      out.write("                            <option value=\"cs316\">CS 316</option>\r\n");
      out.write("                            <option value=\"ct376\">CT 376</option>\r\n");
      out.write("                            <option value=\"ct406\">CT 406</option>\r\n");
      out.write("                            <option value=\"se321\">SE 321</option>\r\n");
      out.write("                            <option value=\"se458\">SE 458</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <input type=\"submit\" value=\"Create Account\"/>\r\n");
      out.write("                </form>\r\n");
      out.write("            </fieldset>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
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
