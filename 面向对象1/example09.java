package �������1;

class Person9 {
	int age;
	//�����вι��췽��
	public Person9(int a) {
		age = a;
	}
	//����speak����
	public void speak() {
		System.out.println("�ҽ���" +age+ "����");
	}
}
public class example09 {
	public static void main(String[] args) {
		Person9 p = new Person9(18);
		p.speak();
	}
}
