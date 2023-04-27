package console;
//Dependencies
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import prosecution.AdminProcess;


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
	}

	public void ejecutar_proceso() {
		boolean continuar = true;
		while (continuar) {
			try {
				showMenu();

				int opcion_seleccionada = Integer.parseInt(Console.input("Por favor seleccione una opción"));
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
	
	public void ejecutarCrearHabitacion() {
		String id=Console.input("Ingrese el id de la nueva habitacion");
		String ubication=Console.input("Ingrese la ubicacion de la nueva habitacion");
		String type=Console.input("Ingrese el tipo de habitacion (Suite, Estandar o Suite doble ) de la nueva habitacion");
		String specials=Console.input("Ingrese descripcion de caracteristicas especiales(balcon,vista,cocina integrada");
		int numbersbed=Integer.parseInt(Console.input("Ingrese el numero de camas de la habitacion"));
		ArrayList<Integer> beds=new ArrayList<>();		
		int i=1;
		while(i<=numbersbed ) {
			System.out.println("1. Big");
			System.out.println("2. Medium");
			System.out.println("3. Small");
			int size=Integer.parseInt(Console.input("Ingrese una opcion para el tamaño de la "+i+" cama de la habitacion (Big,Medium,Small)"));
			if (size != 1 & size !=2 & size !=3) {
				System.out.println("Ingrese una opcion correcta");
			}
			else{
				beds.add(size);
				System.out.println(beds); 
			    i=i+1;
			}
		}
		i=1;
		String[] sizeid = new String[beds.size()];
	for (Integer n:beds) {
		sizeid[i-1]=Integer.toString(n);
		i=i+1;
	}
		AdminProcess.createroom(id,ubication,type,specials,beds,sizeid);
		System.out.println("se ha creado la nueva habitacion en el inventario correctamente");		
		}

}


