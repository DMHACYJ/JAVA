package �������1;
//���췽������
class Person10 {
	String name;
	int age;
	public Person10(int a) {
		age = a;
	}
	public Person10(String n, int a) {
		name = n;
		age = a;
	}
	//����speak����
	public void speak() {
		System.out.println("�ҽ���" +age+ "����");
	}
	public void say() {
		System.out.println("�ҽ�" +name+ "������" +age+ "����");
	}
}
public class example10 {
	public static void main(String[] args) {
		Person10 p1 = new Person10(18);
		Person10 p2 = new Person10("����", 32);
		p1.speak();
		p2.say();
	}
}
