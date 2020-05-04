package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.cms.controller.clientController;
import java.sql.ResultSet;

public final class addIssueCheque_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navigationBar.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Issue Cheque</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Bootstrap Example</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse\" style=\"position: fixed; width: 100%; background-color: #000000\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\"> C M S </a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"active\"><a href=\"#\">DASHBOARD</a></li>\n");
      out.write("                    <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Add / Register<span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"#\">Register Users</a></li>\n");
      out.write("                            <li><a href=\"#\">Add Cheque Details</a></li>\n");
      out.write("                            <li><a href=\"#\">Register Clients</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Manage<span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"#\">Manage User Accounts</a></li>\n");
      out.write("                            <li><a href=\"#\">Manage Cheques</a></li>\n");
      out.write("                            <li><a href=\"#\">Manage Client Details</a></li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("                    <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"#\">\n");
      out.write("            <div style=\"position: absolute; left: 20%; top: 12%; width: 60%; height: 80%; background-color: #cccccc\">\n");
      out.write("            </div>\n");
      out.write("            <div style=\"position: absolute; left: 22%; top: 17%; width: 56%; height: 45%; background-color: #99ff99\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 25%; top: 20%; width: 20%; height: 15px\">\n");
      out.write("                <h4>ISSUE CHEQUES</h4>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div style=\"position: absolute; left: 25%; top: 25%; width: 20%; height: 15px\">\n");
      out.write("                <h4>Bank</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 25%; top: 30%; width: 15%; height: 15px\">\n");
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
      out.write("            <div style=\"position: absolute; left: 780px; top: 25%; width: 30%; height: 15px\">\n");
      out.write("                <h4>Cheque Date</h4>\n");
      out.write("            </div>\n");
      out.write("            <!------1-->\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 780px; top: 30%; width: 40px; height: 15px\">\n");
      out.write("                <input type=\"text\" name=\"date1\" class=\"form-control\" id=\"d1\" placeholder=\"D\" required>\n");
      out.write("            </div>\n");
      out.write("            <!------2-->\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 830px; top: 30%; width: 40px; height: 15px\">\n");
      out.write("                <input type=\"text\" name=\"date2\" class=\"form-control\" id=\"d2\" placeholder=\"D\" required>\n");
      out.write("            </div>\n");
      out.write("            <!------3-->\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 880px; top: 30%; width: 40px; height: 15px\">\n");
      out.write("                <input type=\"text\" name=\"date3\" class=\"form-control\" id=\"m1\" placeholder=\"M\" required>\n");
      out.write("            </div>\n");
      out.write("            <!------4-->\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 930px; top: 30%; width: 40px; height: 15px\">\n");
      out.write("                <input type=\"text\" name=\"date4\" class=\"form-control\" id=\"m2\" placeholder=\"M\" required>\n");
      out.write("            </div>\n");
      out.write("            <!------5-->\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 980px; top: 30%; width: 40px; height: 15px\">\n");
      out.write("                <input type=\"text\" name=\"date5\" class=\"form-control\" id=\"y1\" placeholder=\"Y\" required>\n");
      out.write("            </div>\n");
      out.write("            <!------6-->\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 1030px; top: 30%; width: 40px; height: 15px\">\n");
      out.write("                <input type=\"text\" name=\"date6\" class=\"form-control\" id=\"y2\" placeholder=\"Y\" required>\n");
      out.write("            </div>\n");
      out.write("            <!------7-->\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 1080px; top: 30%; width: 40px; height: 15px\">\n");
      out.write("                <input type=\"text\" name=\"date7\" class=\"form-control\" id=\"y3\" placeholder=\"Y\" required>\n");
      out.write("            </div>\n");
      out.write("            <!------8-->\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 1130px; top: 30%; width: 40px; height: 15px\">\n");
      out.write("                <input type=\"text\" name=\"date8\" class=\"form-control\" id=\"y4\" placeholder=\"Y\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 25%; top: 38%; width: 5%; height: 15px\">\n");
      out.write("                <h4>PAY</h4>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 28%; top: 38%; width: 30%; height: 15px\">\n");
      out.write("                ");

                    ResultSet rset = clientController.getAllClients();
                
      out.write("\n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                    <div id=\"exp_month\">\n");
      out.write("                        <select class=\"form-control\" name=\"client_name\">\n");
      out.write("                            ");

                                while (rset.next()) {
                            
      out.write("\n");
      out.write("                            <option>");
      out.print(rset.getString("client_detail_name"));
      out.write("</option> \n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 59%; top: 38%; width: 10%; height: 15px\">\n");
      out.write("                <h4>Or Bearer</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 25%; top: 46%; width: 10%; height: 15px\">\n");
      out.write("                <h4>Rupees...............................................................................</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 57%; top: 46%; width: 10%; height: 15px\">\n");
      out.write("                <h4>Rs:</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 60%; top: 46%; width: 16%; height: 15px\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"amount\" id=\"rs\" placeholder=\"Amount\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 1055px; top: 55%; width: 20%; height: 15px\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-info\" style=\"width: 120px\">Apply</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 1205px; top: 55%; width: 20%; height: 15px\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-info\" style=\"width: 120px\">Save</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 35%; top: 55%; width: 15%; height: 15px\">\n");
      out.write("                <input type=\"text\" name=\"cheque_no\" class=\"form-control\" id=\"chq_no\" placeholder=\"Cheque Number\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 25%; top: 55%; width: 10%; height: 15px\">\n");
      out.write("                <h4>Cheque Number</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\" style=\"position: absolute; left: 22%; top: 65%; width: 56%; height: 100%\">\n");
      out.write("                <h5>Cheque History</h5>\n");
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
      out.write("                        <tr class=\"info\">\n");
      out.write("                            <td>2020/10/10</td>\n");
      out.write("                            <td>226455</td>\n");
      out.write("                            <td>Nations Trust</td>\n");
      out.write("                            <td>50000.00</td>\n");
      out.write("                            <td><div>\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-danger\">Status</button>\n");
      out.write("                                </div></td>\n");
      out.write("                        </tr>\n");
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
