package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dao.IConnectionFactory;
import edu.uan.fis.jeesample.dao.ProductDao;
import edu.uan.fis.jeesample.dto.Product;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Product DAO implementation using JDBC
 */
public class ProductDaoJdbc implements ProductDao {

    @Override
    public Product create(Product product) {
        // Fabrica no es el mejor patrón para implementar en conexiones, pero así se solicitó.
        //
        IConnectionFactory connectionFactory = new JdbcConnectionFactory();
        try (Connection conn = connectionFactory.createConnection()) {
            try (PreparedStatement stmt = conn.prepareStatement("INSERT INTO products VALUES(?,?)")) {
                stmt.setInt(1, product.getProductId());
                stmt.setString(2, product.getName());
                stmt.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product;
    }

    @Override
    public Product update(Product product) {
        // Fabrica no es el mejor patrón para implementar en conexiones, pero así se solicitó.
        //
        IConnectionFactory connectionFactory = new JdbcConnectionFactory();
        try (Connection conn = connectionFactory.createConnection()) {
            try (PreparedStatement stmt = conn.prepareStatement("UPDATE products set NAME = ? where productId = ?")) {
                stmt.setString(1, product.getName());
                stmt.setInt(2, product.getProductId());
                stmt.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product;
    }

    @Override
    public void delete(Product product) {
        // Fabrica no es el mejor patrón para implementar en conexiones, pero así se solicitó.
        //
        IConnectionFactory connectionFactory = new JdbcConnectionFactory();
        try (Connection conn = connectionFactory.createConnection()) {
            try (PreparedStatement stmt = conn.prepareStatement("DELETE FROM products where productId = ?")) {
                stmt.setInt(1, product.getProductId());
                stmt.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Product findById(Integer productId) {
        Product product = null;
        // Fabrica no es el mejor patrón para implementar en conexiones, pero así se solicitó.
        IConnectionFactory connectionFactory = new JdbcConnectionFactory();
        try (Connection conn = connectionFactory.createConnection()) {
            try (PreparedStatement stmt = conn.prepareStatement("SELECT PRODUCTID, NAME FROM products where PRODUCTID = ?")) {
                stmt.setInt(1, productId);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    product = new Product();
                    product.setProductId(rs.getInt("PRODUCTID"));
                    product.setName(rs.getString("NAME"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product;
    }

    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        // Fabrica no es el mejor patrón para implementar en conexiones, pero así se solicitó.
        //
        IConnectionFactory connectionFactory = new JdbcConnectionFactory();
        try (Connection conn = connectionFactory.createConnection()) {
            try (PreparedStatement stmt = conn.prepareStatement("SELECT PRODUCTID, NAME FROM products")) {
                ResultSet rs = stmt.executeQuery();
                while(rs.next()){
                    Product product = new Product();
                    product.setProductId(rs.getInt("PRODUCTID"));
                    product.setName(rs.getString("NAME"));
                    productList.add(product);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productList;
    }
}
