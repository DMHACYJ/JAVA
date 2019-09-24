package 学生信息;

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
		s[0]=new Student(1,"慧","女","计本");
		s[1]=new Student(2,"华","男","计本");
		s[2]=new Student(3,"文","女","计本");
		s[3]=new Student(4,"鑫","男","网工");
		s[4]=new Student(5,"洁","女","物联网");
		s[5]=new Student(6,"士","男","网工");
		String prof="计本";
		String sex="男";
		System.out.println(prof+"专业的"+sex+"生人数："+Count(s,"计本","男"));
		System.gc();
	}
}