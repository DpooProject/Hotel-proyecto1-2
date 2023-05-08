package prosecution;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import model.Inventory;
import model.Room;
import model.Reservation;
public class InventoryController {
	static Inventory inventory; //aqui queda guardado
	public static HashMap<String, Reservation> reservationsInventory;
	// methods
	public void loadinventory() {
		String csvFile = "src/Memory/Inventario.csv";
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
		this.inventory = Inventory.getInventory(rooms);
	}
	// agregar habitacion

	public void createRoom(String id, String ubication, String type, Boolean balcony, Boolean view,
			Boolean kitchen, int numberbeds, String size) {
		Room newRoom= new Room(id,ubication,type,  balcony,  view,
				kitchen, numberbeds,  size);
		
		inventory.addRoom(id, newRoom);
	}
	//añadir habitaciones con archivo csv
	public void addWithCsv(String FileName) {
		String csvFile = "src/Memory/"+FileName+".csv";
		String line;
		String csvSplitBy = ",";

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
				Room newRoom = new Room(id, ubication, type, balcony, view, kitchen, bedsNumber, size);
				this.inventory.addRoom(id, newRoom);
			}
		} }catch (IOException e) {
			e.printStackTrace();
		}
	}
	//recepcionist
	public void loadReservations(){
        String csvFile = "src/Memory/Reservasiones.csv";
        String line;
        String csvSplitBy = ",";
        HashMap<String, Reservation> reservationsInventory = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Ignorar la primera línea (encabezado)
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] datos = line.split(csvSplitBy);

                String id = datos[0];
                String nombre = datos[1];
                int cantidad = Integer.parseInt(datos[2]);
                int dias = Integer.parseInt(datos[3]);
                int dia = Integer.parseInt(datos[4]);
                int mes = Integer.parseInt(datos[5]);
                int ano = Integer.parseInt(datos[6]);

                Reservation reserva = new Reservation(id, nombre, cantidad, dias, dia, mes, ano, false, false);
                reservationsInventory.put(id, reserva);
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        InventoryController.reservationsInventory=reservationsInventory;

}
	//////////////////// 
	///update del recepcionista 
	public void recepUpdate() {
	    String csvFile = "src/Memory/Reservasiones.csv";
	    String csvHeader = "id,nombre,cantidad,dias,dia,mes,ano\n";
	    StringBuilder csvContent = new StringBuilder(csvHeader);

	    for (Reservation reservation : reservationsInventory.values()) {
	    	String id = reservation.getId();
	    	String nombre = reservation.getNombre();
	        int cantidad = reservation.getCantidad();
	        int dias = reservation.getDias();
	        int dia = reservation.getDia();
	        int mes = reservation.getMes();
	        int ano = reservation.getAno();

	        
	        csvContent.append(id).append(",")
	        		   .append(nombre).append(",")
	                   .append(cantidad).append(",")
	                   .append(dias).append(",")
	                   .append(dia).append(",")
	                   .append(mes).append(",")
	                   .append(ano).append("\n");

	    }

	    try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
	        bw.write(csvContent.toString());
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	////////////////////////////
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
