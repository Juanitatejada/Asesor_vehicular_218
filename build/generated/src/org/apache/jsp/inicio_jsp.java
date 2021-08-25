package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <link href=\"CSS/css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <nav class=\"navbar navbar-expand-lg navbar-dark\">\n");
      out.write("\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\"></a>\n");
      out.write("            <img src=\"images/logo_1.png\" alt=\"\" width=\"100\" height=\"70\" class=\"d-inline-block align-text-top\">\n");
      out.write("\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link active\" aria-current=\"page\" href=\"index.jsp\">INICIO</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link active\" href=\"#\">INFORME</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link active\" href=\"#\">LEYES</a>\n");
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
      out.write("               \n");
      out.write(" <div class=\"uno\">\n");
      out.write("            <h1 class=\"titulo\"><b>DISPOSICIONES GENERALES</b></h1>\n");
      out.write("            <h3><b>CAPITULO 1: Principios</b></h3>\n");
      out.write("            <div class=\"texto\">\n");
      out.write("                <p><h5 class=\"julio\"><b>ARTÍCULO 1°. ÁMBITO DE APLICACIÓN Y PRINCIPIOS.</b> </h5>Las normas del\n");
      out.write("                presente Código rigen en todo el territorio nacional y regulan la circulación de los\n");
      out.write("                peatones, usuarios, pasajeros, conductores, motociclistas, ciclistas, agentes de\n");
      out.write("                tránsito, y vehículos por las vías públicas o privadas que están abiertas al público,\n");
      out.write("                o en las vías privadas, que internamente circulen vehículos; así como la actuación\n");
      out.write("                y procedimientos de las autoridades de tránsito.</p>\n");
      out.write("\n");
      out.write("                <p>En desarrollo de lo dispuesto por el artículo 24 de la Constitución Política, todo\n");
      out.write("                    colombiano tiene derecho a circular libremente por el territorio nacional, pero está\n");
      out.write("                    sujeto a la intervención y reglamentación de las autoridades para garantía de la\n");
      out.write("                    seguridad y comodidad de los habitantes, especialmente de los peatones y de los\n");
      out.write("                    discapacitados físicos y mentales, para la preservación de un ambiente sano y la\n");
      out.write("                    protección del uso común del espacio público.</p>\n");
      out.write("                <p>Le corresponde al Ministerio de Transporte como autoridad suprema de tránsito\n");
      out.write("                    definir, orientar, vigilar e inspeccionar la ejecución de la política nacional en\n");
      out.write("                    materia de tránsito.Las autoridades de tránsito promoverán la difusión y el conocimiento\n");
      out.write("                    de las disposiciones contenidas en este código.Los principios rectores de este código son:\n");
      out.write("                    seguridad de los usuarios, calidad,oportunidad, cubrimiento, libertad de acceso, plena\n");
      out.write("                    identificación, libre circulación,  educación y descentralización. </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row row-cols-1 row-cols-md-3 g-4\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <iframe width=\"390\" height=\"200\" src=\"https://www.youtube.com/embed/Qe_3XHvSTAw\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                           <p class=\"card-text\">¡CÓMO EVITAR QUE INMOVILICEN MI MOTO! /AL DÍA CON LA LEY/ CÓDIGO NACIONAL DE TRÁNSITO|</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <iframe width=\"390\" height=\"200\" src=\"https://www.youtube.com/embed/ank5O5EQodQ\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            \n");
      out.write("                            <p class=\"card-text\">Normatividad Vial* en Colombia. CÓDIGO NACIONAL DE TRÁNSITO</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <div>\n");
      out.write("\n");
      out.write("                        <h5 className=\"texto\" style=\"font-family: optima\"><b>ARTÍCULO 2°. DEFINICIONES.</b></h5 ><p> Para la aplicación e interpretación de este\n");
      out.write("                            código, se tendrán en cuenta las siguientes definiciones: </p>\n");
      out.write("\n");
      out.write("                        <div className=\"col\">\n");
      out.write("                            <dl>\n");
      out.write("                                <dt style=\"font-family: optima\">Acera o andén </dt>\n");
      out.write("                                <dd style=\"font-family: optima\"> Franja longitudinal de la vía urbana, destinada exclusivamente a la\n");
      out.write("                                    circulación de peatones, ubicada a los costados de ésta.</dd>\n");
      out.write("                                <hr />\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <dt style=\"font-family: optima\">Accesibilidad </dt>\n");
      out.write("                                <dd style=\"font-family: optima\"> Condición esencial de los servicios públicos que permite en\n");
      out.write("                                    cualquier espacio o ambiente exte</dd>\n");
      out.write("\n");
      out.write("                                <hr />\n");
      out.write("                            </dl>\n");
      out.write("                        </div>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
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
