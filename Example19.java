package �������2;
//�ֲ��ڲ���Outer19
class Outer19 {
	int m=0;
	void test1() {
		System.out.println("�ⲿ���Ա����");
	}
	void test2() {
		//����ֲ���Inner19���ھֲ��ڲ����з����ⲿ�����ͷ���
		class Inner19 {
			int n=1;
			void show() {
				System.out.println("�ⲿ����� m=" +m);
				test1();
			}
		}
		//�ڴ����ֲ��ڲ���ķ����У����þֲ��ڲ�������ͷ���
		Inner19 inner = new Inner19();
		System.out.println("�ֲ��ڲ������ n=" +inner.n);
		inner.show();
	}
}
public class Example19 {
	public static void main(String[] args) {
		Outer19 outer = new Outer19();
		outer.test2();//ͨ���ⲿ�������ô����˾ֲ��ڲ���ķ���
	}
}