package prosecution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import model.Inventory;
import model.Room;
import model.Service;
import model.ServicesInventory;
public class ServicesInventoryController {
	//Attributes
	ServicesInventory servInventory;
	//getters 
	public ServicesInventory getServInventory() {
		return servInventory;
	}
	// methods
	public void loadServiceinventory() {
		String csvFile = "src/Memory/listServices.csv";
		String line;
		String csvSplitBy = ",";
		HashMap<String, Service> services = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			// Ignorar la primera línea (encabezado)
			br.readLine();

			while ((line = br.readLine()) != null) {
				if (!line.isEmpty()) { // Verificar si la línea no está vacía
				
				String[] data = line.split(csvSplitBy);
				String serviceName = data[0];
				int rate = Integer.parseInt(data[1]);
				Service auxService = new Service(serviceName,rate);
				services.put(serviceName, auxService);
			}
		} }catch (IOException e) {
			e.printStackTrace();
		}
		this.servInventory = ServicesInventory.getServiceInventory(services);
	}
	public void changeRate(String name, int rate) {
		Service auxservice= servInventory.getService(name);
		auxservice.setRate(rate);
		servInventory.updateService(name, auxservice); 
		
	}
	public void update() {
	    String csvFile = "src/Memory/listServices.csv";
	    String csvHeader = "Service,rate\n";
	    StringBuilder csvContent = new StringBuilder(csvHeader);
	    for (Service service : servInventory.getInstance().values()) {
	        String serviceName = service.getName();
	        int rate = service.getRate();        
	        csvContent.append(serviceName).append(",")
	                   .append(rate).append("\n");

	    }

	    try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
	        bw.write(csvContent.toString());
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	//Auxiliary methods
	public void printServicesInventory() {
		servInventory.printKeys();
	}

	/*
	 * public int inventoryLength() { return
	 * servInventory.getInstance().keySet().size(); }
	 */
 
}