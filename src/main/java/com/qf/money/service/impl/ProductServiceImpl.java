package com.qf.money.service.impl;

import com.qf.money.mapper.ProductMapper;
import com.qf.money.pojo.Product;
import com.qf.money.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> findAll() {
        List<Product> products = productMapper.findAll();
        return products;
    }

    @Override
    public Product findProductById(int productId) {
        Product productById = productMapper.findProductById(productId);
        return productById;
    }
}
