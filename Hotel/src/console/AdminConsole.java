package console;

import java.time.LocalTime;

//Dependencies
import prosecution.AdminProcess;
import prosecution.InventoryController;
import prosecution.RestaurantMenuController;
import prosecution.ServicesInventoryController;

public class AdminConsole {
	InventoryController inveCont;
	ServicesInventoryController servCont;
	RestaurantMenuController restCont;
	AdminProcess adminProcc=new AdminProcess();
	Boolean updateInventory=false;
	Boolean updateServicesnventory=false;
	Boolean updateRestaurantMenu=false;
	// constructor
	public AdminConsole(InventoryController inveCont,ServicesInventoryController servCont,RestaurantMenuController restCont) {
		this.inveCont = inveCont;
		this.servCont=servCont;
		this.restCont=restCont;
	}

	private void showMenu() {

		System.out.println("Menu de Admin");
		System.out.println("\nSeleccione una opción:\n");
		System.out.println("1. Crear una nueva habitacion en el invenatario");
		System.out.println("2. Cargar nuevas habitaciones (o actualizar existentes) en el inventario con un archivo .CSV");
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
				System.out.println(opcion_seleccionada);
				if (opcion_seleccionada == 1) {
					System.out.println("cargando...");
					executeCreateRoom();
				} else if (opcion_seleccionada == 2) {
					System.out.println("seleccionaste la 2");
					executeAddWithCsv();
				} else if (opcion_seleccionada == 3) {
					System.out.println("cargando...");
					executeChangeServicesRate();
				}
				else if (opcion_seleccionada == 4) {
					System.out.println("cargando...");
					executeEditRestaurant();
				}
				else if (opcion_seleccionada == 5) {
					System.out.println("cargando...");
				}
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
		adminProcc.createroom(inveCont, id, ubication, type, balcony, view, kitchen, numberbeds, size);
		System.out.println("se ha creado la nueva habitacion en el inventario correctamente");
		this.updateInventory=true;
	}
	public void executeAddWithCsv() {
		String csvName = Console.input("Ingrese el nombre del archivo csv");
		adminProcc.addWithCsv(inveCont,csvName);
		this.updateInventory=true;
		
	}
	public void executeChangeServicesRate() {
		Boolean loop_flag=true;
		while (loop_flag) {
			servCont.printServicesInventory();//algo ilegal me parece
			String serviceName = Console.input("Ingrese el nombre del servicio al cual lequiere cambiar su tarifa: ");
			int newRate = Integer.parseInt(Console.input("Ingrese el nuevo valor de la tarifa"));
			adminProcc.changeServicesRates(servCont, serviceName, newRate);
			loop_flag = Boolean.parseBoolean(Console.input("¿Quiere editar otro servicio (true=si, false=salir de esta opcion)?"));			
		}
		this.updateServicesnventory=true;
	}
	public void executeEditRestaurant() {
		Boolean loop_flag=true;
		while (loop_flag) {
			restCont.printMenuKeys();//algo ilegal me parece
			String serviceName = Console.input("Ingrese el nombre del plato que quiere editar: ");
			int newRate = Integer.parseInt(Console.input("Ingrese el nuevo precio del plato"));
			LocalTime startTime=LocalTime.parse(Console.input("Ingrese la hora en la que comienza a estar disponible el plato"));
			LocalTime endTime=LocalTime.parse(Console.input("Ingrese la hora en la que termina de estar disponible el plato"));
			Boolean forRoom=Boolean.parseBoolean(Console.input("Quiere que el plato pueda ser tomado en la habitacion de un cliente?"));
			adminProcc.editMenu(restCont, serviceName, newRate, startTime, endTime, forRoom);
			loop_flag = Boolean.parseBoolean(Console.input("¿Quiere editar otro plato? (true=si, false=salir de esta opcion)?"));			
		}
		this.updateRestaurantMenu=true;
	}	
	public void closeApp() {
		System.out.println("Guardando cambios...");
		if (this.updateInventory==true) {
			inveCont.update();
		}
		if (this.updateServicesnventory==true) {
			servCont.update();
		}
		if (this.updateRestaurantMenu==true) {
			restCont.update();
		}
	}

}
