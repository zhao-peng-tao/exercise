import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
   name = "Login",
   urlPatterns = {"/Login"}
)

public class Login extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
    throws ServletException, IOException {

        /**
         *  Indicate the content type (for example, text/html), 
         *  being returned by the response
         */
        response.setContentType("text/html");

        /**
         * Retrieve an output stream to use to send 
         * data to the client 
         */
        PrintWriter out = response.getWriter();

        /**
         *     Write the response
         */        
        String username = request.getParameter("Username");
        String password = request.getParameter("Password");
        String sex=request.getParameter("sex");
        String habits=request.getParameter("habits");
        String imgurl="./resource/img/";
        out.println("<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN'>");
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>");
        out.println("Login");
        out.println("</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("username:"+username);
        out.println("<br>");
        out.println("password:"+password);
        out.println("<br>");
        out.println("sex"+sex);
        out.println("<br>");
        out.println("<br>");
        out.println("<img src=\""+imgurl+habits+".png\">");
        out.println("</BODY>");
        out.println("</HTML>");
        out.flush();
        out.close();
    }
}
