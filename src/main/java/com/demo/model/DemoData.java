package com.demo.model;

public class DemoData {

	private int id;
	private String name;
	private String city;
	private String country;
	private String department;

	public DemoData(int id, String name, String city, String country, String department) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.country = country;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "DemoData [id=" + id + ", name=" + name + ", city=" + city + ", country=" + country + ", department="
				+ department + "]";
	}

}
