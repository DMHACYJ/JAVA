package �ϻ�ʵ��2;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4,40,"��ɫ");
		Rectangle r2 = new Rectangle(3.5,35.9,"��ɫ");
		System.out.println("�ߣ�"+r1.getHeight()+" "+"��"+r1.getWidth()+" "
				+"�����"+r1.getArea()+" "+"�ܳ���"+r1.getPerimeter());
		r2.printRectangle();
	}
}
