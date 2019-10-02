package 面向对象2;//接口与接口继承
//定义Animal14接口
interface Animal14 {
	int ID = 1;
	void breathe();
	default void getType(String type) {
		System.out.println("该动物属于：" +type);
	}
	//定义一个静态方法
	static int getID() {
		return Animal14.ID;
	}
}
//定义LandAnimal接口，并继承Animal14接口
interface LanAnimal extends Animal14 {
	void run();
}
//Dog实现LandAnimal接口
class Dog14 implements LanAnimal { 
	//实现breathe方法
	public void breathe() {
		System.out.println("狗在呼吸");
	}
	//实现run方法
	public void run() {
		System.out.println("狗在陆地上跑");
	}
}
public class Example14 {
	public static void main(String[] args) {
		System.out.println(Animal14.getID());//通过接口名调用类方法
		Dog14 dog = new Dog14();
		System.out.println(dog.ID);
		dog.breathe();
		dog.getType("犬科");
		dog.run();
	}
}
