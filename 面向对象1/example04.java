package �������1;
//ʵ�ַ�װ
class Person1 {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age <= 0) {
			System.out.println("����������䲻��ȷ��");
		} else {
			this.age = age;
		}
	}
	public void speak() {
		System.out.println("�ҽ�" +name+ "������" +age+ "����");
	}
}

public class example04{
	public static void main (String[] args) {
		Person1 p = new Person1();
		p.setName("����");
		p.setAge(-18);
		p.speak();
	}
}
