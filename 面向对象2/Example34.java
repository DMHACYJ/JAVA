package �������2;
//throw�ؼ����׳������쳣
public class Example34 {
	public static void printAge(int age) throws Exception {
		if(age <= 0) {
			//��ҵ���߼������жϣ�����������Ϊ����ʱ�׳��쳣
			throw new Exception("������������󣬱�������������");
		} else {
			System.out.println("��������Ϊ��" +age);
		}
	}
	public static void main(String[] args) {
		//����Ĵ��붨����һ��try����catch������ڲ����쳣
		int age = -1;
		try {
			printAge(age);
		} catch(Exception e) {
			System.out.println("������쳣��ϢΪ��" +e.getMessage());
		}
	}
}
