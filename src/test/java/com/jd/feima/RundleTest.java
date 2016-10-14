/*
 * Copyright (c) 2015, www.jd.com. All rights reserved.
 *
 * 警告：本计算机程序受著作权法和国际公约的保护，未经授权擅自复制或散布本程序的部分或全部、以及其他
 * 任何侵害著作权人权益的行为，将承受严厉的民事和刑事处罚，对已知的违反者将给予法律范围内的全面制裁。
 */


package com.jd.feima;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Description:
 *
 * @author xiongqingfeng
 * @version 1.0.0
 */
/*
 * =========================== 维护日志 ===========================
 * 2016-09-13 20:22  xiongqingfeng 新建代码 
 * =========================== 维护日志 ===========================
 */
public class RundleTest {
    @Test
    public void TestRundle(){
        Locale locale1 = new Locale("zh", "CN");
        ResourceBundle resb1 = ResourceBundle.getBundle("com\\jd\\myres");
        System.out.println(resb1.getString("aaa"));

        ResourceBundle resb2 = ResourceBundle.getBundle("com\\jd\\myres", Locale.getDefault());
        System.out.println(resb1.getString("aaa"));

        Locale locale3 = new Locale("en", "US");
        ResourceBundle resb3 = ResourceBundle.getBundle("com\\jd\\myres", locale3);
        System.out.println(resb3.getString("aaa"));
    }
    @Test
    public void productXMl(){
        Properties prop = new Properties();
        prop.put("Height","200");
        prop.put("Weight","15");
        try {
            FileOutputStream fos = new FileOutputStream("properties.xml");
            prop.storeToXML(fos, null);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
} 
