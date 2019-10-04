package 面向对象2;
//多态
//定义抽象类Animal15
abstract class Animal15 {
	abstract void shout();
}
//定义Cat继承Animal15类
class Cat extends Animal15 {
	//实现shout方法
	public void shout() {
		System.out.println("喵喵……");
	}
}
//定义Dog15类继承Animal15抽象类
class Dog15 extends Animal15 {
	//实现shout方法
	public void shout() {
		System.out.println("汪汪……");
	}
}
public class Example15 {
	public static void main(String[] args) {
		Animal15 an1 = new Cat();
		Animal15 an2 = new Dog15();
		an1.shout();
		an2.shout();
	}
}
