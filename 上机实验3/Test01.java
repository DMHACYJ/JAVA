package �ϻ�ʵ��3;
class Person {
	private String name;
	private char gendar;
	private int age;
	public Person(String name,char gendar,int age) {
		this.name=name;
		this.gendar=gendar;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public char getGendar() {
		return gendar;
	}
	public int getAge() {
		return age;
	}
}

class Student extends Person{
	private String id;
	private String cname;
	private double course;
	public Student(String name,char gendar,int age,String id,String cname,double course) {
		super(name,gendar,age);
		this.id=id;
		this.cname=cname;
		this.course=course;
	}
	public void display() {
		System.out.println("������"+getName()+" �Ա�"+getGendar()+" ���䣺"
							+getAge()+" ѧ�ţ�"+id+" ������"+cname+" �ɼ���"+course);
	}
}
public class Test01 {
	public static void main(String[] args) {
		Student std=new Student("����",'Ů',20,"1","1",100);
		std.display();
	}
}