/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dgh.services;

import com.dgh.pojo.Product;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public interface ProductService {
    List<Product> getProducts(Map<String, String> params);
    void addOrUpdate(Product p);
    Product getProduct(int id);
    void deleteProduct(int id);
}
