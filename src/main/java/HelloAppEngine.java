import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "",
    urlPatterns = {"/"}
)
public class HelloAppEngine extends HttpServlet {

  /**
	 * 
	 */
	private static final long serialVersionUID = -326588183982128028L;

@Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

	RequestDispatcher rd = request.getRequestDispatcher("/index.html");
	try {
		rd.forward(request, response);
	} catch (ServletException e) {
		e.printStackTrace();
	}
  }
}