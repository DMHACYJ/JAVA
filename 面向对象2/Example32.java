package 面向对象2;
//throws抛出异常
public class Example32 {
	//下面的方法实现了两个整数相除并使用throws关键字声明抛出异常
	public static int divide32(int x, int y) throws Exception {
		int result = x / y;
		return result;
	}
	public static void main(String[] args) {
		try {
			int result = divide32(4, 0);
			System.out.println(result);
		} catch(Exception e) {
			System.out.println("捕获的异常信息为：" +e.getMessage());
		}
	}
}
