import java.io.*;
import javax.servlet.*;
public class LoginFilter implements Filter
{
    public void init(FilterConfig fc)
    {
         try
	  {
              
             }
        catch(Exception e)
       {
            System.out.println(e);
      }
}
  public void doFilter(ServletRequest req,ServletResponse res, FilterChain fchain)
  {
       try
         {
             String s1=req.getParameter("uname");
              String s2=req.getParameter("pwd");
             if(s1.equals("abc") &&(s2.equals("xyz")))
 		{
		   fchain.doFilter(req,res);
                 }
    
            else

	   {
	           PrintWriter pw=res.getWriter();
                   pw.println("<html><body bgcolor=pink text=blue><center>");
                   pw.println("<h1>invalid your Username and Password</h1>");
                   pw.println("<h3>please Renter your Username and Password</h3>");
                   RequestDispatcher rd=req.getRequestDispatcher("/index.html");
                   rd.include(req,res);
                   pw.println("</center></body></html>");
          }
      }
       catch(Exception e)
     {
         System.out.println(e);
     }
  }
     public void destroy()
     {

     }
   }      
         
	  