package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login</title>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js\"></script>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Kaushan+Script\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                padding-top:4.2rem;\n");
      out.write("                padding-bottom:4.2rem;\n");
      out.write("                background:rgba(0, 0, 0, 0.76);\n");
      out.write("            }\n");
      out.write("            a{\n");
      out.write("                text-decoration:none !important;\n");
      out.write("            }\n");
      out.write("            h1,h2,h3{\n");
      out.write("                font-family: 'Kaushan Script', cursive;\n");
      out.write("            }\n");
      out.write("            .myform{\n");
      out.write("                position: relative;\n");
      out.write("                display: -ms-flexbox;\n");
      out.write("                display: flex;\n");
      out.write("                padding: 1rem;\n");
      out.write("                -ms-flex-direction: column;\n");
      out.write("                flex-direction: column;\n");
      out.write("                width: 100%;\n");
      out.write("                pointer-events: auto;\n");
      out.write("                background-color: #fff;\n");
      out.write("                background-clip: padding-box;\n");
      out.write("                border: 1px solid rgba(0,0,0,.2);\n");
      out.write("                border-radius: 1.1rem;\n");
      out.write("                outline: 0;\n");
      out.write("                max-width: 500px;\n");
      out.write("            }\n");
      out.write("            .tx-tfm{\n");
      out.write("                text-transform:uppercase;\n");
      out.write("            }\n");
      out.write("            .mybtn{\n");
      out.write("                border-radius:50px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-or {\n");
      out.write("                position: relative;\n");
      out.write("                color: #aaa;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                padding-top: 10px;\n");
      out.write("                padding-bottom: 10px;\n");
      out.write("            }\n");
      out.write("            .span-or {\n");
      out.write("                display: block;\n");
      out.write("                position: absolute;\n");
      out.write("                left: 50%;\n");
      out.write("                top: -2px;\n");
      out.write("                margin-left: -25px;\n");
      out.write("                background-color: #fff;\n");
      out.write("                width: 50px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .hr-or {\n");
      out.write("                height: 1px;\n");
      out.write("                margin-top: 0px !important;\n");
      out.write("                margin-bottom: 0px !important;\n");
      out.write("            }\n");
      out.write("            .google {\n");
      out.write("                color:#666;\n");
      out.write("                width:100%;\n");
      out.write("                height:40px;\n");
      out.write("                text-align:center;\n");
      out.write("                outline:none;\n");
      out.write("                border: 1px solid lightgrey;\n");
      out.write("            }\n");
      out.write("            form .error {\n");
      out.write("                color: #ff0000;\n");
      out.write("            }\n");
      out.write("            #second{display:none;}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-5 mx-auto\">\n");
      out.write("                    <div id=\"first\">\n");
      out.write("                        <div class=\"myform form \">\n");
      out.write("                            <div class=\"logo mb-3\">\n");
      out.write("                                <div class=\"col-md-12 text-center\">\n");
      out.write("                                    <h1>Login - C M S</h1>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <form action=\"login\" method=\"post\" name=\"login\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"exampleInputEmail1\">Email address</label>\n");
      out.write("                                    <input type=\"email\" name=\"email\"  class=\"form-control\" id=\"email\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"exampleInputEmail1\">Password</label>\n");
      out.write("                                    <input type=\"password\" name=\"password\" id=\"password\"  class=\"form-control\" aria-describedby=\"emailHelp\" placeholder=\"Enter Password\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <p class=\"text-center\">By signing up you accept our <a href=\"#\">Terms Of Use</a></p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12 text-center \">\n");
      out.write("                                    <button type=\"submit\" class=\" btn btn-block mybtn btn-primary tx-tfm\">Login</button>\n");
      out.write("                                </div>\n");
      out.write("                                <!--                                <div class=\"col-md-12 \">\n");
      out.write("                                                                    <div class=\"login-or\">\n");
      out.write("                                                                        <hr class=\"hr-or\">\n");
      out.write("                                                                        <span class=\"span-or\">or</span>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>-->\n");
      out.write("                                <!--                                <div class=\"col-md-12 mb-3\">\n");
      out.write("                                                                    <p class=\"text-center\">\n");
      out.write("                                                                        <a href=\"javascript:void();\" class=\"google btn mybtn\"><i class=\"fa fa-google-plus\">\n");
      out.write("                                                                            </i> Signup using Google\n");
      out.write("                                                                        </a>\n");
      out.write("                                                                    </p>\n");
      out.write("                                                                </div>-->\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--                    <div id=\"second\">\n");
      out.write("                                            <div class=\"myform form \">\n");
      out.write("                                                <div class=\"logo mb-3\">\n");
      out.write("                                                    <div class=\"col-md-12 text-center\">\n");
      out.write("                                                        <h1 >Signup</h1>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <form action=\"#\" name=\"registration\">\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label for=\"exampleInputEmail1\">First Name</label>\n");
      out.write("                                                        <input type=\"text\"  name=\"firstname\" class=\"form-control\" id=\"firstname\" aria-describedby=\"emailHelp\" placeholder=\"Enter Firstname\">\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label for=\"exampleInputEmail1\">Last Name</label>\n");
      out.write("                                                        <input type=\"text\"  name=\"lastname\" class=\"form-control\" id=\"lastname\" aria-describedby=\"emailHelp\" placeholder=\"Enter Lastname\">\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label for=\"exampleInputEmail1\">Email address</label>\n");
      out.write("                                                        <input type=\"email\" name=\"email\"  class=\"form-control\" id=\"email\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\">\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label for=\"exampleInputEmail1\">Password</label>\n");
      out.write("                                                        <input type=\"password\" name=\"password\" id=\"password\"  class=\"form-control\" aria-describedby=\"emailHelp\" placeholder=\"Enter Password\">\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-12 text-center mb-3\">\n");
      out.write("                                                        <button type=\"submit\" class=\" btn btn-block mybtn btn-primary tx-tfm\">Get Started For Free</button>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-12 \">\n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                            <p class=\"text-center\"><a href=\"#\" id=\"signin\">Already have an account?</a></p>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>   \n");
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
