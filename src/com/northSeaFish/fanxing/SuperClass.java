package com.northSeaFish.fanxing;

import java.lang.reflect.ParameterizedType;

//import java.lang.reflect.Type;

public abstract class SuperClass<T> {

	private Class<T> clazz;

	@SuppressWarnings("unchecked")
	public SuperClass() {
		clazz = (Class<T>) ((ParameterizedType) super.getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public Class<T> getClazz() {
		return clazz;
	}

	public void setClazz(Class<T> clazz) {
		this.clazz = clazz;
	}

	/**
	 * 普通的非泛型类Class
	 * 泛型化的类Class<T>
	 * JDK中，普通的Class.newInstance()方法的定义返回Object，要将该返回类型强制转换为另一种类型;
	 * 但是使用泛型的Class<T>，Class.newInstance()方法具有一个特定的返回类型;
	 * @param args
	 */
	public static void main(String[] args) {
		SuperClass<Person> superClass = new SubClass();
		//1.得到泛型类T实际的完整类名
		System.out.println(superClass.getClazz());
		//2.得到泛型类T的对象
		try {
			System.out.println(superClass.getClazz().newInstance());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		//3.调用泛型类T的方法
		try {
			superClass.getClazz().newInstance().function();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}

class SubClass extends SuperClass<Person> {

	public SubClass() {
		super();
	}

}

class Person {
	public Person() {
		super();
	}

	public void function() {
		System.out.println("function in Person.class...");
	}
}