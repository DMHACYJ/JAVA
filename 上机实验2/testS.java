package 上机实验2;

public class testS {
	public static void main(String[] args) {
		Student s = new Student("01","计科","dmh","female",20);
		s.setSage(21);
		System.out.println(s.getSage());
		Student StudentB = new Student("123","1班","李莉","女",19);
		System.out.println(StudentB.toString());
	}
}