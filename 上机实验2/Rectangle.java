package 上机实验2;

public class Rectangle {
	private double _width;
	private double _height;
	private String _color;
	Rectangle(){
		_width = 1.0;
		_height = 1.0;
		_color = "白色";
	}
	Rectangle(double width,double height,String color) {
		_width = width;
		_height = height;
		_color = color;
	}
	double getWidth() {
		return _width;
	}
	double getHeight() {
		return _height;
	}
	String getColour() {
		return _color;
	}
	void setWidth(double width) {
		_width = width;
	}
	void setHeight(double height) {
		_height = height;
	}
	void setColour(String color) { 
		_color = color;
	}
	double getArea() {
		return _width*_height;
	}
	double getPerimeter() {
		return 2*(_width+_height);
	}
	void printRectangle() {
		System.out.println("高："+getHeight()+" "+"宽："+getWidth()+" "
			+"面积："+getArea()+" "+"周长："+getPerimeter());
	}
}
