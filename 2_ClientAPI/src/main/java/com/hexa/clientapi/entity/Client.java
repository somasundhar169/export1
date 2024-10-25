package com.hexa.clientapi.entity;


public class Client {

	private Long id;
	private String name;
	private String company;
	
	
	
	
	
	public Client() {
		super();
	}
	public Client(Long id, String name, String company) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
}
