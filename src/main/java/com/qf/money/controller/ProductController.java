package com.qf.money.controller;

import com.qf.money.pojo.Product;
import com.qf.money.service.ProductService;
import com.qf.money.utils.PhoneTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
//    log4j日志
    private static final Logger logger= LogManager.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    //查询所有基金
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<Product> findAll(){
        List<Product> all = productService.findAll();
        return all;
    }

    //通过id查询对应的基金
    @RequestMapping(value = "/findById",method = RequestMethod.GET)
    public Product findProductById(@RequestParam("productId") int productId){
        Product productById = productService.findProductById(productId);
        if (productById!=null){
            return productById;
        }
        return null;
    }

}
