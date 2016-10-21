package com.lyang.demo.fanxing;

/**
 * Created by yanglu on 2016/10/20.
 */
public class Box<T> {
    private T object;

    public void set(T object) { this.object = object; }
    public T get() { return object; }
}
