package �������1;
//��̬������ʹ��
class Person13 {
	public static void say() {//��̬����
		System.out.println("hello!");
	}
}

public class example13 {
	public static void main() {
		Person13.say();//�á�����.�������ķ�ʽ���þ�̬����
		//��̬��������Ҫͨ����������Ϳ���ֱ��ͨ����������
		//ʵ��������
		Person13 person = new Person13();
		//�á�ʵ��������.�������ķ�ʽ�������þ�̬����
		person.say();
	}
}
