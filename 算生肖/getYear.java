package ����Ф;

public class getYear {
	public static String getAnimal(Integer year) { 
		if(year<1900) return "δ֪";
		Integer start = 1900;
		String[] animals=new String[] {
				"��","ţ","��","��","��","��","��","��","��","��","��","��"};
		return animals[(year-start)%animals.length];
	}
	public static void main(String[] args) {
		int year=2000;
		System.out.println(year+ "����" +getAnimal(year)+ "��");
	}
}