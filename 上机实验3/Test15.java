package 上机实验3;
class Pointer{
	private int x;
	private int y;
	public Pointer(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void display() {
		System.out.println("["+x+","+y+"]");
	}
	@Override
	public String toString() {
		return "["+x+","+y+"]";
	}
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(getClass()!=obj.getClass()) return false;
		Pointer other=(Pointer) obj;
		if(x!=other.x||y!=other.y)
			return false;
		return true;
	}
}
public class Test15 {
	public static void main(String[] args) {
		Pointer a=new Pointer(1,1);
		Pointer b=new Pointer(2,2);
		System.out.println("中点：(" +(a.getX()+b.getX())/2.0+ ", " +(a.getY()+b.getY())/2.0+ ")");
	}
}
