package presentationLayer;

import functionLayer.CustomException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author super
 */
@WebServlet(name = "Logout", urlPatterns = {"/Logout"})
public class Logout extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CustomException {
        request.getSession().invalidate();
        return "index";
    }

}
