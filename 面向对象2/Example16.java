package �������2;
//����ӿ�Animal16
interface Animal16 {
	void shout();
}
//����Cat16ʵ��Animal�ӿ�
class Cat16 implements Animal16 {
	//ʵ�ֽӿ�shout����
	public void shout() {
		System.out.println("��������");
	}
	//����Cat�����е�èץ����catchMouse()����
	public void catchMouse() {
		System.out.println("Сèץ���󡭡�");
	}
}

class Example16 {
	public static void main(String[] args) {
		Animal16 an1 = new Cat16();
		an1.shout();
		Cat16 an2 = new Cat16();
		an2.catchMouse();//Cat��ר������
		Cat16 cat = (Cat16)an1;//ǿ������ת��
		cat.shout();
		cat.catchMouse();
	}
}
