package com.yyn.原型模式;

import lombok.SneakyThrows;

/**
 * @author yaoyinong
 * @date 2022/7/6 10:20
 * @description
 */
public class Test {

    @SneakyThrows
    public static void main(String[] args) {
        Mail mail1 = new Mail();
        mail1.setMsg("生日快乐");
        mail1.setName("小红");
        Mail mail2 = (Mail) mail1.clone();
        mail2.setName("小黄");
        System.out.println(mail1.toString());
        System.out.println(mail2.toString());
    }

}
