package �ϻ�ʵ��2;

public class testS {
	public static void main(String[] args) {
		Student s = new Student("01","�ƿ�","dmh","female",20);
		s.setSage(21);
		System.out.println(s.getSage());
		Student StudentB = new Student("123","1��","����","Ů",19);
		System.out.println(StudentB.toString());
	}
}