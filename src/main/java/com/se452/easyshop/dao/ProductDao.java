package com.se452.easyshop.dao;

import com.se452.easyshop.model.Product;
import java.util.List;

/**
 *
 * @author duely
 */
public interface ProductDao {
     List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
    
}