package console;

import java.io.IOException;

import prosecution.InventoryController;
import prosecution.UserDataController;

public class Begginer {
	InventoryController inveCont = new InventoryController();

	public InventoryController beginInventory() {
		inveCont.loadinventory();
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
