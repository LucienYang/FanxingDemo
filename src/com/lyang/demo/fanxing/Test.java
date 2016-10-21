package com.lyang.demo.fanxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yanglu on 2016/10/19.
 */
public class Test<T1,T2,T3> {
    public void print(T1 t1,T2 t2,T3 t3){
        System.out.println(t1.getClass());
        System.out.println(t2.getClass());
        System.out.println(t3.getClass());
    }
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
        /*List<String>  ls = Arrays.asList("one", "two", "three");
        printList2(li);
        printList2(ls);*/
        Box<String> stringBox = new Box<>();
        Box rawBox = stringBox;
        rawBox.set(8);
        System.out.println(rawBox.get().getClass());
    }
}
