import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calculateSum")
public class CalculateSumServlet extends HttpServlet {
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
 int num1 = Integer.parseInt(request.getParameter("num1"));
 int num2 = Integer.parseInt(request.getParameter("num2"));
 int sum = num1 + num2;
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 out.println("<html><body>");
 out.println("<h1>The sum of " + num1 + " and " + num2 + " is: " + sum + "</h1>");
 out.println("</body></html>");
 }
}
