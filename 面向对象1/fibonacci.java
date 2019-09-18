package 面向对象1;

public class fibonacci {
	public static long fib(int n) {
		if(n == 0 || n == 1) return 1;
		else {
			return fib(n - 1) + fib(n - 2);
		}
	}
	public static long fib2(int n) {
		long arr[] = new long[n+1];
		arr[0] = 0;
		arr[1] = 1;
		for(int i = 2; i <= n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[n];
	}
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			long num = fib(i);
			System.out.print(num+ " ");
		}
		System.out.println("");
		for(int i = 1; i <= 10; i++) {
			long num = fib2(i);
			System.out.print(num+ " ");
		}
	}
}
