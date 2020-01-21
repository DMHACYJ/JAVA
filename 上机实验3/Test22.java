package 上机实验3;
class Giede extends Animal implements Flyable{
	public double flySpeed() {
		return 1.1;
	}
	public Giede(String type) {
		super(type);
	}
	public void sound22() {
		System.out.println("叽叽叽");
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
		System.out.println("咕咕咕");
	}
}
public class Test22 {
	public static void main(String[] args) {
		Giede g=new Giede("麻雀");
		Pigeon p=new Pigeon("鸽子");
		System.out.println(g.toString()+" 最大飞行速度："+g.flySpeed()+" ");
		g.sound22();
		System.out.println(p.toString()+" 最大飞行速度："+p.flySpeed()+" ");
		p.sound22();
	}
}