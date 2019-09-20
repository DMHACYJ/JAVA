package 面向对象2;
//对父类的方法进行重写
class Animal02 {
	void shout() {
		System.out.println("动物发出叫声");
	}
}

class Dog02 extends Animal02 {
	void shout() {
		System.out.println("汪汪");
		super.shout();//super关键字调用父类的成员方法/成员变量
	}
}

public class example02 {
	public static void main(String[] args) {
		Dog02 dog = new Dog02();
		dog.shout();
	}
}
