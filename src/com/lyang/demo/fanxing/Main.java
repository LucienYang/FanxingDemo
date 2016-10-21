package com.lyang.demo.fanxing;

import java.util.ArrayList;
import java.util.Arrays;
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

    public static <T> T createInstance(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }

    public static <T extends Fruit> T createInstance2(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }


    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        print(new Apple());
        print(new Banana());
        print2(Apple.class);

        Fruit fruit= createInstance(Fruit.class);
        People people= createInstance(People.class);
        /*
        * this can not pass compile , because Class People is not extends Fruit
        * */
        //People people2= createInstance2(People.class);
        Apple apple3= createInstance2(Apple.class);

        /*use Generics , you will no longer to cast to class Apple*/
        Box<Apple> box = new Box<Apple>();
        box.set(new Apple());
        Apple apple = box.get();
        /*not use Generics , you need cast to class Apple*/
        Box box2 = new Box();
        box2.set(new Apple());
        Apple apple2 = (Apple) box2.get();


        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String>  ls = Arrays.asList("one", "two", "three");
        /*
        * this can not pass compile , because Integer and String is not subtypes of Object
        * */
        //printList1(li);
        //printList1(ls);

        printList2(li);
        printList2(ls);
    }
}
