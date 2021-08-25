package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class informe_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/nav.jsp");
    _jspx_dependants.add("/nav1.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"CSS/css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\" crossorigin=\"anonymous\">\n");
      out.write("            </head>\n");
      out.write("    ");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark\">\n");
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
      out.write("                        <a class=\"nav-link active\" href=\"informe.jsp\">Informe</a>\n");
      out.write("                    </li>\n");
      out.write("                   \n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link active dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                            Mantenimientos\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">Mantenimientos Disponibles</a></li>\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"mantenimiento.jsp\">Mantenimientos Realizados</a></li>\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"agregar_mantenimiento.jsp\">Agregar Mantenimiento</a></li>\n");
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
      out.write("                        <a class=\"nav-link active\" href=\"quienes_somos.jsp\" tabindex=\"-1\" aria-disabled=\"true\">¿Quienes Somos?</a>\n");
      out.write("                    </li>\n");
      out.write("                   \n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>");
      out.write("\n");
      out.write("    ");
      out.write("  \n");
      out.write("\n");
      out.write("<ul class=\"nav justify-content-center\">\n");
      out.write("           <li class=\"nav-item\">\n");
      out.write("               <a class=\"nav-link active\" aria-current=\"page\" href=\"informe.jsp\">General</a>\n");
      out.write("  </li>\n");
      out.write("  <li class=\"nav-item\">\n");
      out.write("    <a class=\"nav-link active\" aria-current=\"page\" href=\"recarga.jsp\">Recarga</a>\n");
      out.write("  </li>\n");
      out.write("  <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link active\" href=\"gasto.jsp\">Gasto</a>\n");
      out.write("  </li>\n");
      out.write("  \n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"uno\">\n");
      out.write("       <h1 class=\"titulo\">Recarga</h1>\n");
      out.write("       <table class=\"table table-striped table-bordered\">\n");
      out.write("           <thead style=\"background-color: #B8F2E6; border-color: #222\">\n");
      out.write("\n");
      out.write("               <tr style=\"text-align: center\">\n");
      out.write("                <th >Fecha</th> \n");
      out.write("                <th >Hora</th>\n");
      out.write("                <th >Odometro</th>\n");
      out.write("                <th >Cobustible</th>\n");
      out.write("                <th >Gasolina</th> \n");
      out.write("\n");
      out.write("               </tr>\n");
      out.write("\n");
      out.write("        </thead>\n");
      out.write("        <tbody style=\"border-color: #222\">\n");
      out.write("            <tr>\n");
      out.write("                <th>hola</th>\n");
      out.write("                <th>como estas</th>\n");
      out.write("                <th></th>\n");
      out.write("                <th></th>\n");
      out.write("                <th></th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>hola</th>\n");
      out.write("                <th>como estas</th>\n");
      out.write("                <th></th>\n");
      out.write("                <th></th>\n");
      out.write("                <th></th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>hola</th>\n");
      out.write("                <th>como estas</th>\n");
      out.write("                <th></th>\n");
      out.write("                <th></th>\n");
      out.write("                <th></th>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("       <button type=\"button\" class=\"btn6 btn-ligth\"><a href=\"recarga.jsp\">Agregar Recarga</a></button>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("         <h1 class=\"titulo\">Gasto</h1>\n");
      out.write("       <table class=\"table table-striped table-bordered\">\n");
      out.write("           <thead style=\"background-color: #B8F2E6; border-color: #222\">\n");
      out.write("\n");
      out.write("               <tr style=\"text-align: center\">\n");
      out.write("                <th >Fecha</th> \n");
      out.write("                <th >Hora</th>\n");
      out.write("                <th >Odometro</th>\n");
      out.write("                <th >Tipo De Gasto</th>\n");
      out.write("                <th >Motivo Del Gasto</th> \n");
      out.write("                <th > Nota</th>\n");
      out.write("\n");
      out.write("               </tr>\n");
      out.write("\n");
      out.write("        </thead>\n");
      out.write("        <tbody style=\"border-color: #222\">\n");
      out.write("            <tr>\n");
      out.write("                <th>hola</th>\n");
      out.write("                <th>como estas</th>\n");
      out.write("                <th></th>\n");
      out.write("                <th></th>\n");
      out.write("                <th></th>\n");
      out.write("                <th></th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>hola</th>\n");
      out.write("                <th>como estas</th>\n");
      out.write("                <th></th>\n");
      out.write("                <th></th>\n");
      out.write("                <th></th>\n");
      out.write("                <th></th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>hola</th>\n");
      out.write("                <th>como estas</th>\n");
      out.write("                <th></th>\n");
      out.write("                <th></th>\n");
      out.write("                <th></th>\n");
      out.write("                <th></th>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("         <button type=\"button\" class=\"btn6 btn-ligth\"><a href=\"gasto.jsp\">Agregar Gasto</a></button>\n");
      out.write("        </div>\n");
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
