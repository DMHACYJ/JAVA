package �ϻ�ʵ��2;

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
		s += "ѧ�ţ�" + ssno +"��";
		s += "��ţ�" + scno +"��";
		s += "������" + sname +"��";
		s += "�Ա�" + ssex +"��";
		s += "���䣺" + String.valueOf(sage) +"��"; 
		return s;
	}
}
