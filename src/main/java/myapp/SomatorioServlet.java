package myapp;

import java.io.IOException;
import java.io.PrintWriter;
//import static javafx.scene.input.KeyCode.P;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Daiane
 */
public class SomatorioServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request,
    HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<title>Servlet SomatorioServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<P>Informe os valores inicial e final para o cálculo do somatório:</P>");

        out.println("<form action=\" mostrasomatorio \" method=\"post\">");
        out.println(" Valor inicial: <input type=\"number\" name=\"inicial\" required/>");
        out.println(" Valor final: <input type=\"number\" name=\"final\"type=\"number\" required/><br><br>");
        out.println(" <input type=\"submit\" value=\"Calcular soma\"/>");
        out.println("</form>");
        out.println("</body></html>");
        out.close();
    }
}
