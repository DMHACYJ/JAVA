package �ϻ�ʵ��3;
class Vehlcles{
	int size;
	String color;
	int seats;
	public Vehlcles(int size,String color,int seats){
		this.size=size;
		this.color=color;
		this.seats=seats;
	}
	public void ShowMessages() {
		System.out.println("class Vehlcles"+"�ߴ�:"+size+" ��ɫ:"+color+" ��λ��:"+seats);
	}
}
class Car extends Vehlcles{
	public Car(int size,String color,int seats){
		super(size,color,seats);
	}
	public void ShowMessages() {
		System.out.println("class Car"+"�ߴ�:"+super.size+" ��ɫ:"+super.color+" ��λ��:"+super.seats);
	}
}
public class Test16 {

	public static void main(String[] args) {
		Vehlcles vehlcle=new Vehlcles(0, "��ɫ", 0);
		vehlcle.ShowMessages();
		Car car=new Car(1, "��ɫ", 1);
		car.ShowMessages();
	}

}