package �ϻ�ʵ��2;

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
		System.out.println("�γ̺ţ�" +_Cnumber+ " " +
				"�γ�����" +_Cname+ " " + "ѧ�֣�" +_Cuit);
	}
}
public class Test08 {
	public static void main(String[] args) {
		Course c = new Course("01", "Java", 5);
		c.printCourseInfo();
	}
}
