package prosecution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.HashMap;
import model.Dish;
import model.RestaurantMenu;

public class RestaurantMenuController {
	RestaurantMenu menu;

	public void loadMenu() {
		String csvFile = "src/Memory/Restaurant.csv";
		String line;
		String csvSplitBy = ",";
		HashMap<String, Dish> menu = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			// Ignorar la primera línea (encabezado)
			br.readLine();

			while ((line = br.readLine()) != null) {
				if (!line.isEmpty()) { // Verificar si la línea no está vacía

					String[] data = line.split(csvSplitBy);
					String dishName = data[0];
					int price = Integer.parseInt(data[1]);
					LocalTime startTime = LocalTime.parse(data[2]);
					LocalTime endTime = LocalTime.parse(data[3]);
					Boolean forRoom = Boolean.parseBoolean(data[4]);
					Dish auxDish = new Dish(dishName, price, startTime, endTime, forRoom);
					menu.put(dishName, auxDish);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.menu = RestaurantMenu.getRestaurantMenu(menu);
	}
	public void editDish(String name, int price, LocalTime startTime, LocalTime endTime, Boolean forRoom) {
		Dish auxdish= menu.getDish(name);
		auxdish.setName(name);
		auxdish.setPrice(price);
		auxdish.setStartTime(startTime);
		auxdish.setEndTime(endTime);
		auxdish.setForRoom(forRoom);
		menu.updateService(name, auxdish); 
		
	}

public void update() {
    String csvFile = "src/Memory/Restaurant.csv";
    String csvHeader = "nombreDelPlato,Precio,horaInicio,horaFinal,alCuarto\n";
    StringBuilder csvContent = new StringBuilder(csvHeader);
    for (Dish dish : menu.getInstance().values()) {
        String dishName = dish.getName();
        int price = dish.getPrice(); 
		LocalTime starTime=dish.getStartTime();
		LocalTime endTime=dish.getEndTime();
		Boolean forRoom=dish.getForRoom();
        csvContent.append(dishName).append(",")
        		  .append(price).append(",")
        		  .append(starTime).append(",")
        		  .append(endTime).append(",")
                   .append(forRoom).append("\n");
    }

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
        bw.write(csvContent.toString());
    } catch (IOException e) {
        e.printStackTrace();
    }
}
//Auxiliary methods
public void printMenuKeys() {
	menu.printKeys();
}
}
