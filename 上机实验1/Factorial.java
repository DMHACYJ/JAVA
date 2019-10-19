package 上机实验1;
//9999以内最大阶乘和
public class Factorial {
	public static void main(String[] args) {
		int i =1;
		int sum = 1;
		while(sum <= 9999) {
			sum *= i;
			i++;
		}
		System.out.println("满足阶乘和小于9999的最大正整数：" +i);
	}
}
