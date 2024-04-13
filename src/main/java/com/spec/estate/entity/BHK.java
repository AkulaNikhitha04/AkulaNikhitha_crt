package com.spec.estate.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BHK {
	@Id
	private int id;
	private String name;
	private int type;
	private String mURL;
	private List<String>imagesList;
	private int price;
	private int area;
	private String address;
	public BHK() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getmURL() {
		return mURL;
	}
	public void setmURL(String mURL) {
		this.mURL = mURL;
	}
	public List<String> getImagesList() {
		return imagesList;
	}
	public void setImagesList(List<String> imagesList) {
		this.imagesList = imagesList;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public BHK(int id, String name, int type, String mURL, List<String> imagesList, int price, int area,
			String address) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.mURL = mURL;
		this.imagesList = imagesList;
		this.price = price;
		this.area = area;
		this.address = address;
	}
	

}
