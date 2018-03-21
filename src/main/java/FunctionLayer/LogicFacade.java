package FunctionLayer;

import DBAccess.UserMapper;
import DBAccess.OrderMapper;

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
}
