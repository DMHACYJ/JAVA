package �ϻ�ʵ��3;
class Giede extends Animal implements Flyable{
	public double flySpeed() {
		return 1.1;
	}
	public Giede(String type) {
		super(type);
	}
	public void sound22() {
		System.out.println("ߴߴߴ");
	}
}
class Pigeon extends Animal implements Flyable{
	public double flySpeed() {
		return 1.1;
	}
	public Pigeon(String type) {
		super(type);
	}
	public void sound22() {
		System.out.println("������");
	}
}
public class Test22 {
	public static void main(String[] args) {
		Giede g=new Giede("��ȸ");
		Pigeon p=new Pigeon("����");
		System.out.println(g.toString()+" �������ٶȣ�"+g.flySpeed()+" ");
		g.sound22();
		System.out.println(p.toString()+" �������ٶȣ�"+p.flySpeed()+" ");
		p.sound22();
	}
}