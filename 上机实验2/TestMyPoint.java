package 上机实验2;

public class TestMyPoint {
	public static void main(String[] args) {
		Mypoint p1 = new Mypoint(2, 3);
		Mypoint p2 = new Mypoint(10, 30.5);
		System.out.println(p1.distance(p2));
	}
}
