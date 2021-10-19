package dao;

import models.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDao extends DataBaseAccess {

    Product product = new Product();

    public List<Product> getListOfProducts() throws SQLException {
        List<Product> productList = new ArrayList<>();
        if (getConnection() != null) {
            String query = String.format("SELECT * FROM onlineShop.product ;");
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                Product product = new Product(resultSet.getString(2), resultSet.getInt(1), resultSet.getString(3));
                productList.add(product);
            }
        }
        return productList;
    }

    public int getProduct(Product product) throws SQLException {
        if (getConnection() != null) {
            String query = String.format("SELECT * FROM onlineShop.product WHERE name='%s' AND price=%d ;", product.getName(), product.getPrice());
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                return resultSet.getInt(1);
            } else
                return -1;
        }
        return -1;
    }
}
