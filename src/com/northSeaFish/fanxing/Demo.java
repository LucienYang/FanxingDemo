package com.northSeaFish.fanxing;
/**  
 * @author yanglu  
 *   
 */
public class Demo<T extends Fruit> {
	private T t;
	
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Demo(T t) {
		super();
		this.t = t;
	}

	public void print(){
		t.printInfo();
	}

}
