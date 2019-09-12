package java编程基础;
//如果break要跳出外层循环，则要对外层循环进行标记（outer），然后使用break跳出指定的外层循环
public class example16 {
	public static void main(String[] args) {
		outer: for(int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				if(i > 3)
				{
					break outer;
				}
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println("");
		}
	}
}
