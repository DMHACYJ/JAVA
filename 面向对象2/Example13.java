package 面向对象2;
//定义了Animal接口
interface Animal13 {
	int ID = 1;
	void breathe();
	//定义一个默认方法
	default void getType(String type) {
		System.out.println("该动物属于：" +type);
	}
	//定义一个静态方法
	static int getID() {
		return Animal13.ID;
	}
}
//Dog类实现Animal13接口
class Dog13 implements Animal13 {
	//实现breath()方法
	public void breathe() {
		System.out.println("狗在呼吸");
	}
}

public class Example13 {
	public static void main(String[] args) {
		System.out.println(Animal13.getID());//通过接口名调用类方法
		Dog13 dog = new Dog13();             //通过Dog类的实例对象
		System.out.println(dog.ID);          //在实现类中获取接口全局常量
		dog.breathe();                       //调用Dog中的breathe()方法
		dog.getType("犬科");     //通过接口实现类Dog的实例化对象，覅用接口默认方法
	}
}
