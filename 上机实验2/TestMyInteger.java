package �ϻ�ʵ��2;

public class TestMyInteger {
	public static void main(String[] args) {
		MyInteger in = new MyInteger(100);
		int x = 100;
		String s = "omg";
		System.out.print(in.getInt());
		if(in.isEven()) {
			System.out.print("��ż��������������");
		} else System.out.print("����ż������������");
		if(in.isPrime()) {
			System.out.print("������,");
		} else System.out.print("��������,");
		if(in.equals(x)) {
			System.out.print("��" +x+ "��ȣ�");
		} else System.out.print("��" +x+ "����ȣ�");
		System.out.print("�ַ���" +s+ "ת��int����Ϊ��" +in.parseInt(s));
	}
}
