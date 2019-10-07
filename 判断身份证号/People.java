package 判断身份证号;

public class People {
	private String ID;
	private String name;
	private String sex;
	private Double height;
	private Double weight;
	public People() {}
	public People(String ID,String name,String sex,Double height,Double weight) {
		this.ID = ID;
		this.name = name;
		this.sex = sex;
		this.weight = weight;
		this.height = height;
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
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Double getWeight() {
		return weight;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getHeight() {
		return height;
	}
	public void eat() {
		System.out.println(name+ "在吃饭");
	}
	public void sleep() {
		System.out.println(name+ "在睡觉");
	}
	public void IDIsTrue() {
		if(ID.length() != 18) {
			System.out.println(ID+ "是假的");
			return;
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
		if((res % 11) == 1) System.out.println(ID+ "是真的");
		else System.out.println(ID+ "是假的");
	}
}
