package java编程基础;
//三种数组定义方式
public class example18 {
	public static void main(String[] args) {
		//第一种方式定义数组
		int[] ids = new int[100];//数组元素未初始化的时候，默认值为零
		System.out.println("ids[0]=" + ids[0]);
		System.out.println("ids[99]=" + ids[99]);
		System.out.println("======================");
		//第二种方式定义数组
		String[] names = new String[] {"张三","tom","jack"};
		System.out.println("names[0]=" + names[0]);
		System.out.println("names[2]=" + names[2]);
		System.out.println("======================");
		//第三种方式定义数组
		Object[] object = {"张三","tom","jack"};
		System.out.println("object[0]=" + object[0]);
		System.out.println("object[2]=" + object[2]);
	}
}
