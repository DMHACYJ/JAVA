package 上机实验2;

public class Student {
	private String ssno;
	private String scno;
	private String sname;
	private String ssex;
	private int sage;
	Student() {}
	Student(String ssno, String scno, String sname, String ssex, int sage) {
		this.ssno = ssno;
		this.scno = scno;
		this.sname = sname;
		this.ssex = ssex;
		this.sage = sage;
	}
	public void setSage(int age) {
		this.sage = age;
	}
	public String getSclass() { 
		return scno;
	}
	public String getSname() { 
		return sname;
	}
	public int getSage() { 
		return sage;
	}
	public String toString() {
		String s="";
		s += "学号：" + ssno +"；";
		s += "班号：" + scno +"；";
		s += "姓名：" + sname +"；";
		s += "性别：" + ssex +"；";
		s += "年龄：" + String.valueOf(sage) +"；"; 
		return s;
	}
}
