/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2025-06-17 03:12:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pagos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class MetodoDePago_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("java.util");
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/metodopago.css\">\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Método de Pago</title>\r\n");
      out.write("      \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-container\">\r\n");
      out.write("    <div class=\"banner\">POR FAVOR VALIDÁ Y COMPLETÁ TUS DATOS</div>\r\n");
      out.write("\r\n");
      out.write("  ");

        String error = request.getParameter("error");
        if (error != null) {
    
      out.write("\r\n");
      out.write("        <div style=\"color:red; text-align:center; margin-bottom:10px;\">\r\n");
      out.write("            ");
 if ("datos".equals(error)) { 
      out.write("\r\n");
      out.write("                Faltan datos obligatorios.\r\n");
      out.write("            ");
 } else if ("monto".equals(error)) { 
      out.write("\r\n");
      out.write("                Monto inválido.\r\n");
      out.write("            ");
 } else if ("sql".equals(error)) { 
      out.write("\r\n");
      out.write("                Error al guardar el pago en la base de datos.\r\n");
      out.write("            ");
 } else if ("registro".equals(error)) { 
      out.write("\r\n");
      out.write("                No se pudo registrar el pago.\r\n");
      out.write("            ");
 } else if ("nologueado".equals(error)) { 
      out.write("\r\n");
      out.write("                Debés iniciar sesión para realizar el pago.\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    ");
 } 
      out.write(' ');
      out.write('\r');
      out.write('\n');

    double totalEntradas = 0;
    double totalCombos = 0;

    if (session.getAttribute("totalEntradas") != null) {
        totalEntradas = Double.parseDouble((String) session.getAttribute("totalEntradas"));
    }
    if (session.getAttribute("totalCombos") != null) {
        totalCombos = Double.parseDouble((String) session.getAttribute("totalCombos"));
    }

    double montoTotal = totalEntradas + totalCombos;

      out.write("\r\n");
      out.write("    <form action=\"");
      out.print(request.getContextPath());
      out.write("/ConfirmarPagoController\" method=\"post\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <label for=\"nombre\">Nombre*</label>\r\n");
      out.write("                <input type=\"text\" name=\"nombre\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <label for=\"apellido\">Apellido*</label>\r\n");
      out.write("                <input type=\"text\" name=\"apellido\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"dni\">DNI (Titular de la cuenta)*</label>\r\n");
      out.write("        <input type=\"text\" name=\"dni\" required>\r\n");
      out.write("\r\n");
      out.write("        <label>Fecha de nacimiento*</label>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <select name=\"anio\" required>\r\n");
      out.write("                <option>Año</option>\r\n");
      out.write("                ");
 for(int i = 2024; i >= 1920; i--) { 
      out.write("\r\n");
      out.write("                    <option>");
      out.print( i );
      out.write("</option>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("            <select name=\"mes\" required>\r\n");
      out.write("                <option>Mes</option>\r\n");
      out.write("                ");
 for(int i = 1; i <= 12; i++) { 
      out.write("\r\n");
      out.write("                    <option>");
      out.print( i );
      out.write("</option>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("            <select name=\"dia\" required>\r\n");
      out.write("                <option>Día</option>\r\n");
      out.write("                ");
 for(int i = 1; i <= 31; i++) { 
      out.write("\r\n");
      out.write("                    <option>");
      out.print( i );
      out.write("</option>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"email\">Email</label>\r\n");
      out.write("        <input type=\"email\" name=\"email\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <label for=\"titular\">Nombre del titular</label>\r\n");
      out.write("                <input type=\"text\" name=\"titular\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <label for=\"dnit\">DNI del titular</label>\r\n");
      out.write("                <input type=\"text\" name=\"dnit\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <label for=\"tarjeta\">Número de tarjeta</label>\r\n");
      out.write("                <input type=\"text\" name=\"tarjeta\" placeholder=\"0000 0000 0000 0000\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <label for=\"codigo\">Código de seguridad</label>\r\n");
      out.write("                <input type=\"password\" name=\"codigo\" maxlength=\"3\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <label>Fecha de vencimiento</label>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <select name=\"mes_vencimiento\">\r\n");
      out.write("                <option>Mes</option>\r\n");
      out.write("                ");
 for(int i = 1; i <= 12; i++) { 
      out.write("\r\n");
      out.write("                    <option>");
      out.print( i );
      out.write("</option>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("            <select name=\"anio_vencimiento\">\r\n");
      out.write("                <option>Año</option>\r\n");
      out.write("                ");
 for(int i = 2024; i <= 2035; i++) { 
      out.write("\r\n");
      out.write("                    <option>");
      out.print( i );
      out.write("</option>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"medio_pago\">Medio de pago</label>\r\n");
      out.write("        <select name=\"metodoPago\" required>\r\n");
      out.write("            <option value=\"\">Por favor seleccione uno</option>\r\n");
      out.write("            <option>Credito</option>\r\n");
      out.write("            <option>Debito</option>\r\n");
      out.write("            <option>Transferencia</option>\r\n");
      out.write("        </select>\r\n");
      out.write("\r\n");
      out.write("        <!-- Monto fijo de ejemplo -->\r\n");
      out.write("\r\n");
      out.write("    <input type=\"hidden\" name=\"totalEntradas\" value=\"");
      out.print( totalEntradas );
      out.write("\" />\r\n");
      out.write("    <input type=\"hidden\" name=\"totalCombos\" value=\"");
      out.print( totalCombos );
      out.write("\" />\r\n");
      out.write("    <input type=\"hidden\" name=\"monto\" value=\"");
      out.print( montoTotal );
      out.write("\" />\r\n");
      out.write("\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("        ");

            String[] selectedSeats = (String[]) session.getAttribute("selectedSeats");
            if (selectedSeats != null) {
                for (String seat : selectedSeats) {
        
      out.write("\r\n");
      out.write("            <input type=\"hidden\" name=\"selectedSeats\" value=\"");
      out.print( seat );
      out.write("\">\r\n");
      out.write("        ");

                }
            }
        
      out.write("\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");

            String pelicula = (String) session.getAttribute("pelicula");
            if (pelicula != null && (pelicula.equals("mine") || pelicula.equals("blanca") || pelicula.equals("rescate") || pelicula.equals("lilo"))) {
        
      out.write("\r\n");
      out.write("            <input type=\"hidden\" name=\"pelicula\" value=\"");
      out.print( pelicula );
      out.write("\" />\r\n");
      out.write("        ");

            }
        
      out.write("\r\n");
      out.write("         ");
      out.write("\r\n");
      out.write("        ");

    		String combosSeleccionados = (String) session.getAttribute("combosSeleccionados");
    		if (combosSeleccionados != null) {
		
      out.write("\r\n");
      out.write("    \t\t<input type=\"hidden\" name=\"combosJSON\" value='");
      out.print( combosSeleccionados );
      out.write("' />\r\n");
      out.write("\t\t");

    		}
		
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("        <button class=\"submit-btn\" type=\"submit\">CONFIRMAR PAGO</button>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
