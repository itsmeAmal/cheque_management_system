package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addIssueCheque_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Issue Cheque</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"#\">\n");
      out.write("            <div style=\"position: absolute; left: 20%; top: 2%; width: 60%; height: 80%; background-color: #cccccc\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 25%; top: 7%; width: 20%; height: 15px\">\n");
      out.write("                <h4>ISSUE CHEQUES</h4>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 25%; top: 15%; width: 15%; height: 15px\">\n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                    <div id=\"exp_month\">\n");
      out.write("                        <select class=\"form-control\" name=\"bank\">\n");
      out.write("                            <option>Bank Of Ceylon</option>\n");
      out.write("                            <option>Nations Trust</option>\n");
      out.write("                            <option>People's Bank</option>\n");
      out.write("                            <option>Commercial Bank</option>\n");
      out.write("                            <option>Sampath Bank</option>\n");
      out.write("                            <option>National Savings Bank</option>\n");
      out.write("                            <option>Seylan Bank</option>\n");
      out.write("                            <option>Hatton National Bank</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 40%; top: 23%; width: 20%; height: 15px\">\n");
      out.write("\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"email\" placeholder=\"Email\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 40%; top: 31%; width: 20%; height: 15px\">\n");
      out.write("\n");
      out.write("                <input type=\"password\" class=\"form-control\" id=\"pwd\" placeholder=\"Password\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 40%; top: 37%; width: 20%; height: 15px\">\n");
      out.write("                <h6>Use 8 or more characters with a mix of letters, numbers & symbols</h6>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Default unchecked -->\n");
      out.write("            <div class=\"custom-control custom-checkbox\" style=\"position: absolute; left: 40%; top: 46%; width: 50px; height: 10px\">\n");
      out.write("                <input type=\"checkbox\" class=\"custom-control-input\" id=\"defaultUnchecked\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div style=\"position: absolute; left: 41%; top: 45%; width: 17%; height: 30px\">\n");
      out.write("                <label for=\"defaultUnchecked\"><h6>To create a User Account, you’ll need to agree to the Terms of Service.</h6></label>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 40%; top: 56%; width: 20%; height: 15px\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-info\">Create Account</button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
