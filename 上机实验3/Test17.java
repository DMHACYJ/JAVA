package �ϻ�ʵ��3;

class MyRectangle{
	double width;
	double height;
	public double getArea() {
		return width*height;
	}
	public void showlnfo() {
		System.out.println("����"+"���:"+width+"\t����:"+height);
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
		System.out.println("������"+"���:"+ super.width+"\t����:"+ super.height);
	}
}
public class Test17 {

	public static void main(String[] args) {
		MyRectangle tangle=new MyRectangle();
		tangle.setHeight(1);
		tangle.setWidth(2);
		System.out.println("���������"+tangle.getArea());
		tangle.showlnfo();
		Mysquare square=new Mysquare();
		square.setHeight(1);
		square.setWidth(1);
		System.out.println("�����������"+square.getArea());
		square.showlnfo();
	}

}