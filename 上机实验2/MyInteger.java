package 上机实验2;

public class MyInteger {
	private int _value;
	MyInteger(int x) {
		_value = x;
	}
	int getInt() {
		return _value;
	}
	boolean isEven() {
		return _value % 2 == 0 ? true : false;
	}
	boolean isOdd() {
		return _value % 2 != 0 ? true : false;
	}
	boolean isPrime() {
		for(int i = 2; i <= Math.sqrt(_value); i++) {
			if(_value % i == 0) {
				return false;
			}
		}
		return true;
	}
	boolean equals(int x) {
		return _value == x ? true : false;
	}
	int parseInt(String x) {
		int res = 0;
		for(int i = 0; i < x.length(); i++) {
			res += (Math.pow(10,x.length() - i - 1)*(x.charAt(i)-'0'));
		}
		return res;
	}
}
