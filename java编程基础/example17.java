package java��̻���;
//continue :��������ѭ����������һ��ѭ��
public class example17 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {//i��һ��ż��ʱ�����ۼ�
				continue;//��������ѭ����������һ��ѭ��
			}
			sum += i;//�õ�1��100֮�����е�������
		}
		System.out.println("sum=" + sum);
	}
}
