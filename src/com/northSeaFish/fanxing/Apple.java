package com.northSeaFish.fanxing;
/**  
 * @author yanglu  
 *   
 */
public class Apple extends Fruit{

	public Apple() {
		super();
	}

	public Apple(String name, String color) {
		super(name, color);
		System.out.println("apple has been created");
	}



	@Override
	public void printInfo() {
		super.printInfo();
	}
	
}
