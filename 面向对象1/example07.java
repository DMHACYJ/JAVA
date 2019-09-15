package 面向对象1;
//方法的递归
public class example07 {
	//使用递归实现求n-1的和
	public static int getSum(int n) {
		if(n == 1) {
			return 1;//递归结束条件
		}
		int temp = getSum(n - 1);
		return temp + n;
	}
	public static void main(String[] args) {
		int sum = getSum(4);
		System.out.println("sum=" +sum);
	}
}
