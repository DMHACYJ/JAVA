package 面向对象1;

class Person9 {
	int age;
	//定义有参构造方法
	public Person9(int a) {
		age = a;
	}
	//定义speak方法
	public void speak() {
		System.out.println("我今年" +age+ "岁了");
	}
}
public class example09 {
	public static void main(String[] args) {
		Person9 p = new Person9(18);
		p.speak();
	}
}
