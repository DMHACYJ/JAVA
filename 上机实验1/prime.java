package 上机实验1;
//输出1000以内的素数
public class prime {
	public static void main(String[] args) {
		System.out.println("1~1000以内的素数：");
		for(int i = 2; i < 1000; i++) {
			int flag = 1;
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0 && i % j != 1) flag = 0;
			}
			
			if(flag == 1) System.out.print(i+ " ");
//			if(i % 100 == 0) System.out.println("");
		}
	}
}
