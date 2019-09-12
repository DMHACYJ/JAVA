package java编程基础;
//强制类型转换,数据精度丢失
public class example02 {
	public static void main (String[] args) {
		byte a;
		int b =298;
		a =(byte) b;//这里将地址长的类型赋值给地址短的类型一定要强制类型转换，不然编译报错
		System.out.println("b=" +b);
		System.out.println("a=" +a);
	}
}
