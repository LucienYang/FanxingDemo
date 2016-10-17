package com.northSeaFish.fanxing;
/**  
 * @author yanglu  
 * 水果类  
 */
public class Fruit {
	//水果名称
	private String name;
	//水果颜色
	private String color;
	
	
	
	public Fruit() {
	}


	public Fruit(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}


	public void printInfo(){
		System.out.println(this.name+"颜色是"+this.color);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
