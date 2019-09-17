package 面向对象1;
//static静态变量,只能修饰成员变量。
class Student {
	static String schoolName;//静态变量
}
public class example12 {
	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student.schoolName = "清华大学";
		System.out.println("我是" +stu1.schoolName+ "的学生");//通过实例对象调用
		System.out.println("我是" +stu2.schoolName+ "的学生");
	}
}
