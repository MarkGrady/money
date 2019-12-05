package com.qf.money.controller;

import com.qf.money.pojo.Product;
import com.qf.money.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    //查询所有基金
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<Product> findAll(){
        List<Product> all = productService.findAll();
        return all;
    }

//    //通过id查询对应的基金
//    @RequestMapping(value = "findById/${productId}",method = RequestMethod.GET)
//    public Product findProductById(@RequestParam("productId") int productId){
//        Product productById = productService.findProductById(productId);
//        return productById;
//    }
}
