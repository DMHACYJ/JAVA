package �������2;
//����һ������ʽ�ӿ�
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
		//ʹ��Lambda���ʽ��ʽ
		printUpper27(new StringUtils27(),"hello", (object, t) ->object.printUpperCase27(t));
		//ʹ�÷������õķ�ʽ
		printUpper27(new StringUtils27(),"hello", StringUtils27::printUpperCase27);
	}
}
