package books.controller;


import org.springframework.web.multipart.MultipartFile;

public class BooksCommand {
	private String isbn;
	private int num;
	private String name;
	private String writer;
	private int charge;
	private String content;
	private String pub;
	private MultipartFile imgname;
	

	public MultipartFile getImgname() {
		return imgname;
	}
	public void setImgname(MultipartFile imgname) {
		this.imgname = imgname;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
