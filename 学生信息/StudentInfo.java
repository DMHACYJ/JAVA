package ѧ����Ϣ;

class Student {
	public int sno;
	public String sname;
	public String ssex;
	public String profession;
	public Student() {}
	public Student(int sno,String sname,String ssex,String profession) {
		this.sno=sno;
		this.sname=sname;
		this.ssex=ssex;
		this.profession=profession;
	}
	public String getSsex() {
		return ssex;
	}
}

public class StudentInfo {
	public static int Count(Student[] s,String prof,String sex) {
		int b=0;
		for(int i=0;i<s.length;i++) {
			if(s[i].getSsex().equals(sex)&&s[i].profession.equals(prof)) b++;
		}
		return b;
	}
	public static void main(String[] args) {
		Student[] s=new Student[6];
		s[0]=new Student(1,"��","Ů","�Ʊ�");
		s[1]=new Student(2,"��","��","�Ʊ�");
		s[2]=new Student(3,"��","Ů","�Ʊ�");
		s[3]=new Student(4,"��","��","����");
		s[4]=new Student(5,"��","Ů","������");
		s[5]=new Student(6,"ʿ","��","����");
		String prof="�Ʊ�";
		String sex="��";
		System.out.println(prof+"רҵ��"+sex+"��������"+Count(s,"�Ʊ�","��"));
		System.gc();
	}
}