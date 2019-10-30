package Library;

import java.io.*;
import java.util.*;

public class Test {
	private static List<BookInfo> books;
	public static void pagesSearch(List<BookInfo> books,int pages) {
		if(pages <= 0) {
			try {
				throw new Exception("Input pages again");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		int count=0;
		for(BookInfo i:books) {
			if(i.getPages() >= pages) {
				count++;
			}
		}
		System.out.println("pages >= "+pages+" pay : "+count);
	}
	public static void publishSearch(List<BookInfo> books,String str) {
		double price = 0;
		int count = 0;
		for(BookInfo i : books) {
			if(i.getPublish().equals(str)) {
				price += i.getPrice();
				count++;
			}
		}
		if(price == 0) {
			try {
				throw new Exception("No such books!");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("publish: " +str+ " kinds: " +count+ "pay: " +price);
	}
	public static void ISBNSearch(List<BookInfo> o,String str) throws Exception {
		Boolean flag = true;
		for(BookInfo i : o) {
			if(i.getISBN().equals(str)) {
				System.out.println("title�� ��"+i.getTitle()+"��"+" author�� "+i.getAuthor()+" publish��"+i.getPublish());
				flag = false;
			}
		}
		
		if(flag) {
			try {
				throw new Exception("No such ISBN!");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public static void main(String[] args) throws Exception {
		/*FileWriter fw = new FileWriter("F:\\test\\java1\\src\\Library\\Data.txt");
		String str = "978-7-302-32369-3 c++���Ի����̳� ����� �廪��ѧ 49 426";
		fw.write(str+ "\r\n");
		BookInfo book = new BookInfo("978-7-302-35938-8", "JAVA�����̳�", "����", "�廪��ѧ", 47, 420);
		fw.write(book.toString()+ "\r\n");
		str = "978-7-302-32420-3 c���Գ�����ƻ��� �������Ա ���ӿƼ���ѧ 30 350";
		fw.write(str+ "\r\n");
		str = "978-7-302-32457-3 ΢��ԭ����ӿڼ��� ���� �������ӿƼ���ѧ 35 410";
		fw.write(str+ "\r\n");
		str = "978-7-302-32692-4 ����ϵͳ �ӵ� ͬ�ô�ѧ 37 500";
		fw.write(str+ "\r\n");
		str = "978-7-302-32369-4 c++���Ի����̳� ����� �廪��ѧ 49 426";
		fw.write(str+ "\r\n");
		str = "978-7-302-35938-9 JAVA�����̳� ���� �廪��ѧ 47 420";
		fw.write(str+ "\r\n");
		str = "978-7-302-32420-4 c���Գ�����ƻ��� �������Ա ���ӿƼ���ѧ 30 350";
		fw.write(str+ "\r\n");
		str = "978-7-302-32457-4 ΢��ԭ����ӿڼ��� ���� �������ӿƼ���ѧ 35 410";
		fw.write(str+ "\r\n");
		str = "78-7-302-32692-6 ����ϵͳ �ӵ� ͬ�ô�ѧ 37 500";
		fw.write(str+ "\r\n");
		fw.close();
		*/
		FileReader fr=new FileReader("F:\\test\\java1\\src\\Library\\Data.txt");
		@SuppressWarnings("resource")
		BufferedReader br=new BufferedReader(fr);
		List <BookInfo> books = new ArrayList<>();
		while(true) {
			String str = br.readLine();
			if(str!=null) {
				String[] array=str.split(" ");
				BookInfo book =new BookInfo(array[0],array[1],array[2],array[3],Double.parseDouble(array[4]),Integer.parseInt(array[5]));
				books.add(book);
			}
			else break;
		}
		pagesSearch(books, 10);
		publishSearch(books, "�廪��ѧ");
		ISBNSearch(books, "978-7-302-32369-3");
	}
}
