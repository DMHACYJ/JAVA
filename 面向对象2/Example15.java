package �������2;
//��̬
//���������Animal15
abstract class Animal15 {
	abstract void shout();
}
//����Cat�̳�Animal15��
class Cat extends Animal15 {
	//ʵ��shout����
	public void shout() {
		System.out.println("��������");
	}
}
//����Dog15��̳�Animal15������
class Dog15 extends Animal15 {
	//ʵ��shout����
	public void shout() {
		System.out.println("��������");
	}
}
public class Example15 {
	public static void main(String[] args) {
		Animal15 an1 = new Cat();
		Animal15 an2 = new Dog15();
		an1.shout();
		an2.shout();
	}
}
