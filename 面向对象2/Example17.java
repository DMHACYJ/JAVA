package 面向对象2;
//内部类
//定义外部类Outer
class Outer {
	int m;
	//定义外部类成员方法
	void test1() {
		System.out.println("外部类成员方法");
	}
	//定义成员内部类Inner
	class Inner {
		int n=1;
		//定义内部类方法，访问外部类成员变量和方法
		void show1() {
			System.out.println("外部类成员变量 m=" +m);
			test1();
		}
		void show2() {
			System.out.println("内部成员方法");
		}
	}
	//定义外部类方法，访问内部类成员变量和方法
	void test2() {
		Inner inner = new Inner();
		System.out.println("内部类成员变量 n=" +inner.n);
		inner.show1();
		
	}
}

public class Example17 {
	public static void main(String[] args) {
		Outer outer = new Outer();//创建外部类对象
		Outer.Inner inner = outer.new Inner();//创建内部类对象
		inner.show1();//测试在成员内部类中访问外部类成员变量和方法
		outer.test2();//测试在外部类中访问内部类成员变量和方法
	}
}
