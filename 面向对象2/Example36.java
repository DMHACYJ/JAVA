package 面向对象2;
public class Example36 {
	//下面的方法实现了两个整数相除
	public static int divide36(int x, int y) throws Exception {
		if(y == 0) {
			//使用throw关键字声明异常对象
			throw new Exception("除数是0");
		}
		int result = x / y;
		return result;
	}
	public static void main(String[] args) {
		try {
			int result = divide36(4, 0);
			System.out.println(result);
		} catch(Exception e) {
			System.out.println("捕获的异常信息为：" +e.getMessage());
		}
	}
}
