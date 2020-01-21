package 上机实验3;
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
		System.out.println("姓名："+getName()+" 性别："+getGendar()+" 年龄："
							+getAge()+" 学号："+id+" 班名："+cname+" 成绩："+course);
	}
}
public class Test01 {
	public static void main(String[] args) {
		Student std=new Student("厌离",'女',20,"1","1",100);
		std.display();
	}
}