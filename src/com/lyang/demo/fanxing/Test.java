package com.lyang.demo.fanxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yanglu on 2016/10/19.
 */
public class Test<A> {
    public static void printList(List<Object> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }
    public static void printList2(List<?> list) {
        for (Object elem: list)
            System.out.print(elem + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String>  ls = Arrays.asList("one", "two", "three");
        printList(li);
        printList(ls);
    }
}
