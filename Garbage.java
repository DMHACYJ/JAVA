package java1;

public class Garbage {
	public static void main(String[] args)
	{
		String garbage = "渣土";
		if (garbage == "砖瓦陶瓷" || garbage == "渣土" || garbage == "卫生间废纸" || garbage == "纸巾")
		{
			System.out.println("其它垃圾");
		}
		else if (garbage == "剩饭" || garbage == "骨头" || garbage == "剩菜" || garbage == "果皮")
		{
			System.out.println("厨余垃圾");
		}
		else if(garbage == "废纸" || garbage == "塑料" || garbage == "玻璃" || garbage == "布料" || garbage == "金属")
		{	 
			System.out.println("可回收垃圾");
		}
		else if (garbage == "重金属" || garbage == "电池" || garbage == "灯管灯泡" || garbage == "过期药品" || garbage == "化妆品")
		{
			 System.out.println("有害垃圾");
		}		 
	}
}
