package prosecution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import model.Inventory;
import model.Room;
import model.Service;
import model.ServicesInventory;
public class ServicesInventoryController {
	ServicesInventory servInventory;

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
		servInventory.printKeys();
		
		

	}
}
