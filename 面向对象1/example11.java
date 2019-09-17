package 面向对象1;
//调用无参的构造方法，this关键字

class Person11 {
	public Person11() {
		System.out.println("调用了无参的构造方法。。。");
	}
	public Person11(int age) {
		this();//this调用只能在构造方法的第一行出现
		//只能在构造方法中调用其他的构造方法，不能在成员方法中使用
		//this只能出现一次，不能在两个构造方法之间相互调用
		System.out.println("有参的构造方法被调用了。。");
	}
}

public class example11 {
	public static void main() {
		Person11 p11 = new Person11(18);
	}
}
