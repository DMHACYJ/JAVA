package �ϻ�ʵ��1;
//9999�������׳˺�
public class Factorial {
	public static void main(String[] args) {
		int i =1;
		int sum = 1;
		while(sum <= 9999) {
			sum *= i;
			i++;
		}
		System.out.println("����׳˺�С��9999�������������" +i);
	}
}
