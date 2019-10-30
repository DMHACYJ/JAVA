package Library;

public class BookInfo {
	private String ISBN;
	private String title;
	private String author;
	private double price;
	private String publish;
	private int pages;
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public String toString() {
		return ISBN+ " " +title+ " " +author+ " " +price+ " " +publish+ " " +pages;
	}
	
	public BookInfo() {}
	public BookInfo(String ISBN, String title, String author, String publish, double price,int pages) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publish=publish;
        this.pages=pages;
    }
}
