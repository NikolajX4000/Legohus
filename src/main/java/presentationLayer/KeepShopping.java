package presentationLayer;

import functionLayer.CustomException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author super
 */
@WebServlet(name = "KeepShopping", urlPatterns = {"/KeepShopping"})
public class KeepShopping extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CustomException {
        return "customerpage";
    }

}
