package �������2;
//����һ������ʽ�ӿ�
@FunctionalInterface
interface PersonBuilder {
	Person26 buildPerson(String name);
}
//����һ��Person�࣬������вι��췽��
class Person26 {
	private String name;
	public Person26(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
public class Example26 {
	public static void printName(String name, PersonBuilder builder) {
		System.out.println(builder.buildPerson(name).getName());
	}
	public static void main(String[] args) {
		//ʹ��Lambda���ʽ��ʽ
		printName("����ӱ", name->new Person26(name));
		//ʹ�ù��������õķ�ʽ
		printName("����ӱ", Person26::new);//���������÷���
	}
}
