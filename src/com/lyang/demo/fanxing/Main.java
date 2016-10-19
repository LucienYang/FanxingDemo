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

        try {
            People people = (People) Class.forName("com.lyang.demo.fanxing.People").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            People people = createInstance(People.class);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
