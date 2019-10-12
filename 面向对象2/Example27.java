package 面向对象2;
//定义一个函数式接口
@FunctionalInterface
interface Printable27 {
	void print(StringUtils27 su, String str);
}
class StringUtils27 {
	public void printUpperCase27(String str) {
		System.out.println(str.toUpperCase());
	}
}
public class Example27 {
	private static void printUpper27(StringUtils27 su, String test, Printable27 pt) {
		pt.print(su, test);
	}
	public static void main(String[] args) {
		//使用Lambda表达式方式
		printUpper27(new StringUtils27(),"hello", (object, t) ->object.printUpperCase27(t));
		//使用方法引用的方式
		printUpper27(new StringUtils27(),"hello", StringUtils27::printUpperCase27);
	}
}
