/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-06-14 12:02:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Quiz_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Quiz Page</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"#\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"webjars/bootstrap/4.5.0/css/bootstrap.min.css\" rel=\"stylesheet\"> \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar navbar-dark bg-dark\">\r\n");
      out.write("\t<a class=\"navbar-brand\" href=\"#\">Team BMMT</a>\r\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t   <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t </button>\r\n");
      out.write("\t\t  <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("\t\t    <ul class=\"navbar-nav\">\r\n");
      out.write("\t\t      <li class=\"nav-item\">\r\n");
      out.write("\t\t        <a class=\"nav-link\" href=\"#\" onClick=\"getHomePage()\">Home<span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("\t\t      </li>\t      \r\n");
      out.write("\t\t      <li class=\"nav-item active\">\r\n");
      out.write("\t\t        <a class=\"nav-link\" href=\"#\" onclick=\"getProgrammerPage()\">Fun Programming Projects</a>\r\n");
      out.write("\t\t     </li>      \r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<div class=\"jumbotron jumbotron-fluid\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <h1 class=\"display-4\">How Well Can You Stop the Spread?</h1>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t<h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${question}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h1>\r\n");
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t\r\n");
      out.write("\t<form action=\"/quizAnswerCheck.do\" method=\"get\">\r\n");
      out.write("\t\t<div class=\"form-check\">\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<button type=\"submit\" class=\"btn btn-success\">Submit</button>\r\n");
      out.write("\t\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("<form action=\"/covid.do\" id=\"home-trigger\"></form>\r\n");
      out.write("<form action=\"/programmer.do\" id=\"programmer-trigger\"></form>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\tfunction getHomePage(){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\tdocument.getElementById(\"home-trigger\").submit();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\tfunction getProgrammerPage(){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\tdocument.getElementById(\"programmer-trigger\").submit();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"webjars/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"webjars/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/Quiz.jsp(49,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/Quiz.jsp(49,3) '${choices}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${choices}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/Quiz.jsp(49,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("choice");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<input class=\"form-check-input\" type=\"radio\" name=\"userchoice\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${choice}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" checked>\r\n");
          out.write("\t\t\t\t  <label class=\"form-check-label\" for=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${choice}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${choice}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t\t\t  </label>\r\n");
          out.write("\t\t\t\t  \r\n");
          out.write("\t\t\t\t  <br>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
