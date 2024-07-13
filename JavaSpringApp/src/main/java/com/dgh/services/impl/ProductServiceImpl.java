/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dgh.services.impl;

import com.dgh.pojo.Product;
import com.dgh.repository.ProductRepository;
import com.dgh.services.ProductService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author admin
 */
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository prodRepo;

    @Override
    public List<Product> getProducts(Map<String, String> params) {
        return this.prodRepo.getProducts(params);
    }

    @Override
    public void addOrUpdate(Product p) {
        this.prodRepo.addOrUpdate(p);
    }

    @Override
    public Product getProduct(int id) {
        return this.prodRepo.getProduct(id);
    }
    
}
