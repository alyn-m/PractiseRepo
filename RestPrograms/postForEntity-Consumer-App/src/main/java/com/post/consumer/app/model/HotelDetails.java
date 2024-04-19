package com.post.consumer.app.model;

public class HotelDetails {
	
	private String name;
	private String location;
	private float price;
	private int emptyRooms;
	private int rating;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getEmptyRooms() {
		return emptyRooms;
	}
	public void setEmptyRooms(int emptyRooms) {
		this.emptyRooms = emptyRooms;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "HotelDetails [name=" + name + ", location=" + location + ", price=" + price + ", emptyRooms="
				+ emptyRooms + ", rating=" + rating + "]";
	}	
}
