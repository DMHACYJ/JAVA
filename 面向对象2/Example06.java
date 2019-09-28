package 面向对象2;
//toString
class Animal06 {
	void shout() {
		System.out.println("动物叫！");
	}
}

public class Example06 {
	public static void main(String[] args) {
		Animal06 animal=new Animal06();//创建Animal类对象
		System.out.println(animal.toString());//调用toString方法并打印
	}
}
