/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2025-06-17 04:05:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.salas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sala4_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

session.setAttribute("pelicula", "lilo");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("<head>\r\n");
      out.write("<link rel = \"stylesheet\" href = \"../css/salas.css\">\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Cartelera - Minecraft</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<!-- Izquierda -->\r\n");
      out.write("\t\t<div class=\"left\">\r\n");
      out.write("\t\t\t<iframe src=\"https://www.youtube.com/embed/9JIyINjMfcc\"\r\n");
      out.write("\t\t\t\tframeborder=\"0\" allowfullscreen></iframe>\r\n");
      out.write("\t\t\t<div class=\"movie-box\">\r\n");
      out.write("\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\tsrc=\"https://sacnkprodarcms.blob.core.windows.net/content/posters/HO00010245.jpg\"\r\n");
      out.write("\t\t\t\t\talt=\"Poster\" class=\"poster\">\r\n");
      out.write("\t\t\t\t<div class=\"info\">\r\n");
      out.write("\t\t\t\t\t<h2>Sinopsis</h2>\r\n");
      out.write("\t\t\t\t\t<p>¡Lilo es una niña hawaiana solitaria que adopta a un perro que en realidad es un extraterrestre travieso que se esconde de unos cazadores intergalácticos...</p>\r\n");
      out.write("\t\t\t\t\t<h2>Datos Técnicos</h2>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<strong>Título:</strong> Lilo & Stitch: La Nueva Aventura<br>\r\n");
      out.write("\t\t\t<strong>Duración:</strong> 101 min<br>\r\n");
      out.write("\t\t\t<strong>Calificación:</strong> ATP<br>\r\n");
      out.write("\t\t\t<strong>Género:</strong> Animación, Aventura, Familia<br>\r\n");
      out.write("\t\t\t<strong>Director:</strong> Chris Sanders<br>\r\n");
      out.write("\t\t\t<strong>Reparto:</strong> Daveigh Chase, Chris Sanders, Tia Carrere, Justin Theroux...\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- Derecha -->\r\n");
      out.write("\t\t<div class=\"right\">\r\n");
      out.write("\t\t\t<div class=\"tabs\">\r\n");
      out.write("\t\t\t\t<div class=\"tab active\">HOY</div>\r\n");
      out.write("\t\t\t\t<div class=\"tab\">JUE 29/MAY</div>\r\n");
      out.write("\t\t\t\t<div class=\"tab\">VIE 30/MAY</div>\r\n");
      out.write("\t\t\t\t<div class=\"tab\">SÁB 31/MAY</div>\r\n");
      out.write("\t\t\t\t<div class=\"tab\">DOM 1/JUN</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"legend\">\r\n");
      out.write("\t\t\t\t<div class=\"legend-item\">\r\n");
      out.write("\t\t\t\t\t<div class=\"dot green\"></div>\r\n");
      out.write("\t\t\t\t\tAlta\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"legend-item\">\r\n");
      out.write("\t\t\t\t\t<div class=\"dot yellow\"></div>\r\n");
      out.write("\t\t\t\t\tMedia\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"legend-item\">\r\n");
      out.write("\t\t\t\t\t<div class=\"dot red\"></div>\r\n");
      out.write("\t\t\t\t\tBaja\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"legend-item\">\r\n");
      out.write("\t\t\t\t\t<div class=\"dot gray\"></div>\r\n");
      out.write("\t\t\t\t\tCompleta\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"location-title\">HORARIOS EN CINE</div>\r\n");
      out.write("\t\t\t<div class=\"format-block\">\r\n");
      out.write("\t\t\t\t<div class=\"format-title\">XD + 3D - CASTELLANO</div>\r\n");
      out.write("\t\t\t\t<div class=\"horarios\">\r\n");
      out.write("\t\t\t\t\t<div class=\"horario\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dot green\"></div>\r\n");
      out.write("\t\t\t\t\t\t12:00 hs\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"horario\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dot green\"></div>\r\n");
      out.write("\t\t\t\t\t\t14:30 hs\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"horario\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dot yellow\"></div>\r\n");
      out.write("\t\t\t\t\t\t17:00 hs\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"horario\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dot red\"></div>\r\n");
      out.write("\t\t\t\t\t\t19:35 hs\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"format-block\">\r\n");
      out.write("\t\t\t\t<div class=\"format-title\">2D - CASTELLANO</div>\r\n");
      out.write("\t\t\t\t<div class=\"horarios\">\r\n");
      out.write("\t\t\t\t\t<div class=\"horario\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dot green\"></div>\r\n");
      out.write("\t\t\t\t\t\t12:15 hs\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"horario\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dot green\"></div>\r\n");
      out.write("\t\t\t\t\t\t12:45 hs\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"horario\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dot green\"></div>\r\n");
      out.write("\t\t\t\t\t\t13:30 hs\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"horario\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dot yellow\"></div>\r\n");
      out.write("\t\t\t\t\t\t14:00 hs\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"horario\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dot yellow\"></div>\r\n");
      out.write("\t\t\t\t\t\t14:45 hs\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"format-block\">\r\n");
      out.write("\t\t\t\t<div class=\"format-title\">4D + 3D - CASTELLANO</div>\r\n");
      out.write("\t\t\t\t<div class=\"horarios\">\r\n");
      out.write("\t\t\t\t\t<div class=\"horario\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dot green\"></div>\r\n");
      out.write("\t\t\t\t\t\t12:30 hs\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"horario\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dot yellow\"></div>\r\n");
      out.write("\t\t\t\t\t\t15:00 hs\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"horario\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dot red\"></div>\r\n");
      out.write("\t\t\t\t\t\t17:30 hs\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"horario\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dot gray\"></div>\r\n");
      out.write("\t\t\t\t\t\t20:00 hs\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"btn-group\">\r\n");
      out.write("\t\t\t\t<a href=\"salas.jsp\" class=\"btn\">Volver</a>\r\n");
      out.write("\t\t\t\t<a id=\"btnSiguiente\" href=\"#\" class=\"btn\">Siguiente</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("document.querySelectorAll('.tab').forEach(tab => {\r\n");
      out.write("\ttab.addEventListener('click', function () {\r\n");
      out.write("\t\t// Quitar clase active a todos\r\n");
      out.write("\t\tdocument.querySelectorAll('.tab').forEach(t => t.classList.remove('active'));\r\n");
      out.write("\t\t// Agregar clase active al clickeado\r\n");
      out.write("\t\tthis.classList.add('active');\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("let horarioSeleccionado = null;\r\n");
      out.write("let formatoSeleccionado = null;\r\n");
      out.write("document.querySelectorAll('.format-block').forEach(block => {\r\n");
      out.write("   const formato = block.querySelector('.format-title').innerText.trim();\r\n");
      out.write("   block.querySelectorAll('.horario').forEach(horario => {\r\n");
      out.write("       horario.addEventListener('click', function () {\r\n");
      out.write("           // Quitar selección anterior\r\n");
      out.write("           document.querySelectorAll('.horario.selected').forEach(h => h.classList.remove('selected'));\r\n");
      out.write("           // Marcar el horario clickeado\r\n");
      out.write("           this.classList.add('selected');\r\n");
      out.write("           // Guardar datos seleccionados\r\n");
      out.write("           horarioSeleccionado = this.innerText.trim();\r\n");
      out.write("           formatoSeleccionado = formato;\r\n");
      out.write("       });\r\n");
      out.write("   });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\t<script>\r\n");
      out.write("document.getElementById(\"btnSiguiente\").addEventListener(\"click\", function (e) {\r\n");
      out.write("   e.preventDefault();\r\n");
      out.write("  \r\n");
      out.write("   if (!horarioSeleccionado || !formatoSeleccionado) {\r\n");
      out.write("       alert(\"Por favor, seleccioná un horario antes de continuar.\");\r\n");
      out.write("       return;\r\n");
      out.write("   }\r\n");
      out.write("  \r\n");
      out.write("   const cine = \"Cinemark Alto Avellaneda\";\r\n");
      out.write("   // Guardar en localStorage\r\n");
      out.write("   localStorage.setItem(\"cine\", cine);\r\n");
      out.write("   localStorage.setItem(\"formato\", formatoSeleccionado);\r\n");
      out.write("   localStorage.setItem(\"horario\", horarioSeleccionado);\r\n");
      out.write("   // Redirigir a Butacas\r\n");
      out.write("   window.location.href = \"");
      out.print(request.getContextPath());
      out.write("/butacas/Butaca4.jsp\";\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
