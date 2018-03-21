package FunctionLayer;

import DBAccess.UserMapper;
import DBAccess.OrderMapper;
import java.util.List;

public class LogicFacade {

    public static User login(String email, String password) throws CustomException {
        return UserMapper.login(email, password);
    }

    public static User createUser(String email, String password) throws CustomException {
        User user = new User(email, password, "customer");
        UserMapper.createUser(user);
        return user;
    }

    public static boolean newOrder(Order order) throws CustomException {
        return OrderMapper.createOrder(order);
    }

    public static List<Order> getUsersOrders(User user) throws CustomException {
        return OrderMapper.getUsersOrders(user);
    }

    public static List<Order> getAllOrders() throws CustomException {
        return OrderMapper.getAllOrders();
    }
}
