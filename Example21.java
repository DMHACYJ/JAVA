package �������2;
//�����ڲ���
//���嶯����ӿ�
interface Animal21 {
	void shout();
}

public class Example21 {
	public static void main(String[] args) {
		String name = "С��";
		//���������ڲ�����Ϊ�������ݸ�animalShout()����
		animalShout(new Animal21() {
			public void shout() {
				//JDK8��ʼ���ֲ��ڲ��ࡢ�����ڲ�����Է��ʷ�final�ľֲ�����
				System.out.println(name+ "��������");
			}
		});
	}
	//���徲̬����animalShout()�����ܽӿ����Ͳ���
	public static void animalShout(Animal21 an) {
		an.shout();
	}
}
