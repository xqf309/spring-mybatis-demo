/*
 * Copyright (c) 2015, www.jd.com. All rights reserved.
 *
 * 警告：本计算机程序受著作权法和国际公约的保护，未经授权擅自复制或散布本程序的部分或全部、以及其他
 * 任何侵害著作权人权益的行为，将承受严厉的民事和刑事处罚，对已知的违反者将给予法律范围内的全面制裁。
 */


package com.jd.feima.util;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Description:
 *
 * @author xiongqingfeng
 * @version 1.0.0
 */
/*
 * =========================== 维护日志 ===========================
 * 2016-09-13 20:15  xiongqingfeng 新建代码 
 * =========================== 维护日志 ===========================
 */
public class Messages {

    private static final String RUNDLE_NAME ="intelnal.messages.messages";
	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(RUNDLE_NAME);


    private Messages() {
    }

    public static String getString(String key) {
        try {
            return RESOURCE_BUNDLE.getString(key);
        } catch (MissingResourceException e) {
            return '!' + key + '!';
        }
    }

    public static String getString(String key, String parm1) {
        try {
            return MessageFormat.format(RESOURCE_BUNDLE.getString(key),
                    new Object[] { parm1 });
        } catch (MissingResourceException e) {
            return '!' + key + '!';
        }
    }

    public static String getString(String key, String parm1, String parm2) {
        try {
            return MessageFormat.format(RESOURCE_BUNDLE.getString(key),
                    new Object[] { parm1, parm2 });
        } catch (MissingResourceException e) {
            return '!' + key + '!';
        }
    }

    public static String getString(String key, String parm1, String parm2,
                                   String parm3) {
        try {
            return MessageFormat.format(RESOURCE_BUNDLE.getString(key),
                    new Object[] { parm1, parm2, parm3 });
        } catch (MissingResourceException e) {
            return '!' + key + '!';
        }
    }
} 
