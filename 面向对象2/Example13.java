package �������2;
//������Animal�ӿ�
interface Animal13 {
	int ID = 1;
	void breathe();
	//����һ��Ĭ�Ϸ���
	default void getType(String type) {
		System.out.println("�ö������ڣ�" +type);
	}
	//����һ����̬����
	static int getID() {
		return Animal13.ID;
	}
}
//Dog��ʵ��Animal13�ӿ�
class Dog13 implements Animal13 {
	//ʵ��breath()����
	public void breathe() {
		System.out.println("���ں���");
	}
}

public class Example13 {
	public static void main(String[] args) {
		System.out.println(Animal13.getID());//ͨ���ӿ��������෽��
		Dog13 dog = new Dog13();             //ͨ��Dog���ʵ������
		System.out.println(dog.ID);          //��ʵ�����л�ȡ�ӿ�ȫ�ֳ���
		dog.breathe();                       //����Dog�е�breathe()����
		dog.getType("Ȯ��");     //ͨ���ӿ�ʵ����Dog��ʵ��������҅�ýӿ�Ĭ�Ϸ���
	}
}
