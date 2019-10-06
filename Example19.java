package 面向对象2;
//局部内部类Outer19
class Outer19 {
	int m=0;
	void test1() {
		System.out.println("外部类成员方法");
	}
	void test2() {
		//定义局部类Inner19，在局部内部类中访问外部变量和方法
		class Inner19 {
			int n=1;
			void show() {
				System.out.println("外部类变量 m=" +m);
				test1();
			}
		}
		//在创建局部内部类的方法中，调用局部内部类变量和方法
		Inner19 inner = new Inner19();
		System.out.println("局部内部类变量 n=" +inner.n);
		inner.show();
	}
}
public class Example19 {
	public static void main(String[] args) {
		Outer19 outer = new Outer19();
		outer.test2();//通过外部类对象调用创建了局部内部类的方法
	}
}