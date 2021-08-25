package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Inicio</title>\n");
      out.write("\n");
      out.write("        <link href=\"CSS/css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\" crossorigin=\"anonymous\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark\">\n");
      out.write("\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\"></a>\n");
      out.write("            <img src=\"images/logo_1.png\" alt=\"\" width=\"100\" height=\"70\" class=\"d-inline-block align-text-top\">\n");
      out.write("\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">INICIO</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link active\" href=\"#\">INFORME</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link active dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                            MANTENIMIENTO\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">MANTENIMIENTOS DISPONIBLES</a></li>\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">MANTENIMIENTOS REALIZADOS</a></li>\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">AGREGAR MANTENIMIENTO</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link active\" href=\"#\" tabindex=\"-1\" aria-disabled=\"true\">¿QUIENES SOMOS?</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link active\" href=\"#\" tabindex=\"-1\" aria-disabled=\"true\">CUENTA</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    \n");
      out.write("        <h1 class=\"titulo\"><b>LEYES DE TRANSITO</b></h1>\n");
      out.write("    <div class=\"card card1\">\n");
      out.write("  <div class=\"card-header\">\n");
      out.write("      <h3 style=\"font-family: optima\">¿Qué Son?</h3>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("    <blockquote class=\"blockquote mb-0\">\n");
      out.write("        <img class=\"izquierda\" src=\"images/WhatsApp Image 2021-08-19 at 4.11.20 PM.jpeg\" alt=\"...\"/>\n");
      out.write("        <p style=\"font-family: optima\" class=\"parrafo\" >Las normas de tránsito, de tráfico o de circulación son las normas que \n");
      out.write("          regulan el tráfico o circulación de vehículos. Además de determinar el \n");
      out.write("          significado de las señales de tráfico, los semáforos y otros tipos de \n");
      out.write("          señalización vial, marcan los principios generales y particulares por \n");
      out.write("          los que se establece la circulación.</p>\n");
      out.write("    </blockquote>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <h1 class=\"titulo\"><b>LEY 769 DE 2002 CODIGO NACIONAL DE TRANSITO</b></h1>\n");
      out.write("    <div class=\"container row row-cols-1 row-cols-md-3 g-4\">\n");
      out.write("        <div class=\"col\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <h2>01</h2>\n");
      out.write("                        <h3><b>Disposiciones Generales</b></h3>\n");
      out.write("                        <p style=\"font-size: 20px\">La normas del presente codigo rigen en todo el \n");
      out.write("                            territorio nacional y regulan la circulaicon de los ciudadanos y vehiculos</p>\n");
      out.write("                        <a href=\"inicio.jsp\">Leer Mas</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div></div>\n");
      out.write("        <div class=\"col\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <h2>02</h2>\n");
      out.write("                        <h3><b>Regimen Nacional De Transito</b></h3>\n");
      out.write("                        <p style=\"font-size: 20px\">Todo centro de enseñansa automovilistica, es \n");
      out.write("                        un establecimiento docente de naturaleza publica</p>\n");
      out.write("                        <a href=\"#\">Leer Mas</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div></div>\n");
      out.write("        <div class=\"col\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <h2>03</h2>\n");
      out.write("                        <h3><b>Normas De Comportamiento</b></h3>\n");
      out.write("                        <p style=\"font-size: 20px\">Todas persona que tome parte en el transito como conductor,\n");
      out.write("                        pasajero, o peaton, debe comportarse</p>\n");
      out.write("                        <a href=\"#\">Leer Mas</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
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
