import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PageCountServlet", urlPatterns = "/count")
public class PageCounterServlet extends HttpServlet {
    private static int counter = 0;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String reset = request.getParameter("reset");

        PrintWriter out = response.getWriter();

        if(reset != null){
            counter = 0;
        }
        counter += 1;

        out.println("<h1>The count is: " + counter + "<h1>");
    }
}
