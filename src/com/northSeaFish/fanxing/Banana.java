package com.northSeaFish.fanxing;
/**  
 * @author yanglu  
 *   
 */
public class Banana extends Fruit{

	public Banana() {
		super();
	}

	public Banana(String name, String color) {
		super(name, color);
		System.out.println("banana has been created");
	}



	@Override
	public void printInfo() {
		super.printInfo();
	}
	
}
