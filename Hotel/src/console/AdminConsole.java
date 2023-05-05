package console;

//Dependencies
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import prosecution.AdminProcess;
import prosecution.InventoryController;

public class AdminConsole {
	InventoryController inveCont;
	Boolean updateInventory=false;
	// constructor
	public AdminConsole(InventoryController inveCont) {
		this.inveCont = inveCont;
	}

	private void showMenu() {

		System.out.println("Menu de Admin");
		System.out.println("\nSeleccione una opción:\n");
		System.out.println("1. Crear una nueva habitacion en el invenatario");
		System.out.println(
				"2. Cargar nuevas habitaciones (o actualizar existentes) en el inventario con un archivo .CSV");
		System.out.println("3. Cambiar tarifa de los servicios del hotel");
		System.out.println("4. Editar menu del restaurante");
		System.out.println("5. Cargar las tarifas por tipo de cuarto");
		System.out.println("6. Cerrar sesion\n");
	}

	public void ejecutar_proceso() {
		boolean continuar = true;
		while (continuar) {
			try {
				showMenu();

				int opcion_seleccionada = Integer.parseInt(Console.input("Por favor seleccione una opción"));
				if (opcion_seleccionada == 1) {
					System.out.println("cargando...");
					executeCreateRoom();
				} else if (opcion_seleccionada == 2) {
					System.out.println("cargando...");
				} else if (opcion_seleccionada == 3)
					System.out.println("cargando...");
				else if (opcion_seleccionada == 4)
					System.out.println("cargando...");
				else if (opcion_seleccionada == 5)
					System.out.println("cargando...");
				else if (opcion_seleccionada == 6) {
					System.out.println("Cerrando su sesion ...");
					continuar = false;
					closeApp();
				} else {
					System.out.println("Por favor seleccione una opción válida.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}

	}

	public void executeCreateRoom() {
		String id = Console.input("Ingrese el id de la nueva habitacion");
		String ubication = Console
				.input("Ingrese la ubicacion de la nueva habitacion (Primer piso, Segundo piso, Tercer piso)");
		String type = Console
				.input("Ingrese el tipo de habitacion (Suite, Estandar o Suite doble ) de la nueva habitacion");
		Boolean balcony = Boolean.parseBoolean(Console.input("¿Quiere que su habitacion tenga balcón?"));
		Boolean view = Boolean.parseBoolean(Console.input("¿Quiere que su habitacion tenga vista?"));
		Boolean kitchen = Boolean.parseBoolean(Console.input("¿Quiere que su habitacion tenga cocina integrada?"));
		int numberbeds = Integer.parseInt(Console.input("Ingrese el numero de camas de la habitacion"));
		String size = Console.input("Ingrese el tamaño de la/s habitacion/es (Big, Medium, Small) ");
		AdminProcess.createroom(inveCont, id, ubication, type, balcony, view, kitchen, numberbeds, size);
		System.out.println("se ha creado la nueva habitacion en el inventario correctamente");
		this.updateInventory=true;
	}

	public void closeApp() {
		if (this.updateInventory==true) {
			inveCont.update();
		}
	}

}
