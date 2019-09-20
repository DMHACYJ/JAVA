package 面向对象2;
//子类继承父类
class Animal {
	String name = "狗";
	void shout() {
		System.out.println("动物发出叫声");
	}
}
//定义Dog类继承Animal类
class Dog extends Animal {
	public void printName() {
		System.out.println("name=" +super.name);
	}
}
//定义测试类
public class example01 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "沙皮狗";
		dog.printName();
		dog.shout();
	}
}
