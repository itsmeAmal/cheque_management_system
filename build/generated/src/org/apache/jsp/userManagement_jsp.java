package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userManagement_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User Management</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"#\">\n");
      out.write("            <div style=\"position: absolute; left: 20%; top: 2%; width: 60%; height: 80%; background-color: #cccccc\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\" style=\"position: absolute; left: 22%; top: 5%; width: 56%; height: 100%\">\n");
      out.write("                <h4>Manage Users</h4>\n");
      out.write("\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Email</th>\n");
      out.write("                            <th>User Name</th>\n");
      out.write("                            <th>User Type</th>\n");
      out.write("                            <th>Note</th>\n");
      out.write("                            <th>Status</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("\n");
      out.write("                        <tr class=\"info\">\n");
      out.write("                            <td>test@gmail.com</td>\n");
      out.write("                            <td>chamalki</td>\n");
      out.write("                            <td>\n");
      out.write("                                <div class=\"form-group\" style=\"position: absolute\">\n");
      out.write("                                    <div class=\"dropdown\">\n");
      out.write("                                        <div id=\"exp_month\">\n");
      out.write("                                            <select class=\"form-control\" name=\"user_type\">\n");
      out.write("                                                <option>Admin</option>\n");
      out.write("                                                <option>Manager</option>\n");
      out.write("                                                <option>User</option>\n");
      out.write("                                                <option>Guest Account</option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("                            <td>-</td>\n");
      out.write("                            <td><div>\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-info\">Status</button>\n");
      out.write("                                </div></td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
