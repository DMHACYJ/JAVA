package �������2;
//abstract�ؼ���
abstract class Animal08 {
	//������󷽷�shout()
	public abstract void shout();
}

class Dog08 extends Animal08 {
	//ʵ�ֳ��󷽷�shout,��д����ʵ��
	public void shout() {
		System.out.println("��������");
	}
}

public class Example08 {
	public static void main(String[] args) {
		Dog08 dog = new Dog08();
		dog.shout();
	}
}
