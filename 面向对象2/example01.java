package �������2;
//����̳и���
class Animal {
	String name = "��";
	void shout() {
		System.out.println("���﷢������");
	}
}
//����Dog��̳�Animal��
class Dog extends Animal {
	public void printName() {
		System.out.println("name=" +super.name);
	}
}
//���������
public class example01 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "ɳƤ��";
		dog.printName();
		dog.shout();
	}
}
