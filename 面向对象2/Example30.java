package 面向对象2;
//final{} ---> try发生异常时，try代码块中的代码继续执行
public class Example30 {
	//下面的方法实现了两个整数相除
	public static int divide30(int x, int y) {
		try {
			int result = x / y;
			return result;
		} catch (Exception e) { 
			System.out.println("捕获的异常信息为：" +e.getMessage());
		} finally {
			System.out.println("执行finally代码块，无论程序是否异常都会执行");
		}
		return -1;
	}
	public static void main(String[] args) {
		int result = divide30(4, 0);
		if(result == -1) {
			System.out.println("程序发生异常！");
		} else {
			System.out.println(result);
		}
	}
}
