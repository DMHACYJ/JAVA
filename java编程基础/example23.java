package java编程基础;

public class example23 {
	public static void main(String[] args) {
		int[] arr = {4, 1, 6, 3, 9, 8};
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("数组arr中的最大值为：" + max);
	}
}
