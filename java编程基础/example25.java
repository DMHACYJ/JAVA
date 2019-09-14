package java编程基础;
//多维数组
//统计公司三个月销售小组中每个小组的总销售额
public class example25 {
	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[] {11, 12};
		arr[1] = new int[] {21, 22, 23};
		arr[2] = new int[] {31, 32, 33, 34};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			int groupsum = 0;
			for(int j = 0; j < arr[i].length; j++) {
				groupsum += arr[i][j];
			}
			sum += groupsum;
			System.out.println("第"  + (i + 1) + "个小组的销售总额：" + groupsum + " 万元。");
		}
		System.out.println("三个小组的总销售额：" + sum + " 万元。");
	}
}
