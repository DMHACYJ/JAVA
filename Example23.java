package �������2;
//�����޲Ρ�����ֵ�ĺ���ʽ�ӿ�
@FunctionalInterface          //ȷ���ӿ�������ֻ��һ�����󷽷�
interface Animal23 {
	void shout();
}
//�����вΡ��з���ֵ�ĺ���ʽ�ӿ�
interface Calculate {
	int sum(int a, int b);
}
public class Example23 {
	public static void main(String[] args) {
		animalShout(() ->System.out.println("�޲Ρ��޷���ֵ�ĺ���ʽ�ӿڵ���"));
		showSum(10, 20, (x,y) -> x + y);
	}
	//����һ������еķ�����������ӿڶ���Animal����
	private static void animalShout(Animal23 animal) {
		animal.shout();
	}
	//����һ����͵ķ���������������int�����Լ��ӿ�Calculate���͵Ĳ���
	private static void showSum(int x, int y, Calculate calculate) {
		System.out.println(x + "+" +y+ "�ĺ�Ϊ��" +calculate.sum(x, y));
	}
}
