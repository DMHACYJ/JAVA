package 上机实验3;
import java.util.*;
class A14{
	public int f1(int a,int b) {
		int temp;
		while(b!=0) {
			temp=a%b;
			a=b;
            b=temp;
		}
		return a;
	}
}
class B14 extends A14{
	public int f1(int a,int b) {
		int m=super.f1(a,b);
		return a*b/m;
	}
}
public class Test14 {
	public static void main(String[] args) {
		A14 a=new A14();
		B14 b=new B14();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		sc.close();
		System.out.println(a.f1(x,y)+" "+b.f1(x,y));
	}
}
