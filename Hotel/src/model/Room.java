package model;

import java.util.ArrayList;

import prosecution.InventoryController;

public class Room {
	// Attributes
	private String id;
	private String ubication;
	private String type;
	Boolean balcony;
	Boolean view;
	Boolean kitchen;
	int Bedsnumber;
	String size;

	// constructor
	public Room(String id, String ubication, String type, Boolean balcony, Boolean view, Boolean kitchen,
			int bedsnumber, String size) {
		this.id = id;
		this.ubication = ubication;
		this.type = type;
		this.balcony = balcony;
		this.view = view;
		this.kitchen = kitchen;
		Bedsnumber = bedsnumber;
		this.size = size;
	}

	// getters and setters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUbication() {
		return ubication;
	}

	public void setUbication(String ubication) {
		this.ubication = ubication;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getBalcony() {
		return balcony;
	}

	public void setBalcony(Boolean balcony) {
		this.balcony = balcony;
	}

	public Boolean getView() {
		return view;
	}

	public void setView(Boolean view) {
		this.view = view;
	}

	public Boolean getKitchen() {
		return kitchen;
	}

	public void setKitchen(Boolean kitchen) {
		this.kitchen = kitchen;
	}

	public int getBedsnumber() {
		return Bedsnumber;
	}

	public void setBedsnumber(int bedsnumber) {
		Bedsnumber = bedsnumber;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
