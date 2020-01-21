package 上机实验3;

class MyRectangle{
	double width;
	double height;
	public double getArea() {
		return width*height;
	}
	public void showlnfo() {
		System.out.println("矩形"+"宽度:"+width+"\t长度:"+height);
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}
class Mysquare extends MyRectangle{
	public double getArea() {
		return super.width*super.height;
	}
	public void showlnfo() {
		System.out.println("正方形"+"宽度:"+ super.width+"\t长度:"+ super.height);
	}
}
public class Test17 {

	public static void main(String[] args) {
		MyRectangle tangle=new MyRectangle();
		tangle.setHeight(1);
		tangle.setWidth(2);
		System.out.println("矩形面积："+tangle.getArea());
		tangle.showlnfo();
		Mysquare square=new Mysquare();
		square.setHeight(1);
		square.setWidth(1);
		System.out.println("正方形面积："+square.getArea());
		square.showlnfo();
	}

}