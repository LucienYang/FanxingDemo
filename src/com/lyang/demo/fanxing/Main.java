package com.lyang.demo.fanxing;

import java.util.List;

/**
 * Created by yanglu on 2016/10/18.
 */
public class Main {

    public static <T extends Fruit> void print(T t){
        System.out.println(t.getClass());
        System.out.println(Class.class);
        t.eat();
    }

    public static <T> void print2(Class<T> clazz){
        System.out.println(clazz.getClass());
    }

    public static <T> T createInstance(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }

    public static void main(String[] args) {
        print(new Apple());
        print(new Banana());
        print2(Apple.class);

        Box<Apple> box = new Box<Apple>();
        box.set(new Apple());
        Apple a1 = box.get();

        Box box2 = new Box();
        box2.set(new Apple());
        Apple a2 = (Apple) box2.get();
    }
}
