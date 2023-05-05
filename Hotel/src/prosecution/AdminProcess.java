package prosecution;



public class AdminProcess {


	public static void createroom(InventoryController inveCont,String id,String ubication,String type, Boolean balcony, Boolean view,
			Boolean kitchen, int numberbeds, String size) {
		inveCont.createRoom(id,ubication,type,  balcony,  view,
				kitchen, numberbeds,  size);
		
	}


}
