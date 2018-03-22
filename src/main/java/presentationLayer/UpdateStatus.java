package presentationLayer;

import functionLayer.CustomException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author super
 */
@WebServlet(name = "UpdateStatus", urlPatterns = {"/UpdateStatus"})
public class UpdateStatus extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CustomException {
        String status = request.getParameter("status");
        HttpSession session = request.getSession();
        
        return "employeepage";
    }
}
