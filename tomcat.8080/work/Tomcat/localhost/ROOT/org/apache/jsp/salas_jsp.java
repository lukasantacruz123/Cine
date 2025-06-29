/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2025-06-11 13:02:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class salas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("<head>\r\n");
      out.write("<link rel = \"stylesheet\" href = \"css/cartelera.css\">\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Cartelera - Salas de Cine</title>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<header class=\"encabezado\">\r\n");
      out.write("    <div class=\"container d-flex justify-content-between align-items-center py-3\">\r\n");
      out.write("        <div class=\"d-flex align-items-center gap-3\">\r\n");
      out.write("            <img src=\"https://cdn-icons-png.flaticon.com/512/744/744922.png\" alt=\"Logo cine\" style=\"width: 40px;\">\r\n");
      out.write("            <h1 class=\"titulo-pagina m-0\">Cine</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"d-flex align-items-center gap-3\">\r\n");
      out.write("            <a href=\"index.jsp\">\r\n");
      out.write("                <img src=\"https://static.vecteezy.com/system/resources/previews/002/387/693/original/user-profile-icon-free-vector.jpg\" \r\n");
      out.write("                     alt=\"Usuario\" \r\n");
      out.write("                     style=\"width: 40px; height: 40px; border-radius: 50%;\">\r\n");
      out.write("            </a>\r\n");
      out.write("              <script src=\"");
      out.print(request.getContextPath());
      out.write("/scripts/logout.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <button type=\"button\" class=\"btn btn-primary\" id=\"btn-logout\">Cerrar Sesión</button>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- NAVBAR -->\r\n");
      out.write("    <nav>\r\n");
      out.write("        <h2>Salas</h2>\r\n");
      out.write("        <div class=\"nav-right\">\r\n");
      out.write("            <a href=\"index.jsp\">\r\n");
      out.write("                <img src=\"https://static.vecteezy.com/system/resources/previews/002/387/693/original/user-profile-icon-free-vector.jpg\" \r\n");
      out.write("                     alt=\"Usuario\" \r\n");
      out.write("                     style=\"width: 50px; height: 50px; border-radius: 50%;\">\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <!-- CARTELERA -->\r\n");
      out.write("    <div class=\"cartelera\">\r\n");
      out.write("\r\n");
      out.write("        <!-- CARRUSEL DE PELÍCULAS -->\r\n");
      out.write("<!-- CARRUSEL DE PELÍCULAS -->\r\n");
      out.write("<div id=\"carouselExampleRide\" class=\"carousel slide\" data-bs-ride=\"true\" style=\"max-width: 1050px; margin: auto; margin-top: 0px;\">\r\n");
      out.write("          <div class=\"carousel-inner\">\r\n");
      out.write("            <div class=\"carousel-item active\">\r\n");
      out.write("              <img src=\"images/5.jpg\" class=\"d-block w-100\" alt=\"Minecraft\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"carousel-item\">\r\n");
      out.write("              <img src=\"images/6.jpg\" class=\"d-block w-100\" alt=\"Blanca Nieves\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"carousel-item\">\r\n");
      out.write("              <img src=\"images/7.jpg\" class=\"d-block w-100\" alt=\"Rescate Implacable\">\r\n");
      out.write("            </div>\r\n");
      out.write("                        <div class=\"carousel-item\">\r\n");
      out.write("              <img src=\"images/8.jpg\" class=\"d-block w-100\" alt=\"Rescate Implacable\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleRide\" data-bs-slide=\"prev\">\r\n");
      out.write("            <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("            <span class=\"visually-hidden\">Anterior</span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleRide\" data-bs-slide=\"next\">\r\n");
      out.write("            <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("            <span class=\"visually-hidden\">Siguiente</span>\r\n");
      out.write("          </button>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Miniaturas clickeables -->\r\n");
      out.write("         <div class=\"peliculas \">\r\n");
      out.write("         <h1>Peliculas en cartelera</h1>\r\n");
      out.write("      \t</div>\r\n");
      out.write("        <div class=\"peliculas \">\r\n");
      out.write("              \r\n");
      out.write("           \r\n");
      out.write("            <div class=\"pelicula\">\r\n");
      out.write("                <a href=\"sala1.jsp\">\r\n");
      out.write("                    <img src=\"https://static.cinemarkhoyts.com.ar/Images/Posters/362b0b9682619abc4e9c1061663aedb1.jpg?v=00002541\" alt=\"Minecraft\">\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"titulo\">MINECRAFT</div>\r\n");
      out.write("                <div class=\"estreno\">ESTRENO</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"pelicula\">\r\n");
      out.write("                <a href=\"sala2.jsp\">\r\n");
      out.write("                    <img src=\"https://static.cinemarkhoyts.com.ar/Images/Posters/e22b65a127e28c40f3430181ee0c20be.jpg?v=00002552\" alt=\"Blanca Nieves\">\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"titulo\">BLANCA NIEVES</div>\r\n");
      out.write("                <div class=\"estreno\">ESTRENO</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"pelicula\">\r\n");
      out.write("                <a href=\"sala3.jsp\">\r\n");
      out.write("                    <img src=\"https://static.cinemarkhoyts.com.ar/Images/Posters/533706b4add9a0023dfd656f7b23fb94.jpg?v=00002552\" alt=\"Rescate Implacable\">\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"titulo\">RESCATE IMPLACABLE</div>\r\n");
      out.write("                <div class=\"estreno\">ESTRENO</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                   <div class=\"pelicula\">\r\n");
      out.write("                <a href=\"sala4.jsp\">\r\n");
      out.write("                    <img src=\"https://sacnkprodarcms.blob.core.windows.net/content/posters/HO00010245.jpg\" alt=\"Lilo y Stich\">\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"titulo\">LILO Y STICH</div>\r\n");
      out.write("                <div class=\"estreno\">ESTRENO</div>\r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- LINKS A LAS SALAS -->\r\n");
      out.write("    <div class=\"contenido\">\r\n");
      out.write("        ");

            Object salasObj = request.getAttribute("salas");
            if (salasObj != null && salasObj instanceof java.util.List && !((java.util.List) salasObj).isEmpty()) {
        
      out.write("\r\n");
      out.write("            <a href=\"sala1.jsp\" class=\"sala-link\">Minecraft</a>\r\n");
      out.write("            <a href=\"sala2.jsp\" class=\"sala-link\">Blancanieves</a>\r\n");
      out.write("            <a href=\"sala3.jsp\" class=\"sala-link\">Rescate Implacable</a>\r\n");
      out.write("              <a href=\"sala4.jsp\" class=\"sala-link\">Lilo y Stich</a>\r\n");
      out.write("        ");

            }
        
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- JS de Bootstrap -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
