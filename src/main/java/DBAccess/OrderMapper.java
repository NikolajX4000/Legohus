package DBAccess;

import FunctionLayer.CustomException;
import FunctionLayer.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderMapper {

    public static boolean createOrder(Order order) throws CustomException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO Orders (length, width, height, user_id) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, order.getLength());
            ps.setInt(2, order.getWidth());
            ps.setInt(3, order.getHeight());
            ps.setInt(4, order.getUserId());
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
            order.setId(id);
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            throw new CustomException(ex.getMessage());
        }
    }
    
}
