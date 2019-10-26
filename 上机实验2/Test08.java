package 上机实验2;

class Course {
	private String _Cnumber;
	private String _Cname;
	private double _Cuit;
	Course(String Cnumber, String Cname, double Cuit) {
		_Cnumber = Cnumber;
		_Cname = Cname;
		_Cuit = Cuit;
	}
	void printCourseInfo() {
		System.out.println("课程号：" +_Cnumber+ " " +
				"课程名：" +_Cname+ " " + "学分：" +_Cuit);
	}
}
public class Test08 {
	public static void main(String[] args) {
		Course c = new Course("01", "Java", 5);
		c.printCourseInfo();
	}
}
