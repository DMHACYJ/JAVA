package �������1;
//�����޲εĹ��췽����this�ؼ���

class Person11 {
	public Person11() {
		System.out.println("�������޲εĹ��췽��������");
	}
	public Person11(int age) {
		this();//this����ֻ���ڹ��췽���ĵ�һ�г���
		//ֻ���ڹ��췽���е��������Ĺ��췽���������ڳ�Ա������ʹ��
		//thisֻ�ܳ���һ�Σ��������������췽��֮���໥����
		System.out.println("�вεĹ��췽���������ˡ���");
	}
}

public class example11 {
	public static void main() {
		Person11 p11 = new Person11(18);
	}
}
