package �������2;
//�Ը���ķ���������д
class Animal02 {
	void shout() {
		System.out.println("���﷢������");
	}
}

class Dog02 extends Animal02 {
	void shout() {
		System.out.println("����");
		super.shout();//super�ؼ��ֵ��ø���ĳ�Ա����/��Ա����
	}
}

public class example02 {
	public static void main(String[] args) {
		Dog02 dog = new Dog02();
		dog.shout();
	}
}
