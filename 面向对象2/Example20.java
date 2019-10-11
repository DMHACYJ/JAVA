package 面向对象2;
//静态内部类
//定义外部类Outer20
class Outer20 {
	static int m = 0;
	static class Inner {
		void show() {
			//静态内部访问外部类静态成员
			System.out.println("外部类静态变量 m=" +m);
		}
	}
}

public class Example20 {
	public static void main(String[] args) {
		//静态内部类可以直接通过外部类创建
		Outer20.Inner inner = new Outer20.Inner();
		inner.show();
	}
}
