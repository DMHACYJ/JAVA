package �������2;
//Lambda���ʽ
//���嶯����ӿ�
interface Animal22 {
	void shout();
}
public class Example22 {
	public static void main(String[] args) {
		String name = "С��";
		//�����ڲ�����Ϊ�������ݸ�animalShout()����
		animalShout(new Animal22() {
			public void shout() {
				System.out.println("�����ڲ��������"+name+"��������");
			}
		});
		//ʹ��Lamdba���ʽ��Ϊ�������ݸ�animalShout()����
		animalShout(()->System.out.println("Lamdba���ʽ�����"+name+"��������"));
	}
	public static void animalShout(Animal22 an) {
		an.shout();
	}
}
