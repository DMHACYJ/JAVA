package �������2;
//final{} ---> try�����쳣ʱ��try������еĴ������ִ��
public class Example30 {
	//����ķ���ʵ���������������
	public static int divide30(int x, int y) {
		try {
			int result = x / y;
			return result;
		} catch (Exception e) { 
			System.out.println("������쳣��ϢΪ��" +e.getMessage());
		} finally {
			System.out.println("ִ��finally����飬���۳����Ƿ��쳣����ִ��");
		}
		return -1;
	}
	public static void main(String[] args) {
		int result = divide30(4, 0);
		if(result == -1) {
			System.out.println("�������쳣��");
		} else {
			System.out.println(result);
		}
	}
}
