package java编程基础;

public class example09 {
	public static void main(String[] args) {
		int grade = 75;
		if(grade > 80) {
			System.out.println("该成绩的等级为优");
		} else if(grade > 70) {
			System.out.println("该成绩的等级为良");
		} else if(grade > 60) {
			System.out.println("该成绩的等级为中");
		} else {
			System.out.println("该成绩的等级为差");
		}
	}
}
