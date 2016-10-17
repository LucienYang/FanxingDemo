package com.northSeaFish.fanxing;
/**  
 * @author yanglu  
 *   
 */
public class Test {
	private static void printFruit(Demo<?> demo){
		demo.print();
	}
	public static void main(String[] args) {
		Fruit apple = new Apple("apple","red");
		Demo<Fruit> demo1 = new Demo<Fruit>(apple);
		printFruit(demo1);
		
		Fruit banana = new Banana("banana","yellow");
		Demo<Fruit> demo2 = new Demo<Fruit>(banana);
		printFruit(demo2);
	}

}
