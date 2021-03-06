package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ley3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                        <a class=\"nav-link active\" aria-current=\"page\" href=\"inicio1.jsp\">Inicio</a>\n");
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
      out.write("                            <li><a class=\"dropdown-item\" href=\"ley3.jsp\">Ley 3</a></li>\n");
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
      out.write("        \n");
      out.write("        <div class=\"uno\">\n");
      out.write("            <h1 class=\"titulo\"><b>NORMAS DE COMPORTAMIENTO</b></h1>\n");
      out.write("                <h3><b>CAPITULO 1. REGLAS GENERALES Y EDUCACI??N EN EL TR??NSITO.</b></h3>\n");
      out.write("                <h5><b>ART??CULO 55. COMPORTAMIENTO DEL CONDUCTOR, PASAJERO O PEAT??N.</b></h5>\n");
      out.write("                <p>Toda persona que tome parte en el tr??nsito como conductor, pasajero o\n");
      out.write("                peat??n, debe comportarse en forma que no obstaculice, perjudique o ponga en\n");
      out.write("                riesgo a las dem??s y debe conocer y cumplir las normas y se??ales de tr??nsito que\n");
      out.write("                le sean aplicables, as?? como obedecer las indicaciones que les den las\n");
      out.write("                autoridades de tr??nsito</p>\n");
      out.write("\n");
      out.write("                <h3><b>ART??CULO 56. OBLIGATORIEDAD DE ENSE??ANZA.</b></h3>\n");
      out.write("                <p>Se establecer?? como obligaci??n en la educaci??n Preescolar, B??sica Primaria, B??sica Secundaria y\n");
      out.write("                Med??a Vocacional, impartir los cursos de tr??nsito y seguridad vial previamente\n");
      out.write("                dise??ados por el Gobierno Nacional. </p>\n");
      out.write("                <dl>\n");
      out.write("                    <dt><h7><b>PARAGRAFO</b></h7></dt>\n");
      out.write("                    <dd>Los Ministerios de Transporte y Educaci??n Nacional, tendr??n un\n");
      out.write("                    plazo de doce (12) meses contados a partir de la fecha de sanci??n de la presente\n");
      out.write("                    ley para expedir la reglamentaci??n atinente al cumplimiento de lo dispuesto en\n");
      out.write("                    este art??culo y para presentar las cartillas y documentos b??sicos de estudio de\n");
      out.write("                    tr??nsito y seguridad vial y para la adopci??n de modernas herramientas\n");
      out.write("                    tecnol??gicas did??cticas din??micas para dramatizar el contenido de las cartillas y\n");
      out.write("                    los documentos b??sicos de estudio para la educaci??n en tr??nsito y seguridad vial\n");
      out.write("                    en cada uno de los niveles de educaci??n aqu?? descritos.</dd>\n");
      out.write("                </dl>\n");
      out.write("\n");
      out.write("                <h3><b>CAPITULO 2. PEATONES. </b></h3>\n");
      out.write("                <h5><b>ART??CULO 57. CIRCULACI??N PEATONAL.</b></h5>\n");
      out.write("                <p>El tr??nsito de peatones por las v??as p??blicas se har??\n");
      out.write("                por fuera de las zonas destinadas al tr??nsito de veh??culos.\n");
      out.write("                Cuando un peat??n requiera cruzar una v??a vehicular, lo har?? respetando las </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <h4><b>ART??CULO 58. PROHIBICIONES A LOS PEATONES.</b></h4>\n");
      out.write("                <p>Los peatones no podr??n:</p>\n");
      out.write("                <div class=\"row row-cols-1 row-cols-md-2 g-4\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li>Invadir la zona destinada al tr??nsito de veh??culos, ni transitar en ??sta en patines,\n");
      out.write("                                monopatines, patinetas o similares.</li>\n");
      out.write("                            <li>Llevar, sin las debidas precauciones, elementos que puedan obstaculizar o afectar\n");
      out.write("                            el tr??nsito. </li>\n");
      out.write("                            <li>Remolcarse de veh??culos en movimiento.</li>\n");
      out.write("                            <li>Cruzar la v??a atravesando el tr??fico vehicular en lugares en donde existen pasos\n");
      out.write("                                peatonales. </li>\n");
      out.write("                            <li>Subirse o bajarse de los veh??culos, estando ??stos en movimiento, cualquiera que\n");
      out.write("                                sea la operaci??n o maniobra que est??n realizando. </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li>Cruzar por sitios no permitidos o transitar sobre el guardav??as del ferrocarril.</li>\n");
      out.write("                            <li>Colocarse delante o detr??s de un veh??culo que tenga el motor encendido. </li>\n");
      out.write("                            <li>Actuar de manera que ponga en peligro su integridad f??sica.</li>\n");
      out.write("                            <li>Ocupar la zona de seguridad y protecci??n de la v??a f??rrea, la cual se establece a\n");
      out.write("                                una distancia no menor de doce (12) metros a lado y lado del eje de la v??a f??rrea.</li>\n");
      out.write("                            <li>Transitar por los t??neles, puentes y viaductos de las v??as f??rreas. </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </div>\n");
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
