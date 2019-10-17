package java中的常用类;
//String()初始化
public class Example01 {
	public static void main(String[] args) {
		//创建一个内容为空的字符串
		String str1 = new String();
		//创建一个内容为abc的字符串
		String str2 = new String("abc");
		//创建一个内容为字符数组的字符串
		char[] charArray = new char[] {'A', 'B', 'C'};
		String str3 = new String(charArray);
		//输出结果
		System.out.println("a" +str1+ "b");
		System.out.println(str2);
		System.out.println(str3);
	}
}
