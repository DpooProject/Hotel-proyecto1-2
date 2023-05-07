package prosecution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Comparator;
import model.EstandarRateMapStorage;
import model.Inventory;
import model.Room;
import model.SuiteDobleRateMapStorage;
import model.SuiteRateMapStorage;
import model.Rate;
public class RoomsRatesController {
	SuiteDobleRateMapStorage suiteDobleRates;
	SuiteRateMapStorage	suiteRates;
	EstandarRateMapStorage estandarRates;
	public void loadinventory() {
		List<String> roomTypes = new ArrayList<>();
		roomTypes.add("src/Memory/SuiteDobRates.csv");
		roomTypes.add("src/Memory/SuiteRates.csv");
		roomTypes.add("src/Memory/EstandarRates.csv");
		for (int i = 0; i < roomTypes.size(); i++) {
		String csvFile = roomTypes.get(i);
		String line;
		String csvSplitBy = ",";
		HashMap<LocalDate, Rate> rates = new TreeMap<>(Comparator.<LocalDate>naturalOrder().reversed());

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			// Ignorar la primera línea (encabezado)
			br.readLine();

			while ((line = br.readLine()) != null) {
				if (!line.isEmpty()) { // Verificar si la línea no está vacía
				
				String[] data = line.split(csvSplitBy);
				LocalDate startDate = LocalDate.parse(data[0]);
				LocalDate endDate = LocalDate.parse(data[1]);
				String type = data[2];
				Boolean mon = Boolean.parseBoolean(data[3]);
				Boolean tues = Boolean.parseBoolean(data[4]);
				Boolean wedn = Boolean.parseBoolean(data[5]);
				Boolean thur = Boolean.parseBoolean(data[6]);
				Boolean fri = Boolean.parseBoolean(data[7]);
				Boolean satu = Boolean.parseBoolean(data[8]);
				Boolean sun = Boolean.parseBoolean(data[9]);
				
				rates.put(id, habitacion);
			}
		} }catch (IOException e) {
			e.printStackTrace();
		}		
		
		}
	}
}
