package prosecution;

import java.time.LocalTime;

public class AdminProcess {

	//1
	public void createroom(InventoryController inveCont,String id,String ubication,String type, Boolean balcony, Boolean view,
			Boolean kitchen, int numberbeds, String size) {
		inveCont.createRoom(id,ubication,type,  balcony,  view,
				kitchen, numberbeds,  size);
		
	}
	//2
	public void addWithCsv(InventoryController inveCont, String csvName) {
		inveCont.addWithCsv(csvName);
	}
	//3
	public void changeServicesRates(ServicesInventoryController servCont,String name, int rate) {
		servCont.changeRate(name,rate);
	}
	//4
	public void editMenu(RestaurantMenuController restCont, String name, int price, LocalTime startTime, LocalTime endTime, Boolean forRoom) {
		restCont.editDish(name,price,startTime,endTime,forRoom);
	}
}
