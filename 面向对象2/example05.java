package �������2;

class Animal05 {
	public Animal05() {
		System.out.println("����һֻ����");
	}
	public Animal05(String name) {
		System.out.println("����һֻ" +name);
	}
}

class Dog05 extends Animal05 {
	public Dog05() {
		
	}
}

public class example05 {
	public static void main(String[] args) {
		Dog05 dog = new Dog05();
	}
}
