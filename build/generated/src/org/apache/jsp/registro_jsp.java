package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"CSS/css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body style=\"background: url(images/carros.jpg)\">\n");
      out.write("        <div class=\"overlay\">\n");
      out.write("            <form class=\"registro\"style=\"background-color: black\" action=\"inicio1.jsp\" method=\"post\">\n");
      out.write("                <div class=\"con\">\n");
      out.write("                    <header class=\"head-form\">\n");
      out.write("                        <h2 class=\"sesion\"style=\"color: white\"  >REGISTRARME</h2>\n");
      out.write("                    </header>\n");
      out.write("                    <br>\n");
      out.write("                    <div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <label for=\"exampleName\" class=\"form-label\" style=\"color: azure\">Primer Nombre</label>\n");
      out.write("                                <input type=\"name\" class=\"form-control\" id=\"exampleName\" required> \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <label for=\"exampleName\" class=\"form-label\" style=\"color: azure\">Segundo Nombre</label>\n");
      out.write("                                <input type=\"name\" class=\"form-control\" id=\"exampleName\" required> \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <label for=\"exampleLastName\" class=\"form-labe\" style=\"color: azure\">Apellidos</label>\n");
      out.write("                        <input type=\"lastname\" class=\"form-control\" id=\"exampleLastName\" required> \n");
      out.write("                        <label for=\"exampleInputEmail1\" class=\"form-label\" style=\"color: azure\">Correo Electronico</label>\n");
      out.write("                        <input type=\"email\"  class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" required>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <label for=\"exampleLastName\" class=\"form-labe\" style=\"color: azure\">Contraseña</label>\n");
      out.write("                                <input type=\"lastname\" class=\"form-control\" id=\"exampleLastName\" required>                             </div>\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <label for=\"exampleLastName\" class=\"form-labe\" style=\"color: azure\">Confirme Contraseña</label>\n");
      out.write("                                <input type=\"lastname\" class=\"form-control\" id=\"exampleLastName\" required>                             </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <select class=\"form-select\" aria-label=\"Default select example\">\n");
      out.write("                        <option selected>Elija Su Tipo De Vehciulo</option>\n");
      out.write("                        <option value=\"1\">Carro</option>\n");
      out.write("                        <option value=\"2\">Moto</option>\n");
      out.write("                        </select>\n");
      out.write("                   <br>\n");
      out.write("                   <button class=\"log-in btn-outline-dark\">Registrarme</button>\n");
      out.write("                   \n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
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
