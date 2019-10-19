package 上机实验1;
//输出1~1000因子和等于本身的数
public class FactorSum {
	public static void main(String[] args) {
		System.out.println("1~1000因子和等于本身的数：");
		for(int i = 1; i <= 1000; i++) {
			int sum = 1;
			for(int j = 2; j <= i/2; j++) {
				if(i % j == 0) sum += j;
			}
			if(sum == i) System.out.print(i+ " ");
		}
	}
}
