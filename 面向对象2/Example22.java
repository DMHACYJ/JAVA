package 面向对象2;
//Lambda表达式
//定义动物类接口
interface Animal22 {
	void shout();
}
public class Example22 {
	public static void main(String[] args) {
		String name = "小花";
		//匿名内部类作为参数传递给animalShout()方法
		animalShout(new Animal22() {
			public void shout() {
				System.out.println("匿名内部类输出："+name+"喵喵……");
			}
		});
		//使用Lamdba表达式作为参数传递给animalShout()方法
		animalShout(()->System.out.println("Lamdba表达式输出："+name+"喵喵……"));
	}
	public static void animalShout(Animal22 an) {
		an.shout();
	}
}
