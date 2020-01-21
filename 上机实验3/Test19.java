package 上机实验3;

import java.util.Scanner;

abstract class Area{
	public abstract double area();
}
class RectArea extends Area{
	private double width;
	private double heigth;
	public void setWidth(double width) {
		this.width=width;
	}
	public void setHeigth(double heigth) {
		this.heigth=heigth;
	}
	public double area() {
		return width*heigth;
	}
}
class RoundArea extends Area{
	private double r;
	public void setR(double r) {
		this.r=r;
	}
	public double area() {
		return r*r*Math.PI;
	}
}

public class Test19 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double w=scan.nextInt();
		double h=scan.nextInt();
		double r=scan.nextInt();
		RectArea tangle=new RectArea();
		tangle.setHeigth(h);
		tangle.setWidth(w);
		System.out.println("长方形的面积:"+tangle.area());
		RoundArea circle=new RoundArea();
		circle.setR(r);
		System.out.println("圆的面积:"+circle.area());
	}
}