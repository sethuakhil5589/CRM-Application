package com.akhil.Entity;



public class Implementer {

	private Integer id;
	private String name;
	private String city;
	private boolean status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Implementer [id=" + id + ", name=" + name + ", city=" + city + ", status=" + status + "]";
	}
	public Implementer(Integer id, String name, String city, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.status = status;
	}
	
}
