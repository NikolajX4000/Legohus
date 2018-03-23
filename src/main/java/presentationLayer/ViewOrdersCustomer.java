package presentationLayer;

import functionLayer.CustomException;
import functionLayer.LogicFacade;
import functionLayer.Order;
import functionLayer.User;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ViewOrdersCustomer", urlPatterns = {"/ViewOrdersCustomer"})
public class ViewOrdersCustomer extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CustomException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        List<Order> orders = LogicFacade.getUsersOrders(user);
        session.setAttribute("orders", orders);
        return "/WEB-INF/" + "customerorderpage";
    }
}
