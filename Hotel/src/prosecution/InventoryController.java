package prosecution;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import model.Inventory;
import model.Room;

public class InventoryController {
	Inventory inventory;

	// methods
	public void loadinventory() {
		String csvFile = "src/Memory/inventario.csv";
		String line;
		String csvSplitBy = ",";
		HashMap<String, Room> rooms = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			// Ignorar la primera línea (encabezado)
			br.readLine();

			while ((line = br.readLine()) != null) {
				if (!line.isEmpty()) { // Verificar si la línea no está vacía
				
				String[] data = line.split(csvSplitBy);
				String id = data[0];
				String ubication = data[1];
				String type = data[2];
				Boolean balcony = Boolean.parseBoolean(data[3]);
				Boolean view = Boolean.parseBoolean(data[4]);
				Boolean kitchen = Boolean.parseBoolean(data[5]);
				int bedsNumber = Integer.parseInt(data[6]);
				String size = data[7];
				Room habitacion = new Room(id, ubication, type, balcony, view, kitchen, bedsNumber, size);
				rooms.put(id, habitacion);
			}
		} }catch (IOException e) {
			e.printStackTrace();
		}

		// Prueba: imprimir las habitaciones
		for (String id : rooms.keySet()) {
			Room habitacion = rooms.get(id);
			String tipo = habitacion.getType();
			String ubicacion = habitacion.getUbication();
			System.out.println("Habitación " + id + ": " + tipo + ", " + ubicacion);
		}
		
		this.inventory = Inventory.getInventory(rooms);

	}
	// agregar habitacion

	public void createRoom(String id, String ubication, String type, Boolean balcony, Boolean view,
			Boolean kitchen, int numberbeds, String size) {
		Room newRoom= new Room(id,ubication,type,  balcony,  view,
				kitchen, numberbeds,  size);
		HashMap<String, Room> rooms=inventory.getInstance();
		rooms.put(id, newRoom);
		for (String idd : rooms.keySet()) {
			Room habitacion = rooms.get(idd);
			String tipo = habitacion.getType();
			String ubicacion = habitacion.getUbication();
			System.out.println("Habitación " + idd + ": " + tipo + ", " + ubicacion);
		}
	}

	public void update() {
	    String csvFile = "src/Memory/inventario.csv";
	    String csvHeader = "id,ubication,type,balcony,view,kitchen,bedsNumber,size\n";
	    StringBuilder csvContent = new StringBuilder(csvHeader);

	    for (Room habitacion : inventory.getInstance().values()) {
	        String id = habitacion.getId();
	        String ubication = habitacion.getUbication();
	        String type = habitacion.getType();
	        Boolean balcony = habitacion.getBalcony();
	        Boolean view = habitacion.getView();
	        Boolean kitchen = habitacion.getKitchen();
	        int bedsNumber = habitacion.getBedsnumber();
	        String size = habitacion.getSize();
	        
	        csvContent.append(id).append(",")
	                   .append(ubication).append(",")
	                   .append(type).append(",")
	                   .append(balcony).append(",")
	                   .append(view).append(",")
	                   .append(kitchen).append(",")
	                   .append(bedsNumber).append(",")
	                   .append(size).append("\n");
	    }

	    try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
	        bw.write(csvContent.toString());
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}


}
