package java��̻���;

public class example03 {
	public static void main (String[] args) {
		byte b =3;
		short s =4;
		char c =5;
		//��byte/short/char������ֵ��ӣ��縳ֵ��byte����
		byte b2 =(byte)(b+s+c);
		//���ʽ�����Զ���������byte/short/char���͵ı�����Ԥ���ڼ���Զ�����Ϊint
		System.out.println("b2=" +b2);
	}
}
