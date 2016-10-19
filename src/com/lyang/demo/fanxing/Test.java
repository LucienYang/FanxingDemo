package com.lyang.demo.fanxing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanglu on 2016/10/19.
 */
public class Test<A> {
    public List<A> list = new ArrayList<A>();
    public static void main(String[] args) {
        Test<String> test1 = new Test<String>();
        test1.list.add("hello");
        System.out.println(test1.list);

        Test<Integer> test2 = new Test<Integer>();
        test2.list.add(123);
        System.out.println(test2.list);
    }
}
