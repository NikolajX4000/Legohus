package presentationLayer;

import functionLayer.LogicFacade;
import functionLayer.CustomException;
import functionLayer.User;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CustomException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User user = LogicFacade.login(email, password);
        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        session.setAttribute("role", user.getRole());
        if(user.getRole().equals("employee")){
            session.setAttribute("allOrders", LogicFacade.getAllOrders());
        }
        return "/WEB-INF/" + user.getRole() + "page";
    }
}
