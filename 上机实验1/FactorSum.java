package �ϻ�ʵ��1;
//���1~1000���Ӻ͵��ڱ������
public class FactorSum {
	public static void main(String[] args) {
		System.out.println("1~1000���Ӻ͵��ڱ��������");
		for(int i = 1; i <= 1000; i++) {
			int sum = 1;
			for(int j = 2; j <= i/2; j++) {
				if(i % j == 0) sum += j;
			}
			if(sum == i) System.out.print(i+ " ");
		}
	}
}
