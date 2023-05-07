package model;

import java.time.LocalTime;

public class Dish {
	//Attributes
	private String name;
	private int price;
	private LocalTime startTime;
	private LocalTime endTime;
	private Boolean forRoom;
	//Constructor
	public Dish(String name, int price, LocalTime startTime, LocalTime endTime, Boolean forRoom) {
		super();
		this.name = name;
		this.price = price;
		this.startTime = startTime;
		this.endTime = endTime;
		this.forRoom = forRoom;
	}
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	public Boolean getForRoom() {
		return forRoom;
	}
	public void setForRoom(Boolean forRoom) {
		this.forRoom = forRoom;
	}
	
}
