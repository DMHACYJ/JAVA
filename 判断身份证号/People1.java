package 判断身份证号;

public class People1 {
	private String ID;
	private String name;
	public People1(String ID,String name) {
		this.ID = ID;
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getID() {
		return ID;
	}
	public int IDIsTrue() {
		if(ID.length() != 18) {
			System.out.println(ID+ "是假的");
			return 0;
		}
		int[] base = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2, 1};
		int res = 0;
		for(int i = 0; i < base.length; i++) {
			if(i == (base.length - 1) && ID.charAt(i) == 'X') {
				res += 10;
				break;
			}
			char c = ID.charAt(i);
			int t = c-'0';
			res += t*base[i];
		}
		if((res % 11) == 1) return 1;
		else return 0;
	}
	public String getBirthday() throws Exception{
		if(IDIsTrue()==0) {
			throw new Exception("身份证号输入不正确。");
		}
		String str = "";
		str = "姓名：" + this.name + "，";
		str += "出生日期：" +this.ID.substring(6, 10) + "年";
		if(ID.charAt(10) == '0') 
			str += ID.charAt(11) + " 月";
		else str += this.ID.substring(10, 12) + "月";
		if(ID.charAt(12) == '0') 
			str += ID.charAt(13) + " 日，";
		else str += this.ID.substring(12, 14) + "日，";
		str += "性别：";
		if((ID.charAt(16) - '0') % 2 == 0) str += "女";
		else str += "男";
		return str;
	}
}