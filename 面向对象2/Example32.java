package �������2;
//throws�׳��쳣
public class Example32 {
	//����ķ���ʵ�����������������ʹ��throws�ؼ��������׳��쳣
	public static int divide32(int x, int y) throws Exception {
		int result = x / y;
		return result;
	}
	public static void main(String[] args) {
		try {
			int result = divide32(4, 0);
			System.out.println(result);
		} catch(Exception e) {
			System.out.println("������쳣��ϢΪ��" +e.getMessage());
		}
	}
}
