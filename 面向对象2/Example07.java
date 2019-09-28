package 面向对象2;
//toString重载

class Animal07 {
	//重写Object类的toString函数
	public String toString() {
		return "这是一只动物";
	}
}

public class Example07 {
	public static void main(String[] args) {
		Animal07 animal = new Animal07();
		System.out.println(animal.toString());
	}
}
