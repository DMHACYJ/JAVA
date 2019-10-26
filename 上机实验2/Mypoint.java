package 上机实验2;

public class Mypoint {
	private double _x;
	private double _y;
	Mypoint() {
		_x = 0;
		_y = 0;
	}
	Mypoint(double x,double y) {
		_x = x;
		_y = y;
	}
	double getX() {
		return _x; 
	}
	double getY() {
		return _y;
	}
	double distance(Mypoint m) {
		return Math.sqrt(Math.pow(Math.abs(m._x-_x),2)+
				Math.pow(Math.abs(m._y-_y),2));
	}
}
