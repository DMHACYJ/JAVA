package �������2;
//��̬�ڲ���
//�����ⲿ��Outer20
class Outer20 {
	static int m = 0;
	static class Inner {
		void show() {
			//��̬�ڲ������ⲿ�ྲ̬��Ա
			System.out.println("�ⲿ�ྲ̬���� m=" +m);
		}
	}
}

public class Example20 {
	public static void main(String[] args) {
		//��̬�ڲ������ֱ��ͨ���ⲿ�ഴ��
		Outer20.Inner inner = new Outer20.Inner();
		inner.show();
	}
}
