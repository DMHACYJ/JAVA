package 面向对象1;
//构造方法重载
class Person10 {
	String name;
	int age;
	public Person10(int a) {
		age = a;
	}
	public Person10(String n, int a) {
		name = n;
		age = a;
	}
	//定义speak方法
	public void speak() {
		System.out.println("我今年" +age+ "岁了");
	}
	public void say() {
		System.out.println("我叫" +name+ "，今年" +age+ "岁了");
	}
}
public class example10 {
	public static void main(String[] args) {
		Person10 p1 = new Person10(18);
		Person10 p2 = new Person10("张三", 32);
		p1.speak();
		p2.say();
	}
}
