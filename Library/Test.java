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
				System.out.println("title： 《"+i.getTitle()+"》"+" author： "+i.getAuthor()+" publish："+i.getPublish());
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
		String str = "978-7-302-32369-3 c++语言基础教程 吴凤翥 清华大学 49 426";
		fw.write(str+ "\r\n");
		BookInfo book = new BookInfo("978-7-302-35938-8", "JAVA基础教程", "传智", "清华大学", 47, 420);
		fw.write(book.toString()+ "\r\n");
		str = "978-7-302-32420-3 c语言程序设计基础 黑马程序员 电子科技大学 30 350";
		fw.write(str+ "\r\n");
		str = "978-7-302-32457-3 微机原理与接口技术 胡丹 西安电子科技大学 35 410";
		fw.write(str+ "\r\n");
		str = "978-7-302-32692-4 操作系统 子丹 同济大学 37 500";
		fw.write(str+ "\r\n");
		str = "978-7-302-32369-4 c++语言基础教程 吴凤翥 清华大学 49 426";
		fw.write(str+ "\r\n");
		str = "978-7-302-35938-9 JAVA基础教程 传智 清华大学 47 420";
		fw.write(str+ "\r\n");
		str = "978-7-302-32420-4 c语言程序设计基础 黑马程序员 电子科技大学 30 350";
		fw.write(str+ "\r\n");
		str = "978-7-302-32457-4 微机原理与接口技术 胡丹 西安电子科技大学 35 410";
		fw.write(str+ "\r\n");
		str = "78-7-302-32692-6 操作系统 子丹 同济大学 37 500";
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
		publishSearch(books, "清华大学");
		ISBNSearch(books, "978-7-302-32369-3");
	}
}
