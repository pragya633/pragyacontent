package com.cg.lib.model;

public class Book {
	private int bookCode;
	private String title;
	private double price;
	
	public Book(){
		
	}
	
	public Book(int bookCode, String title, double price) {
		super();
		this.bookCode = bookCode;
		this.title = title;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [bookCode=" + bookCode + ", title=" + title + ", price=" + price + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
