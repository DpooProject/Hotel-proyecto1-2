package prosecution;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.io.BufferedReader;
import model.Room;

public class InventoryController {
	private static HashMap<String,Room>;
	
	//methods
	HashMap<String,Room> loadinventory(){
        String csvFile = "src/Memory/inventario.csv";
        String line;
        String csvSplitBy = ",";
        HashMap<String, Room> habitaciones = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Ignorar la primera línea (encabezado)
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] datos = line.split(csvSplitBy);

                String id = datos[0];
                String ubicacion = datos[1];
                String tipo = datos[2];
                boolean balcon = Boolean.parseBoolean(datos[3]);
                boolean vista = Boolean.parseBoolean(datos[4]);
                int numeroCamas = Integer.parseInt(datos[5]);
                String tamano = datos[6];

                Room habitacion = new Room(id, ubicacion, tipo, balcon, vista, numeroCamas, tamano);
                habitaciones.put(id, habitacion);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Prueba: imprimir las habitaciones
        for (String id : habitaciones.keySet()) {
            Room habitacion = habitaciones.get(id);
            String tipo=habitacion.getTipo();
            String ubicacion=habitacion.getUbiacion();
            System.out.println("Habitación " + id + ": " + tipo + ", " +ubicacion);
        }
		return null;
		
	}
	//agregar habitacion
	
}
