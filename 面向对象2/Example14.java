package �������2;//�ӿ���ӿڼ̳�
//����Animal14�ӿ�
interface Animal14 {
	int ID = 1;
	void breathe();
	default void getType(String type) {
		System.out.println("�ö������ڣ�" +type);
	}
	//����һ����̬����
	static int getID() {
		return Animal14.ID;
	}
}
//����LandAnimal�ӿڣ����̳�Animal14�ӿ�
interface LanAnimal extends Animal14 {
	void run();
}
//Dogʵ��LandAnimal�ӿ�
class Dog14 implements LanAnimal { 
	//ʵ��breathe����
	public void breathe() {
		System.out.println("���ں���");
	}
	//ʵ��run����
	public void run() {
		System.out.println("����½������");
	}
}
public class Example14 {
	public static void main(String[] args) {
		System.out.println(Animal14.getID());//ͨ���ӿ��������෽��
		Dog14 dog = new Dog14();
		System.out.println(dog.ID);
		dog.breathe();
		dog.getType("Ȯ��");
		dog.run();
	}
}
