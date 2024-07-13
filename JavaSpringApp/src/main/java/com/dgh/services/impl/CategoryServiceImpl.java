/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dgh.services.impl;

import com.dgh.pojo.Category;
import com.dgh.repository.CategoryRepository;
import com.dgh.services.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author admin
 */
@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryRepository cateRepo;
    
    @Override
    @Transactional
    public List<Category> getCates() {
        return this.cateRepo.getCates();
    }
    
}
