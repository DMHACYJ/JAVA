package java��̻���;
//���breakҪ�������ѭ������Ҫ�����ѭ�����б�ǣ�outer����Ȼ��ʹ��break����ָ�������ѭ��
public class example16 {
	public static void main(String[] args) {
		outer: for(int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				if(i > 3)
				{
					break outer;
				}
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println("");
		}
	}
}
