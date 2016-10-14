/*
 * Copyright (c) 2015, www.jd.com. All rights reserved.
 *
 * 警告：本计算机程序受著作权法和国际公约的保护，未经授权擅自复制或散布本程序的部分或全部、以及其他
 * 任何侵害著作权人权益的行为，将承受严厉的民事和刑事处罚，对已知的违反者将给予法律范围内的全面制裁。
 */


package com.jd.feima.service;

import com.alibaba.fastjson.JSON;
import com.jd.feima.domain.UserInfo;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Description:
 *
 * @author xiongqingfeng
 * @version 1.0.0
 */
/*
 * =========================== 维护日志 ===========================
 * 2016-05-31 12:43  xiongqingfeng 新建代码 
 * =========================== 维护日志 ===========================
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml","classpath:spring/spring-mybatis.xml"})
public class UserSerivceTest {
    private static final Logger LOGGER = Logger
            .getLogger(UserSerivceTest.class);


    @Autowired
    private UserService userService;


    @Test
    public void testQueryById1() {
        UserInfo userInfo = userService.getUserById(1);
        LOGGER.info(JSON.toJSON(userInfo));
    }

    @Test
    public void testQueryAll() {
        List<UserInfo> userInfos = userService.getUsers();
        LOGGER.info(JSON.toJSON(userInfos));
    }

    @Test
    public void testInsert() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUname("xiaoming");
        userInfo.setUnumber(4);
        int result = userService.insert(userInfo);
        System.out.println(result);
    }

} 
