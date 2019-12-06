package com.qf.money;

import com.qf.money.mapper.ProductMapper;
import com.qf.money.mapper.UserMapper;
import com.qf.money.pojo.Product;
import com.qf.money.pojo.User;
import com.qf.money.pojo.UserExample;
import com.qf.money.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Slf4j
@SpringBootTest
class MoneyApplicationTests {


//
//    @Autowired
//    private AdminService adminService;
//
//    @Test
//    @ResponseBody
//    public void findAllUser() {
//        List<User> allUser = adminService.findAllUser();
//        for(User user: allUser){
//            log.info("================"+user.toString());
//        }
//
//
//    }




}
