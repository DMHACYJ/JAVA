package �ϻ�ʵ��3;
class Person12{
	String name;
	String address;
	String phone;
	String email;
	public Person12(String name,String address,String phone,String email) {
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.email=email;
	}
	public String toString() {
		return "class Person"+" ������"+name+ " סַ��" +address+ " �绰��" +phone+ " ���䣺" +email;
	}
}
class Student12 extends Person12{
	private String stage;
	public Student12(String name,String address,String phone,String email,String stage) {
		super(name,address,phone,email);
		this.stage=stage;
	}
	public String toString() {
		return "class Student"+" ����:"+name+ " סַ��" +address+ " �绰��" +phone+ " ���䣺" +email+ " �꼶��" +stage;
	}
}
class Employee extends Person12{
	String office;
	double wage;
	String dateOfHire;
	public Employee(String name,String address,String phone,String email,String office,double wage,String dateOfHire) {
		super(name,address,phone,email);
		this.office=office;
		this.wage=wage;
		this.dateOfHire=dateOfHire;
	}
	public String toString() {
		return "classEmployee"+" ����:"+name+ " סַ��" +address+ " �绰��" +phone+ " ���䣺" +email
				+ " �칫�ң�" +office+ " ���ʣ�" +wage+ " ��Ƹ���ڣ�" +dateOfHire;
	}
}
class Faculty extends Employee{
	private String time;
	private String level;
	public Faculty(String name,String address,String phone,String email,String office,double wage,
					String dateOfHire,String time,String level) {
		super(name,address,phone,email,office,wage,dateOfHire);
		this.time=time;
		this.level=level;
	}
	public String toString() {
		return "classFaculty"+" ����:"+name+ " סַ��" +address+ " �绰��" +phone+ " ���䣺" +email
				+ " �칫�ң�" +office+ " ���ʣ�" +wage+ " ��Ƹ���ڣ�" +dateOfHire+ " �칫ʱ�䣺" +time+ " ����" +level;
	}
}

class Staff extends Employee{
	private String workName;
	public Staff(String name,String address,String phone,String email,String office,double wage,String dateOfHire,String workName) {
		super(name,address,phone,email,office,wage,dateOfHire);
		this.workName=workName;
	}
	public String toString() {
		return "classStaff"+" ����:"+name+ " סַ��" +address+ " �绰��" +phone+ " ���䣺" +email
				+ " �칫�ң�" +office+ " ���ʣ�" +wage+ " ��Ƹ���ڣ�" +dateOfHire+ " ְ��ƺţ�" +workName;
	}
}
class MyDate{
	private int year;
	private int month;
	private int day;
	public MyDate(int year,int month,int day) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
}
public class Test12 {
	public static void main(String[] args) {
		Person12 person=new Person12("����","�й�","1","137@");
		System.out.println(person.toString());
		Student12 student=new Student12("����","�й�","1","137@","һ�꼶");
		System.out.println(student.toString());
		Employee employee=new Employee("����","�й�","1","137@","101",10000,"2011.11.23");
		System.out.println(employee.toString());
		Faculty faculty=new Faculty("����","�й�","1","137@","101",10000,"2011.11.23","9.00-18.00","�ؼ�");
		System.out.println(faculty.toString());
		Staff staff=new Staff("����", "�й�", "1", "137@", "101", 10000, "2011.11.23", "����");
		System.out.println(staff.toString());
	}

}
