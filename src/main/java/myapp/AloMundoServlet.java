package myapp;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AloMundoServlet extends HttpServlet {
    
    /**
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @Override
    public void doGet(HttpServletRequest request,
    HttpServletResponse response) throws IOException {

        String msg = "Alo, mundo!";
        String nome = request.getParameter("nome");

        if(nome != null) 
            msg = "Alo, "+nome+"!";
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<HTML><BODY>");
        out.println("<h2>"+msg+"</h2><br><br>");

        out.println("<h3><a href=\"\\somatorio\">Calcular Somatório</a></h3>");
        out.println("</BODY></HTML>");
        out.close();
    }
}