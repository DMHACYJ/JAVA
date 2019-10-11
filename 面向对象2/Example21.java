package 面向对象2;
//匿名内部类
//定义动物类接口
interface Animal21 {
	void shout();
}

public class Example21 {
	public static void main(String[] args) {
		String name = "小花";
		//定义匿名内部类作为参数传递给animalShout()方法
		animalShout(new Animal21() {
			public void shout() {
				//JDK8开始，局部内部类、匿名内部类可以访问非final的局部变量
				System.out.println(name+ "喵喵……");
			}
		});
	}
	//定义静态方法animalShout()，接受接口类型参数
	public static void animalShout(Animal21 an) {
		an.shout();
	}
}
