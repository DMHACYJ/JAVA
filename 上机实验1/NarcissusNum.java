package �ϻ�ʵ��1;
//��λˮ�ɻ���
public class NarcissusNum {
	public static void main(String[] args) {
		int i = 100;
		System.out.println("ˮ�ɻ�����");
		for(; i < 1000; i++) {
			int sum = 0;
			int num = i;
			for(int k = 2; k >= 0; k--) {
				sum += Math.pow(num / (int)Math.pow(10, k),3);
				num = num % (int)Math.pow(10, k);
			}
			if(sum == i) System.out.print(i+ " ");
		}
	}
}
