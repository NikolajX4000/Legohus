package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.CustomException;
import FunctionLayer.Order;
import FunctionLayer.User;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author super
 */
@WebServlet(name = "Shop", urlPatterns = {"/Shop"})
public class Shop extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CustomException {
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        int height = Integer.parseInt(request.getParameter("height"));
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        Order order = new Order(length, width, height, user.getId());
        boolean added = LogicFacade.newOrder(order);
        if (!added) {
            throw new CustomException("Could not add order");
        } else {
            return "orderpage";
        }
    }
}
