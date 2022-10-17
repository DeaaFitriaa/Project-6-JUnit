/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.pojo.Products;

/**
 *
 * @author Dea Fitria
 */
public class ProductsDao extends BaseDao {
    
    public Products getByProperty(String property, Object value) {
        return Products.class.cast(super.getByProperty(Products.class, property, value));
    }
    
}
