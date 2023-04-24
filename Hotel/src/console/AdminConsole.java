package console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdminConsole {

	private void showMenu() {

		System.out.println("Menu de Admin");
		System.out.println("\nSeleccione una opción:\n");
		System.out.println("1. Crear una nueva habitacion en el invenatario");
		System.out.println("2. Cargar nuevas habitaciones en el inventario con un archivo .CSV");
		System.out.println("3. Actualizar informacion de habitaciones del inventario con un archivo .CSV");
		System.out.println("4. Cambiar tarifa de los servicios del hotel");
		System.out.println("5. Editar menu del restaurante");
		System.out.println("6. Cargar las tarifas por tipo de cuarto");
		System.out.println("7. Cerrar sesion\n");
		ejecutar_proceso();
	}

	public void ejecutar_proceso() {
		boolean continuar = true;
		while (continuar) {
			try {
				showMenu();

				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
				if (opcion_seleccionada == 1) {
					System.out.println("cargando...");
				} else if (opcion_seleccionada == 2) {
					System.out.println("cargando...");
				} else if (opcion_seleccionada == 3)
					System.out.println("cargando...");
				else if (opcion_seleccionada == 4)
					System.out.println("cargando...");
				else if (opcion_seleccionada == 5)
					System.out.println("cargando...");
				else if (opcion_seleccionada == 6)
					System.out.println("cargando...");
				else if (opcion_seleccionada == 7) {
					System.out.println("Cerrando su sesion ...");
					continuar = false;
				} else {
					System.out.println("Por favor seleccione una opción válida.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}

	}
	
	//implementacion de input
	public static String input(String mensaje) {
		try {
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		} catch (IOException e) {
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
}
