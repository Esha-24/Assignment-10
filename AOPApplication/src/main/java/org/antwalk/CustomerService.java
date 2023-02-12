package org.antwalk;

public class CustomerService {
	private String name;
	private String url;
	public void getName() {
		System.out.println("the name is " +name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getUrl() {
		System.out.println("the url is " +url);
	}
	public void setUrl(String url) {
		this.url = url;
	}	

}
