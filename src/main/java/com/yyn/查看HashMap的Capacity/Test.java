package com.yyn.查看HashMap的Capacity;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yaoyinong
 * @date 2022/7/6 13:52
 * @description
 */
public class Test {

    @SneakyThrows
    public static void main(String[] args) {
        Map<Integer, Object> map = new HashMap<>(2);
        Class mapClass = map.getClass();
        Field threshold = mapClass.getDeclaredField("threshold");
        threshold.setAccessible(true);
        Method capacity = mapClass.getDeclaredMethod("capacity");
        capacity.setAccessible(true);

        System.out.println("容量：" + capacity.invoke(map) + ",阈值：" + threshold.get(map) + ",元素数量：" + map.size());
        for (int i = 0; i < 16; i++) {
            map.put(i, i);
            //动态监测HashMap的容量、阈值和元素数量
            System.out.println("容量：" + capacity.invoke(map) + ",阈值：" + threshold.get(map) + ",元素数量：" + map.size());
        }
    }

}
