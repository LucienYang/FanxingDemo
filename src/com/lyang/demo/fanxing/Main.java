package com.lyang.demo.fanxing;

import java.util.List;

/**
 * Created by yanglu on 2016/10/18.
 */
public class Main {

    public static <T extends Fruit> void print(T t){
        t.eat();
    }

    public static void main(String[] args) {
        print(new Apple());
        print(new Banana());
    }
}
