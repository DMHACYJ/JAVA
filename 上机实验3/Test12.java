package 上机实验3;
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
		return "class Person"+" 姓名："+name+ " 住址：" +address+ " 电话：" +phone+ " 邮箱：" +email;
	}
}
class Student12 extends Person12{
	private String stage;
	public Student12(String name,String address,String phone,String email,String stage) {
		super(name,address,phone,email);
		this.stage=stage;
	}
	public String toString() {
		return "class Student"+" 姓名:"+name+ " 住址：" +address+ " 电话：" +phone+ " 邮箱：" +email+ " 年级：" +stage;
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
		return "classEmployee"+" 姓名:"+name+ " 住址：" +address+ " 电话：" +phone+ " 邮箱：" +email
				+ " 办公室：" +office+ " 工资：" +wage+ " 受聘日期：" +dateOfHire;
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
		return "classFaculty"+" 姓名:"+name+ " 住址：" +address+ " 电话：" +phone+ " 邮箱：" +email
				+ " 办公室：" +office+ " 工资：" +wage+ " 受聘日期：" +dateOfHire+ " 办公时间：" +time+ " 级别：" +level;
	}
}

class Staff extends Employee{
	private String workName;
	public Staff(String name,String address,String phone,String email,String office,double wage,String dateOfHire,String workName) {
		super(name,address,phone,email,office,wage,dateOfHire);
		this.workName=workName;
	}
	public String toString() {
		return "classStaff"+" 姓名:"+name+ " 住址：" +address+ " 电话：" +phone+ " 邮箱：" +email
				+ " 办公室：" +office+ " 工资：" +wage+ " 受聘日期：" +dateOfHire+ " 职务称号：" +workName;
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
		Person12 person=new Person12("厌离","中国","1","137@");
		System.out.println(person.toString());
		Student12 student=new Student12("厌离","中国","1","137@","一年级");
		System.out.println(student.toString());
		Employee employee=new Employee("厌离","中国","1","137@","101",10000,"2011.11.23");
		System.out.println(employee.toString());
		Faculty faculty=new Faculty("厌离","中国","1","137@","101",10000,"2011.11.23","9.00-18.00","特级");
		System.out.println(faculty.toString());
		Staff staff=new Staff("厌离", "中国", "1", "137@", "101", 10000, "2011.11.23", "教授");
		System.out.println(staff.toString());
	}

}
