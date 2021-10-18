package dao;

import models.Order;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OrderDao extends DataBaseAccess {

    public int creatOrder(Order order) throws SQLException {
        if (getConnection() != null) {
            String query = String.format("INSERT INTO 'onlineShop'.'order'  (`idCustomer`, `idProduct`, `status`) VALUES (%d, %d,'%s');",
                    order.getCustomerId(), order.getProductId(), order.getStatus());
            Statement statement = getConnection().createStatement();
            int i = statement.executeUpdate(query);
            if (i != 0) {
                return i;
            } else {
                return -1;
            }
        }
        return -1;
    }

    public int getOrderId(int id) throws SQLException {
        if (getConnection() != null) {
            String sql = String.format("SELECT * FROM onlineShop.order WHERE idOrder=%d;", id);
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                return resultSet.getInt(1);
            }
        }
        return -1;
    }

    public int deleteOrder(int id) throws SQLException {
        if (getConnection() != null) {
            String sql = String.format("DELETE  FROM onlineShop.order WHERE idOrder=%d;", id);
            Statement statement = getConnection().createStatement();
            int i = statement.executeUpdate(sql);
            if (i != 0) {
                return i;
            }
        }
        return -1;
    }

    public int updateOrderStatus(int id) {
        //TO DO
        return -1;
    }

    public List<Order> getOrderList(int id) throws SQLException {
        List<Order> orders = new ArrayList<>();
        if (getConnection() != null) {
            String query = String.format("SELECT * FROM onlineShop.order WHERE idUser=%s AND status='waiting';", id);
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                Order order = new Order(resultSet.getInt(1), resultSet.getInt(2), resultSet.getInt(3), resultSet.getString(4));
                order.setId(resultSet.getInt(1));
                orders.add(order);
            }
        }
        return orders;
    }

}

