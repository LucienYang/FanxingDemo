package com.lyang.demo.fanxing;

/**
 * 泛型上限通配符
 * Created by yanglu on 2016/10/23.
 */
public class TestUpperBounded {
    public static void main(String[] args) {
        People<Apple> p1 = new People<>();
        p1.eatFruit(new Apple());

        People<Banana> p2 = new People<>();
        p2.eatFruit(new Banana());

        //编译错误，因为Orange没有继承自Fruit
        //People<Orange> p3 = new People<>();


    }
}
