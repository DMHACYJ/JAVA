package �ϻ�ʵ��3;

class Animal {
	public Animal(String type) {
		this.type=type;
	}
	public String toString() {
		return "�ö�����"+":"+type;
	}
	public String sound() {
		return "meow~";
	}
	private String type;
}

public class Test20 {
	public static void main(String[] args) {
		Animal a = new Animal("è");
		System.out.println(a.toString());
		System.out.println(a.sound());
	}
}