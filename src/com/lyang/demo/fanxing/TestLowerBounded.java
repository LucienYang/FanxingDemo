package com.lyang.demo.fanxing;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型下限通配符
 * Created by yanglu on 2016/10/24.
 */
public class TestLowerBounded {
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        addNumbers(list1);

        List<Number> list2 = new ArrayList<>();
        addNumbers(list2);

        List<Object> list3 = new ArrayList<>();
        addNumbers(list3);

        List<String> list4 = new ArrayList<>();
        //编译错误，因为String不是Integer的父类
        //addNumbers(list4);
    }
}
