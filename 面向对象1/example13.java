package 面向对象1;
//静态方法的使用
class Person13 {
	public static void say() {//静态方法
		System.out.println("hello!");
	}
}

public class example13 {
	public static void main() {
		Person13.say();//用“类名.方法”的方式调用静态方法
		//静态方法不需要通过创建对象就可以直接通过类名调用
		//实例化对象
		Person13 person = new Person13();
		//用“实例对象名.方法”的方式用来调用静态方法
		person.say();
	}
}
