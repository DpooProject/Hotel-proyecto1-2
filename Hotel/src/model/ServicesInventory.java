package model;

import java.util.HashMap;

public class ServicesInventory {
	HashMap<String, Service> serviceInventory;

	private static ServicesInventory instance;

	public static ServicesInventory getServiceInventory(HashMap<String, Service> inventory) {
		if (instance == null) {
			instance = new ServicesInventory(inventory);
		}
		return instance;
	}
	private ServicesInventory(HashMap<String, Service> inventory) {
		this.serviceInventory = inventory;
	}
	public HashMap<String, Service> getInstance() {
		return serviceInventory;
	}
	public void printKeys() {
		for (String ServiceName : serviceInventory.keySet()) {
			int rate = serviceInventory.get(ServiceName).getRate();
			System.out.println("Servicio: " + ServiceName + " Precio:  " + Integer.toString(rate));
		}
	}
}
