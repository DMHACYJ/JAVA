package java编程基础;
//continue :结束本层循环，进入下一层循环
public class example17 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {//i是一个偶数时，不累加
				continue;//结束本层循环，进入下一个循环
			}
			sum += i;//得到1到100之间所有的奇数和
		}
		System.out.println("sum=" + sum);
	}
}
