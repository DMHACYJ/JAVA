package �������2;
public class Example36 {
	//����ķ���ʵ���������������
	public static int divide36(int x, int y) throws Exception {
		if(y == 0) {
			//ʹ��throw�ؼ��������쳣����
			throw new Exception("������0");
		}
		int result = x / y;
		return result;
	}
	public static void main(String[] args) {
		try {
			int result = divide36(4, 0);
			System.out.println(result);
		} catch(Exception e) {
			System.out.println("������쳣��ϢΪ��" +e.getMessage());
		}
	}
}
