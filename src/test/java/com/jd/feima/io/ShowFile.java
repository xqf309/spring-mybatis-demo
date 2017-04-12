/*
 * Copyright (c) 2015, www.jd.com. All rights reserved.
 *
 * 警告：本计算机程序受著作权法和国际公约的保护，未经授权擅自复制或散布本程序的部分或全部、以及其他
 * 任何侵害著作权人权益的行为，将承受严厉的民事和刑事处罚，对已知的违反者将给予法律范围内的全面制裁。
 */


package com.jd.feima.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Description:
 *
 * @author xiongqingfeng
 * @version 1.0.0
 */
/*
 * =========================== 维护日志 ===========================
 * 2016-11-16 18:34  xiongqingfeng 新建代码 
 * =========================== 维护日志 ===========================
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        if(args.length !=1){
            System.out.println("Usage:ShowFile filename");
            return;
        }


        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("can't open file");
            return;
        }

        try {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            }while(i!=-1);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }finally {
            try {
                fin.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }




    }
} 
