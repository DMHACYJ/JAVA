package 上机实验2;

public class TestMyInteger {
	public static void main(String[] args) {
		MyInteger in = new MyInteger(100);
		int x = 100;
		String s = "omg";
		System.out.print(in.getInt());
		if(in.isEven()) {
			System.out.print("是偶数，不是奇数，");
		} else System.out.print("不是偶数，是奇数，");
		if(in.isPrime()) {
			System.out.print("是素数,");
		} else System.out.print("不是素数,");
		if(in.equals(x)) {
			System.out.print("和" +x+ "相等，");
		} else System.out.print("和" +x+ "不相等，");
		System.out.print("字符串" +s+ "转成int类型为：" +in.parseInt(s));
	}
}
