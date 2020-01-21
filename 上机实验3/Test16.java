package 上机实验3;
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
		System.out.println("class Vehlcles"+"尺寸:"+size+" 颜色:"+color+" 座位数:"+seats);
	}
}
class Car extends Vehlcles{
	public Car(int size,String color,int seats){
		super(size,color,seats);
	}
	public void ShowMessages() {
		System.out.println("class Car"+"尺寸:"+super.size+" 颜色:"+super.color+" 座位数:"+super.seats);
	}
}
public class Test16 {

	public static void main(String[] args) {
		Vehlcles vehlcle=new Vehlcles(0, "白色", 0);
		vehlcle.ShowMessages();
		Car car=new Car(1, "黑色", 1);
		car.ShowMessages();
	}

}