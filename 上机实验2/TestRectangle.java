package 上机实验2;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4,40,"黄色");
		Rectangle r2 = new Rectangle(3.5,35.9,"红色");
		System.out.println("高："+r1.getHeight()+" "+"宽："+r1.getWidth()+" "
				+"面积："+r1.getArea()+" "+"周长："+r1.getPerimeter());
		r2.printRectangle();
	}
}
