package myapp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Daiane
 */
public class MostraSomatorioServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request,
    HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=UTF-8");
        int inicio = Integer.parseInt(request.getParameter("inicial"));
        int fim = Integer.parseInt(request.getParameter("final"));
        int soma = 0;
        
        if (inicio == fim)
            soma=0;
        else{
            for(int i=inicio; i<=fim; i++){
                soma += i;
            }
        }
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<title>Servlet MostraSomatorioServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<P>O somatório de "+inicio+" a "+fim+" é "+soma+"</P><br/>");
        out.println("</body></html>");
        out.close();
    }
}

