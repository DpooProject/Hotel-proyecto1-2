package model;

import java.util.HashMap;

public class Inventory {
	HashMap<String, Room> inventory;

	private static  Inventory instance;

	public static Inventory getInventory(HashMap<String, Room> inventory) {
		if (instance == null) {
			instance = new Inventory(inventory);
		}
		return instance;
	}

	private Inventory(HashMap<String, Room> inventory) {
		this.inventory = inventory;
	}
	public HashMap<String, Room> getInstance() {
		return inventory;
		
	}
}