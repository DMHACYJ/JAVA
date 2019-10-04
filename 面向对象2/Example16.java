package 面向对象2;
//定义接口Animal16
interface Animal16 {
	void shout();
}
//定义Cat16实现Animal接口
class Cat16 implements Animal16 {
	//实现接口shout方法
	public void shout() {
		System.out.println("喵喵……");
	}
	//定义Cat类特有的猫抓老鼠catchMouse()方法
	public void catchMouse() {
		System.out.println("小猫抓老鼠……");
	}
}

class Example16 {
	public static void main(String[] args) {
		Animal16 an1 = new Cat16();
		an1.shout();
		Cat16 an2 = new Cat16();
		an2.catchMouse();//Cat的专属方法
		Cat16 cat = (Cat16)an1;//强制类型转化
		cat.shout();
		cat.catchMouse();
	}
}
