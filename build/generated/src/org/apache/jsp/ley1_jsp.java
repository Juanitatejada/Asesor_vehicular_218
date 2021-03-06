package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ley1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"CSS/css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark\">\n");
      out.write("\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\"></a>\n");
      out.write("            <img src=\"images/logo_1.png\" alt=\"\" width=\"100\" height=\"70\" class=\"d-inline-block align-text-top\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link active\" aria-current=\"page\" href=\"index.jsp\">Inicio</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link active\" href=\"#\">Informe</a>\n");
      out.write("                    </li>\n");
      out.write("                   \n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link active dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                            Mantenimientos\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">Mantenimientos Disponibles</a></li>\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">Mantenimientos Realizados</a></li>\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">Agregar Mantenimiento</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                     <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link active dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                            Leyes\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"ley1.jsp\">Ley 1</a></li>\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"ley2.jsp\">Ley 2</a></li>\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">Ley 3</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link active\" href=\"#\" tabindex=\"-1\" aria-disabled=\"true\">??Quienes Somos?</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link active\" href=\"#\" tabindex=\"-1\" aria-disabled=\"true\">Cuenta</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("        <div class=\"uno\">\n");
      out.write("            <h1 class=\"titulo\"><b>DISPOSICIONES GENERALES</b></h1>\n");
      out.write("            <h3><b>CAPITULO 1: Principios</b></h3>\n");
      out.write("            <div class=\"texto\">\n");
      out.write("                <p><h5 class=\"texto\"><b>ART??CULO 1??. ??MBITO DE APLICACI??N Y PRINCIPIOS.</b> </h5>Las normas del\n");
      out.write("                presente C??digo rigen en todo el territorio nacional y regulan la circulaci??n de los\n");
      out.write("                peatones, usuarios, pasajeros, conductores, motociclistas, ciclistas, agentes de\n");
      out.write("                tr??nsito, y veh??culos por las v??as p??blicas o privadas que est??n abiertas al p??blico,\n");
      out.write("                o en las v??as privadas, que internamente circulen veh??culos; as?? como la actuaci??n\n");
      out.write("                y procedimientos de las autoridades de tr??nsito.</p>\n");
      out.write("\n");
      out.write("                <p>En desarrollo de lo dispuesto por el art??culo 24 de la Constituci??n Pol??tica, todo\n");
      out.write("                    colombiano tiene derecho a circular libremente por el territorio nacional, pero est??\n");
      out.write("                    sujeto a la intervenci??n y reglamentaci??n de las autoridades para garant??a de la\n");
      out.write("                    seguridad y comodidad de los habitantes, especialmente de los peatones y de los\n");
      out.write("                    discapacitados f??sicos y mentales, para la preservaci??n de un ambiente sano y la\n");
      out.write("                    protecci??n del uso com??n del espacio p??blico.</p>\n");
      out.write("                <p>Le corresponde al Ministerio de Transporte como autoridad suprema de tr??nsito\n");
      out.write("                    definir, orientar, vigilar e inspeccionar la ejecuci??n de la pol??tica nacional en\n");
      out.write("                    materia de tr??nsito.Las autoridades de tr??nsito promover??n la difusi??n y el conocimiento\n");
      out.write("                    de las disposiciones contenidas en este c??digo.Los principios rectores de este c??digo son:\n");
      out.write("                    seguridad de los usuarios, calidad,oportunidad, cubrimiento, libertad de acceso, plena\n");
      out.write("                    identificaci??n, libre circulaci??n,  educaci??n y descentralizaci??n. </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row row-cols-1 row-cols-md-3 g-4\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <iframe width=\"390\" height=\"200\" src=\"https://www.youtube.com/embed/Qe_3XHvSTAw\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                           <p class=\"card-text\">??C??MO EVITAR QUE INMOVILICEN MI MOTO! /AL D??A CON LA LEY/ C??DIGO NACIONAL DE TR??NSITO|</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <iframe width=\"390\" height=\"200\" src=\"https://www.youtube.com/embed/ank5O5EQodQ\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            \n");
      out.write("                            <p class=\"card-text\">Normatividad Vial* en Colombia. C??DIGO NACIONAL DE TR??NSITO</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <div>\n");
      out.write("\n");
      out.write("                        <h5 className=\"texto\"><b>ART??CULO 2??. DEFINICIONES.</b></h5 ><p> Para la aplicaci??n e interpretaci??n de este\n");
      out.write("                            c??digo, se tendr??n en cuenta las siguientes definiciones: </p>\n");
      out.write("\n");
      out.write("                        <div className=\"col texto\">\n");
      out.write("                            <dl>\n");
      out.write("                                <dt>Acera o and??n </dt>\n");
      out.write("                                <dd> Franja longitudinal de la v??a urbana, destinada exclusivamente a la\n");
      out.write("                                    circulaci??n de peatones, ubicada a los costados de ??sta.</dd>\n");
      out.write("                                <hr />\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <dt>Accesibilidad </dt>\n");
      out.write("                                <dd> Condici??n esencial de los servicios p??blicos que permite en\n");
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
