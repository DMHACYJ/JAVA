package 上机实验3;

class Animal {
	public Animal(String type) {
		this.type=type;
	}
	public String toString() {
		return "该动物是"+":"+type;
	}
	public String sound() {
		return "meow~";
	}
	private String type;
}

public class Test20 {
	public static void main(String[] args) {
		Animal a = new Animal("猫");
		System.out.println(a.toString());
		System.out.println(a.sound());
	}
}