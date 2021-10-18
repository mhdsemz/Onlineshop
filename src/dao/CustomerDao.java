package dao;

import models.Customer;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDao extends DataBaseAccess {

    public void creat(Customer customer) throws SQLException {
        if (getConnection() != null) {
        String query="INSERT INTO 'onlineShop'.'customer' ('fullName','nationalCode') VALUES (?,?);";
            PreparedStatement statement=getConnection().prepareStatement(query);
            statement.setString(1,customer.getFullName());
            statement.setString(2,customer.getNationalCode());
            statement.executeUpdate();
        }
    }
}
