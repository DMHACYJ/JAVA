package �������1;
//�����ĵݹ�
public class example07 {
	//ʹ�õݹ�ʵ����n-1�ĺ�
	public static int getSum(int n) {
		if(n == 1) {
			return 1;//�ݹ��������
		}
		int temp = getSum(n - 1);
		return temp + n;
	}
	public static void main(String[] args) {
		int sum = getSum(4);
		System.out.println("sum=" +sum);
	}
}
