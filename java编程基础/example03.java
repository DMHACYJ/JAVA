package java编程基础;

public class example03 {
	public static void main (String[] args) {
		byte b =3;
		short s =4;
		char c =5;
		//将byte/short/char类型数值相加，早赋值给byte类型
		byte b2 =(byte)(b+s+c);
		//表达式类型自动提升，如byte/short/char类型的变量在预算期间会自动提升为int
		System.out.println("b2=" +b2);
	}
}
