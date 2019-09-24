package ËãÉúĞ¤;

public class getYear {
	public static String getAnimal(Integer year) { 
		if(year<1900) return "Î´Öª";
		Integer start = 1900;
		String[] animals=new String[] {
				"Êó","Å£","»¢","ÍÃ","Áú","Éß","Âí","Ñò","ºï","¼¦","¹·","Öí"};
		return animals[(year-start)%animals.length];
	}
	public static void main(String[] args) {
		int year=2000;
		System.out.println(year+ "ÄêÊÇ" +getAnimal(year)+ "Äê");
	}
}