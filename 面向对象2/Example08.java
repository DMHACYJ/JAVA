package 面向对象2;
//abstract关键字
abstract class Animal08 {
	//定义抽象方法shout()
	public abstract void shout();
}

class Dog08 extends Animal08 {
	//实现抽象方法shout,编写方法实体
	public void shout() {
		System.out.println("汪汪……");
	}
}

public class Example08 {
	public static void main(String[] args) {
		Dog08 dog = new Dog08();
		dog.shout();
	}
}
