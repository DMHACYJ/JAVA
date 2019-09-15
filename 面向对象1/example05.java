package 面向对象1;
//方法的重载
public class example05 {
	public static int add01(int x, int y) {//两个整数相加
		return x + y;
	}
	public static int add02(int x, int y, int z) {//三个正数相加
		return x + y + z;
	}
	public static double add03(double x, double y) {//两个小数相加
		return x + y;
	}
	public static void main(String[] args) {
		int sum1 = add01(1, 2);
		int sum2 = add02(3, 4, 7);
		double sum3 = add03(0.2, 5.3);
		System.out.println("sum1=" +sum1);
		System.out.println("sum2=" +sum2);
		System.out.println("sum3=" +sum3);
	}
}
