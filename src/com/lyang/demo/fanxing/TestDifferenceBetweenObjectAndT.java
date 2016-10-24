package com.lyang.demo.fanxing;

import java.util.Arrays;
import java.util.List;

/**
 * 测试泛型参数Object和T的区别
 * Created by yanglu on 2016/10/25.
 */
public class TestDifferenceBetweenObjectAndT {
    public static void printList1(List<Object> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

    public static <T> void printList2(List<T> list) {
        for (T elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String>  ls = Arrays.asList("one", "two", "three");
        /*
        * this can not pass compile , because Integer and String
        * is not subtypes of Object
        * */
        //printList1(li);
        //printList1(ls);

        printList2(li);
        printList2(ls);
    }
}
