package 面向对象2;

class Animal05 {
	public Animal05() {
		System.out.println("我是一只动物");
	}
	public Animal05(String name) {
		System.out.println("我是一只" +name);
	}
}

class Dog05 extends Animal05 {
	public Dog05() {
		
	}
}

public class example05 {
	public static void main(String[] args) {
		Dog05 dog = new Dog05();
	}
}
