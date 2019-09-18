package 面向对象1;
//静态代码块
class Person15 {
	static {
		System.out.println("执行了Person类中的静态代码块");
	}
}
public class example15 {
	static {//加载本类的同时会执行这个静态代码块
		System.out.println("执行了测试类中的静态代码块");
	}
	public static void main(String[] args) {
		Person15 p1 = new Person15();
		Person15 p2 = new Person15();//静态代码块在第一次使用时才会被加载，
		//静态代码块只会被加载一次
	}
}
