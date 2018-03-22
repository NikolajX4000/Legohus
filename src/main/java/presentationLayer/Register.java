package presentationLayer;

import functionLayer.LogicFacade;
import functionLayer.CustomException;
import functionLayer.User;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Register", urlPatterns = {"/Register"})
public class Register extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CustomException {
        String email = request.getParameter("email");
        String password1 = request.getParameter("password1");
        String password2 = request.getParameter("password2");
        if (password1.equals(password2)) {
            User user = LogicFacade.createUser(email, password1);
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            session.setAttribute("role", user.getRole());
            return "/WEB-INF/" + user.getRole() + "page";
        } else {
            throw new CustomException("the two passwords did not match");
        }
    }
}
