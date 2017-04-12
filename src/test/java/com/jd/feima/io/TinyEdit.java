/*
 * Copyright (c) 2015, www.jd.com. All rights reserved.
 *
 * 警告：本计算机程序受著作权法和国际公约的保护，未经授权擅自复制或散布本程序的部分或全部、以及其他
 * 任何侵害著作权人权益的行为，将承受严厉的民事和刑事处罚，对已知的违反者将给予法律范围内的全面制裁。
 */


package com.jd.feima.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Description:
 *
 * @author xiongqingfeng
 * @version 1.0.0
 */
/*
 * =========================== 维护日志 ===========================
 * 2016-11-16 17:54  xiongqingfeng 新建代码 
 * =========================== 维护日志 ===========================
 */
public class TinyEdit {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        System.out.println("Enter lines of text");
        System.out.println("Enter 'stop' to quit");
        for(int i=0;i<100;i++){
            str[i]=br.readLine();
            if(str[i].equals("stop")){
                break;
            }
        }
        System.out.println("\n here is you file");
        for(int i=0;i<100;i++){
            if(str[i].equals("stop")) break;
            System.out.println(str[i]);
        }
    }
} 
