package com.lgcns.m2.exercise;

public class Book {
	private String name;
	private int pageCount;
	private int price;
	
	
	public Book (String name, int pageCount, int price){
		this.name= name;
		this.pageCount = pageCount;
		this.price = price;
	}
	public String getnName() {
		return name;
	}
	public void setName(String namr) {
		this.name = namr;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

    public void printBookInfo() {
        System.out.println( name+" ("+pageCount+ ") : "+price+"¿ø");
//		
    }
//	public String toString(){
//		return name+" ("+pageCount+ ") : "+price+"¿ø";
//		
//	}
}
