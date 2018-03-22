package databaseAccess;

import functionLayer.CustomException;
import functionLayer.Order;
import functionLayer.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

    public static List<Order> getUsersOrders(User user) throws CustomException {
        List<Order> orders = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM Orders WHERE user_id=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, user.getId());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int height = rs.getInt("height");
                int userId = rs.getInt("user_id");
                String status = rs.getString("status");
                orders.add(new Order(id, length, width, height, userId, status));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CustomException(ex.getMessage());
        }
        return orders;
    }

    public static List<Order> getAllOrders() throws CustomException {
        List<Order> orders = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM Orders";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int height = rs.getInt("height");
                int userId = rs.getInt("user_id");
                String status = rs.getString("status");
                orders.add(new Order(id, length, width, height, userId, status));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CustomException(ex.getMessage());
        }
        return orders;
    }

    public static boolean updateStatus(int orderId) throws CustomException {
        boolean changedLines;
        try {
            Connection con = Connector.connection();
            String SQL = "UPDATE Orders SET status='Sent' WHERE id= ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, orderId);
            changedLines = ps.executeUpdate() > 0;
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CustomException(ex.getMessage());
        }
        return changedLines;
    }
}
