/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uan.fis.jeesample.dao;

import edu.uan.fis.jeesample.dto.ProductCategory;
import java.util.List;

/**
 *
 * @author Luis Herrera
 */
public interface ProductCategoryDao {
        /**
     * Creates a new productCategory. 
     * @param productCategory
     * @return 
     */
    ProductCategory create(ProductCategory productCategory);

    /**
     * Updates an existing productCategory. ProductCategory id can't be modified.
     * @param productCategory
     * @return 
     */
    ProductCategory update(ProductCategory productCategory);

    /**
     * Deletes an existing productCategory
     * @param productCategory 
     */
    void delete(ProductCategory productCategory);

    /**
     * Find a productCategory by id
     * @param productCategoryId
     * @return 
     */
    ProductCategory findById(Integer productCategoryId);

    /**
     * Returns all the productCategorys in the database
     * @return 
     */
    List<ProductCategory> findAll();
}
