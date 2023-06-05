package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

import prosecution.InventoryController;

public class Room {
	// Attributes
	private Map<LocalDate, Double> Rates;
	private String id;
	private String ubication;
	private String type;
	Boolean balcony;
	Boolean view;
	Boolean kitchen;
	int Bedsnumber;
	String size;
	int sizeSquareMeter;
	boolean airConditioning;
	boolean heating;
	boolean tv;
	boolean coffeeMaker;
	boolean hypoallergenic;
	boolean iron;
	boolean hairDryer;
	boolean AC;
	boolean USBA;
	boolean USBC;
	boolean breakFast;
	boolean parking;
	boolean pool;
	boolean humidAreas;
	boolean BBQ;
	boolean freeWifi;
	boolean Reception24;
	boolean petFriendly;
	
	// constructor
	public Room(String id, String ubication, String type, Boolean balcony, Boolean view, Boolean kitchen,
			int bedsnumber, String size, int sizeSquareMeter, boolean extras){
		this.id = id;
		this.ubication = ubication;
		this.type = type;
		this.balcony = balcony;
		this.view = view;
		this.kitchen = kitchen;
		Bedsnumber = bedsnumber;
		this.size = size;
		this.sizeSquareMeter = sizeSquareMeter;
		this.airConditioning = extras;
		this.heating = extras;
		this.tv = extras;
		this.coffeeMaker = extras;
		this.hypoallergenic = extras;
		this.iron = extras;
		this.hairDryer = extras;
		this.AC = extras;
		this.USBA = extras;
		this.USBC= extras;
		this.breakFast = extras;
		this.parking = extras;
		this.pool = extras;
		this.humidAreas = extras;
		this.BBQ = extras;
		this.freeWifi = extras;
		this.Reception24 = extras;
		this.petFriendly = extras;	
		
		
		
		
		
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
	public int getSizeSquareMeter() {
		return sizeSquareMeter;
	}

	public void setSizeSquareMeter(int SizeSquareMeter) {
		this.sizeSquareMeter = SizeSquareMeter;
	}
	public boolean getAirConditioning() {
		return airConditioning;
	}

	public void setAirConditioning(boolean AirConditioning) {
		this.airConditioning = AirConditioning;
	}
	public boolean getheating() {
		return heating;
	}

	public void setheating(boolean heating) {
		this.heating = heating;
	}
	public boolean gettv() {
		return tv;
	}

	public void settv(boolean tv) {
		this.tv = tv;
	}
	public boolean getcoffeeMaker() {
		return coffeeMaker;
	}

	public void setcoffeeMaker(boolean coffeeMaker) {
		this.coffeeMaker = coffeeMaker;
	}
	public boolean gethypoallergenic() {
		return hypoallergenic;
	}

	public void sethypoallergenic(boolean hypoallergenic) {
		this.hypoallergenic = hypoallergenic;
	}
	public boolean getiron() {
		return iron;
	}

	public void setiron(boolean iron) {
		this.iron = iron;
	}
	public boolean gethairDryer() {
		return hairDryer;
	}

	public void sethairDryer(boolean hairDryer) {
		this.hairDryer = hairDryer;
	}
	public boolean getAC() {
		return AC;
	}

	public void setAC(boolean AC) {
		this.AC = AC;
	}
	public boolean getUSBA() {
		return USBA;
	}

	public void setUSBA(boolean USBA) {
		this.USBA = USBA;
	}
	public boolean getUSBC() {
		return USBC;
	}

	public void setUSBC(boolean USBC) {
		this.USBC = USBC;
	}
	public boolean getbreakFast() {
		return breakFast;
	}

	public void setbreakFast(boolean breakFast) {
		this.breakFast = breakFast;
	}
	public boolean getparking() {
		return parking;
	}

	public void setparking(boolean parking) {
		this.parking = parking;
	}
	public boolean getpool() {
		return pool;
	}

	public void setpool(boolean pool) {
		this.pool = pool;
	}
	public boolean gethumidAreas() {
		return humidAreas;
	}

	public void sethumidAreas(boolean humidAreas) {
		this.humidAreas = humidAreas;
	}
	public boolean getBBQ() {
		return BBQ;
	}

	public void setBBQ(boolean BBQ) {
		this.BBQ = BBQ;
	}
	public boolean getfreeWifi() {
		return freeWifi;
	}

	public void setfreeWifi(boolean freeWifi) {
		this.freeWifi = freeWifi;
	}
	public boolean getReception24() {
		return Reception24;
	}

	public void setReception24(boolean Reception24) {
		this.Reception24 = Reception24;
	}
	public boolean getpetFriendly() {
		return petFriendly;
	}

	public void setpetFriendly(boolean petFriendly) {
		this.petFriendly = petFriendly;
	}


}
