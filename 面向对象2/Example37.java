package �������2;
class Person37 {
	//���涨���finallize()����������������ǰ������
	public void finalize() {
		System.out.println("���󽫱���Ϊ��������...");
	}
}
public class Example37 {
	//��ʾһ����֪ͨǿ���������յķ���
	public static void recyclegWaste1() {
		Person37 p1 = new Person37();
		p1 = null;
		int i = 1;
		while(i < 10) {
			System.out.println("����1ѭ����...");
			i++;
		}
	}
	//��ʾһ��֪ͨǿ���������յķ���
	public static void recyclegWaste2() {
		Person37 p2 = new Person37();
		p2 = null;
		//֪ͨ��������������ǿ����������
		System.gc();
		int i = 1;
		while(i < 10) {
			System.out.println("����2ѭ����......");
			i++;
		}
	}
	public static void main(String[] args) {
		//�ֱ��������ģ����ʾ�������յķ���
		recyclegWaste1();
		System.out.println("=================");
		recyclegWaste2();
	}
}
