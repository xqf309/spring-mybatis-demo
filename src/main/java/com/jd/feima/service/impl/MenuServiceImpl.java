/*
 * Copyright (c) 2015, www.jd.com. All rights reserved.
 *
 * 警告：本计算机程序受著作权法和国际公约的保护，未经授权擅自复制或散布本程序的部分或全部、以及其他
 * 任何侵害著作权人权益的行为，将承受严厉的民事和刑事处罚，对已知的违反者将给予法律范围内的全面制裁。
 */


package com.jd.feima.service.impl;

import com.jd.feima.domain.Menu;
import com.jd.feima.service.MenuService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description:
 *
 * @author xiongqingfeng
 * @version 1.0.0
 */
/*
 * =========================== 维护日志 ===========================
 * 2016-05-31 16:41  xiongqingfeng 新建代码 
 * =========================== 维护日志 ===========================
 */
@Component("menuService")
public class MenuServiceImpl implements MenuService {
    @Override
    public List<Menu> getAll() {
        List<Menu> list = getMenu();
        return list;
    }

    private List<Menu> getMenu() {
        Menu m1 = new Menu("商家管理","merchant",1);
        Menu m2 = new Menu("商品管理","product",2);
        Menu m3 = new Menu("审核管理","audit",3);
        Menu m4 = new Menu("汇总管理","collect",4);
        return Arrays.asList(m1,m2,m3,m4);
    }
}
