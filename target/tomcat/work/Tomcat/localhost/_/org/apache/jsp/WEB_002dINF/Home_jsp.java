/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-06-14 12:58:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"ISO-8859-1\">\r\n");
      out.write("      <title>Covid-19 Interactive Session</title>\r\n");
      out.write("      \r\n");
      out.write("      <link href=\"webjars/bootstrap/4.5.0/css/bootstrap.min.css\" rel=\"stylesheet\"> \r\n");
      out.write("  </head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" <div class=\"pos-f-t\">\r\n");
      out.write("        <div class=\"collapse\" id=\"navbarToggleExternalContent\">\r\n");
      out.write("          <div class=\"bg-dark p-4\">\r\n");
      out.write("           \t<ul class=\"nav-bar nav\">\r\n");
      out.write("          \t\t<li class=\"nav-item\">\r\n");
      out.write("          \t\t\t<a class=\"nav-link\" href=\"#\" style=\"color:white\">Home</a>\r\n");
      out.write("          \t\t</li>\r\n");
      out.write("          \t\t<li class=\"nav-item\">\r\n");
      out.write("          \t\t\t<a class=\"nav-link\" href=\"#\" style=\"color:white\" onClick=\"getProgrammerPage()\">Fun Programming Projects</a>\r\n");
      out.write("          \t\t</li>\r\n");
      out.write("\t          \t<li class=\"nav-item\">\r\n");
      out.write("\t          \t\t<a class=\"nav-link\" href=\"#\" style=\"color:white\" onClick=\"getQuizPage()\">Can You Stop the Spread - Quiz</a>\r\n");
      out.write("\t          \t</li>\r\n");
      out.write("          \t</ul>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <nav class=\"navbar navbar-dark bg-dark\">\r\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarToggleExternalContent\" aria-controls=\"navbarToggleExternalContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("  \t\t</nav>\r\n");
      out.write("  \t\t \r\n");
      out.write("   </div>\r\n");
      out.write("\t<h1 class=\"text-center\">Welcome to Our Covid-19 Interactive Info Session</h1>\r\n");
      out.write("\t<hr>\r\n");
      out.write("<div class=\"jumbotron jumbotron-fluid\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <h1 class=\"display\">COVID-19</h1>\r\n");
      out.write("    <p class=\"lead\">\"We need to learn the lessons that are being shown from this virus,\" Dr. Michael J. Ryan, WHO Informal Advisory Group.</p>\r\n");
      out.write("  </div>\r\n");
      out.write(" \r\n");
      out.write("</div>\r\n");
      out.write("<hr>\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t<img src=\"/images/parkCropped.jpg\" usemap=\"#image-map\" class=\"img-fluid\">\r\n");
      out.write("\t\t<map name=\"image-map\">\r\n");
      out.write("\t\t    <area target=\"_self\" alt=\"Sun\" title=\"Enjoy the Sunset. Preferably at home.\" href=\"\" coords=\"263,44,308,53,294,89,281,142,272,145,260,128,246,90,228,53\" shape=\"poly\">\r\n");
      out.write("\t\t    <area target=\"_self\" alt=\"Dog\" title=\"Why is this dog wearing mask?\" href=\"\" coords=\"199,323,188,329,181,349,186,357,199,356,203,369,198,389,208,389,214,373,219,381,217,389,224,391,223,372,244,365,244,376,240,382,248,379,252,369,256,358,266,355,276,354,279,361,283,350,264,353,259,338,253,321,252,331,236,333,220,321\" shape=\"poly\" >\r\n");
      out.write("\t\t    <area target=\"_self\" alt=\"Masked Boy 1\" title=\"Make sure you wear a mask!\" href=\"\" coords=\"75,211,88,214,105,214,112,209,116,223,114,229,112,239,125,249,132,256,146,271,140,273,112,252,114,273,130,294,131,314,140,318,121,323,124,297,108,282,85,282,95,308,101,329,85,331,84,305,75,285,66,261,73,246\" shape=\"poly\">\r\n");
      out.write("\t\t    <area target=\"_self\" alt=\"No Mask Girl\" title=\"Stay the appropriate distance apart\" href=\"\" coords=\"254,199,241,209,236,227,228,227,237,239,255,239,266,237,267,243,259,247,250,255,236,257,248,261,261,256,256,265,254,270,264,273,271,273,274,289,287,296,287,273,296,267,285,257,305,258,313,247,292,251,276,242,297,232,270,205,268,194\" shape=\"poly\">\r\n");
      out.write("\t\t    <area target=\"_self\" alt=\"Net Man\" title=\"Enjoy the wildlife\" href=\"\" coords=\"191,185,164,192,164,209,157,221,168,241,186,240,186,217,208,212,220,218,228,211,223,197,188,211\" shape=\"poly\">\r\n");
      out.write("\t\t    <area target=\"_self\" alt=\"Masked Girl 1 (Not on mask)\" title=\"\" href=\"\" coords=\"374,277,362,289,370,317,360,339,368,357,371,378,356,396,380,391,387,365,400,378,399,391,410,381,393,356,392,321,388,289,382,272\" shape=\"poly\">\r\n");
      out.write("\t\t    <area target=\"_self\" alt=\"Cave\" title=\"Cave\" href=\"\" coords=\"234,93,211,134,260,130\" shape=\"poly\">\r\n");
      out.write("\t\t    <area target=\"_self\" alt=\"Workout Guy\" title=\"Enjoy some yoga in nature\" href=\"\" coords=\"263,141,263,153,234,155,231,162,248,161,245,169,250,172,260,163,268,175,294,153,273,150\" shape=\"poly\">\r\n");
      out.write("\t\t    <area target=\"_self\" alt=\"Masked Girl 1 (Mask)\" title=\"Have a walk for your mental health\" href=\"\" coords=\"374,273,356,292,342,283,351,241,365,233,390,237,395,257,404,285,392,286\" shape=\"poly\">\r\n");
      out.write("\t\t    <area target=\"_self\" alt=\"Masked Man (Mask)\" title=\"Go out for to the park safely for some fresh air for once! I know you don't you're a programmer.\" href=\"\" coords=\"418,200,395,174,413,151,440,173\" shape=\"poly\" >\r\n");
      out.write("\t\t</map>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t<p class=\"text-left\" id=\"prompt\">\r\n");
      out.write("\r\n");
      out.write("\t\t\tHover on people or objects in the image for suggestions and precautions for outdoor activities\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t<form action=\"/quiz.do\" method=\"get\" id=\"quiz-trigger\"></form> \r\n");
      out.write("\t\r\n");
      out.write("\t <form action=\"/programmer.do\" method=\"get\" id=\"programmer-trigger\"></form> \r\n");
      out.write("   \r\n");
      out.write("<script src=\"webjars/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"webjars/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\tconst mask-msg = \"Make sure you wear a mask!\";\r\n");
      out.write("\tconst dog-msg = \"Why is this dog wearing mask?\";\r\n");
      out.write("\tconst walk-msg = \"Take a walk with your dog\";\r\n");
      out.write("\tconst yoga-msg = \"Enjoy some yoga in nature\";\r\n");
      out.write("\tconst net-msg = \"Enjoy the wildlife\";\r\n");
      out.write("\tconst distance-msg = \"Stay the appropriate distance apart\";\r\n");
      out.write("\tconst chill-msg = \"Go out for to the park safely for some fresh air for once! I know you don't you're a programmer.\";\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getQuizPage(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdocument.getElementById(\"quiz-trigger\").submit();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getProgrammerPage(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdocument.getElementById(\"programmer-trigger\").submit();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
}
