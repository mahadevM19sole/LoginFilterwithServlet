import java.io.*;
import javax.servlet.http.*;
public class WelcomeServlet extends HttpServlet
 {
    public void doGet(HttpServletRequest hreq,HttpServletResponse hres)
    {
        try
          {
               PrintWriter pw=hres.getWriter();
              pw.println("<html><body bgcolor=lightgreen text=red><center>");
              pw.println("<h1>Welcome Filter Servlet</h1>");
              pw.println("</center></body></html>");
           }
        catch(Exception e)
	 {
               System.out.println(e);
          }
      }
  }