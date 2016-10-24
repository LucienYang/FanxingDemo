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

    public static <T> T createInstance(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }

    public static <T extends Fruit> T createInstance2(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }


    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        //测试泛型继承自Fruit
        print(new Apple());
        print(new Banana());

        //测试通过泛型创建类的实例，不用强制转换
        Fruit fruit= createInstance(Fruit.class);
        People people= createInstance(People.class);

        //测试指定上限通配符
        //编译不通过 , 因为People类没有继承自Fruit
        //People people2= createInstance2(People.class);
        Apple apple3= createInstance2(Apple.class);


        /*使用了泛型，再也不用强转对象了*/
        Box<Apple> box = new Box<Apple>();
        box.set(new Apple());
        Apple apple = box.get();
        /*没有使用泛型，仍需强转成Apple类*/
        Box box2 = new Box();
        box2.set(new Apple());
        Apple apple2 = (Apple) box2.get();
    }
}
