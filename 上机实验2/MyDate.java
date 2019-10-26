package 上机实验2;

public class MyDate {
	private int _year;
	private int _month;
	private int _day;
	MyDate()
	{
		this._year = 2018;
		this._month = 1;
		this._day = 1;
	}
	MyDate(int y, int m,int d) {
		this._year = y;
		this._month = m;
		this._day = d;
	}
	int getYear() {
		return _year;
	}
	int getMonth() {
		return _month;
	}
	int getDay() {
		return _day;
	}
	void showDate() {
		System.out.println(_year+ "年" +_month+ "月" +_day+ "日");
	}
}
