package �ϻ�ʵ��3;
class A{
	public void f() {
		System.out.println("XuanLu");
	}
}
class B extends A{
	public void g() {
		System.out.println("���");
	}
}
public class Test13 {
	public static void main(String[] args) {
		B b=new B();
		b.f();
		b.g();
	}
}