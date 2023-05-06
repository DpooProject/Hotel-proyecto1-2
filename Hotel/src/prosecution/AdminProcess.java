package prosecution;



public class AdminProcess {


	public void createroom(InventoryController inveCont,String id,String ubication,String type, Boolean balcony, Boolean view,
			Boolean kitchen, int numberbeds, String size) {
		inveCont.createRoom(id,ubication,type,  balcony,  view,
				kitchen, numberbeds,  size);
		
	}

	public void addWithCsv(InventoryController inveCont, String csvName) {
		inveCont.addWithCsv(csvName);
	}


}
