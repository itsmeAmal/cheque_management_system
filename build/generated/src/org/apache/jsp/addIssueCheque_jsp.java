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
      out.write("            <div style=\"position: absolute; left: 22%; top: 7%; width: 56%; height: 45%; background-color: #99ff99\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 25%; top: 10%; width: 20%; height: 15px\">\n");
      out.write("                <h4>ISSUE CHEQUES</h4>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div style=\"position: absolute; left: 25%; top: 15%; width: 20%; height: 15px\">\n");
      out.write("                <h4>Bank</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 25%; top: 20%; width: 15%; height: 15px\">\n");
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
      out.write("            <div style=\"position: absolute; left: 780px; top: 15%; width: 30%; height: 15px\">\n");
      out.write("                <h4>Cheque Date</h4>\n");
      out.write("            </div>\n");
      out.write("            <!------1-->\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 780px; top: 20%; width: 40px; height: 15px\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"d1\" placeholder=\"D\" required>\n");
      out.write("            </div>\n");
      out.write("            <!------2-->\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 830px; top: 20%; width: 40px; height: 15px\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"d2\" placeholder=\"D\" required>\n");
      out.write("            </div>\n");
      out.write("            <!------3-->\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 880px; top: 20%; width: 40px; height: 15px\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"m1\" placeholder=\"M\" required>\n");
      out.write("            </div>\n");
      out.write("            <!------4-->\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 930px; top: 20%; width: 40px; height: 15px\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"m2\" placeholder=\"M\" required>\n");
      out.write("            </div>\n");
      out.write("            <!------5-->\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 980px; top: 20%; width: 40px; height: 15px\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"y1\" placeholder=\"Y\" required>\n");
      out.write("            </div>\n");
      out.write("            <!------6-->\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 1030px; top: 20%; width: 40px; height: 15px\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"y2\" placeholder=\"Y\" required>\n");
      out.write("            </div>\n");
      out.write("            <!------7-->\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 1080px; top: 20%; width: 40px; height: 15px\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"y3\" placeholder=\"Y\" required>\n");
      out.write("            </div>\n");
      out.write("            <!------8-->\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 1130px; top: 20%; width: 40px; height: 15px\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"y4\" placeholder=\"Y\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 25%; top: 28%; width: 5%; height: 15px\">\n");
      out.write("                <h4>PAY</h4>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 28%; top: 28%; width: 30%; height: 15px\">\n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                    <div id=\"exp_month\">\n");
      out.write("                        <select class=\"form-control\" name=\"bank\">\n");
      out.write("                            <option>Cargills Food City</option>\n");
      out.write("                            <option>Leaver Brothers</option>\n");
      out.write("                            <option>Punchi Banda</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 59%; top: 28%; width: 10%; height: 15px\">\n");
      out.write("                <h4>Or Bearer</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 25%; top: 36%; width: 10%; height: 15px\">\n");
      out.write("                <h4>Rupees...............................................................................</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 57%; top: 36%; width: 10%; height: 15px\">\n");
      out.write("                <h4>Rs:</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 60%; top: 36%; width: 16%; height: 15px\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"rs\" placeholder=\"Amount\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 1055px; top: 45%; width: 20%; height: 15px\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-info\">Issue Cheque</button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"container\" style=\"position: absolute; left: 22%; top: 55%; width: 56%; height: 100%\">\n");
      out.write("                <h5>Cheque History</h5>\n");
      out.write("\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Date</th>\n");
      out.write("                            <th>Cheque Number</th>\n");
      out.write("                            <th>Bank</th>\n");
      out.write("                            <th>Amount</th>\n");
      out.write("                            <th>Status</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("\n");
      out.write("                        <tr class=\"info\">\n");
      out.write("                            <td>2020/10/10</td>\n");
      out.write("                            <td>226455</td>\n");
      out.write("                            <td>Nations Trust</td>\n");
      out.write("                            <td>50000.00</td>\n");
      out.write("                            <td><div>\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-danger\">Status</button>\n");
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
