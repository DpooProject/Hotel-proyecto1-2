package interfaceshotel;

import java.io.IOException;

import prosecution.InventoryController;
import prosecution.RestaurantMenuController;
import prosecution.ServicesInventoryController;
import prosecution.UserDataController;

public class Begginer {
	InventoryController inveCont = new InventoryController();
	ServicesInventoryController inveServ = new ServicesInventoryController();
	RestaurantMenuController restCont= new RestaurantMenuController();
	public InventoryController beginInventory() {
		inveCont.loadinventory();
		return inveCont;
	}
	public ServicesInventoryController beginServiceInventory() {
		inveServ.loadServiceinventory();
		return inveServ;
	}
	public RestaurantMenuController beginRestaurantMenu() {
		restCont.loadMenu();
		return restCont;
	}
	//recepcionist
	public InventoryController beginReservations() {
		inveCont.loadReservations();
		return inveCont;
	}
	
	
	public void beginLogin() {
		UserDataController loader = new UserDataController();
		try {
			loader.readCSV("src/Memory/Logins.csv");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
