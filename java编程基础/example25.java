package java��̻���;
//��ά����
//ͳ�ƹ�˾����������С����ÿ��С��������۶�
public class example25 {
	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[] {11, 12};
		arr[1] = new int[] {21, 22, 23};
		arr[2] = new int[] {31, 32, 33, 34};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			int groupsum = 0;
			for(int j = 0; j < arr[i].length; j++) {
				groupsum += arr[i][j];
			}
			sum += groupsum;
			System.out.println("��"  + (i + 1) + "��С��������ܶ" + groupsum + " ��Ԫ��");
		}
		System.out.println("����С��������۶" + sum + " ��Ԫ��");
	}
}
