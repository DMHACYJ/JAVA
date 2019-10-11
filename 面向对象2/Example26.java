package 面向对象2;
//定义一个函数式接口
@FunctionalInterface
interface PersonBuilder {
	Person26 buildPerson(String name);
}
//定义一个Person类，并添加有参构造方法
class Person26 {
	private String name;
	public Person26(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
public class Example26 {
	public static void printName(String name, PersonBuilder builder) {
		System.out.println(builder.buildPerson(name).getName());
	}
	public static void main(String[] args) {
		//使用Lambda表达式方式
		printName("赵丽颖", name->new Person26(name));
		//使用构造器引用的方式
		printName("赵丽颖", Person26::new);//构造器引用方法
	}
}
