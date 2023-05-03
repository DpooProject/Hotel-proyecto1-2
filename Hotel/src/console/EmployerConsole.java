package console;
import java.util.Scanner;

import prosecution.EmployerProcess;

public class EmployerConsole {

	public void showMenu() {

		System.out.println("\nSeleccione una opción:\n");
		System.out.println("1. Registrar Consumos");
		System.out.println("2. Registar Pagos");
	}

	public void ejecutar_proceso() {
		boolean continuar = true;
		while (continuar) {
			try {
				showMenu();

				int opcion_seleccionada = Integer.parseInt(Console.input("Por favor seleccione una opción"));
				if (opcion_seleccionada == 1) {
					System.out.println("cargando...");
					Scanner scanner = new Scanner(System.in);
			        // Preguntar el ID de la habitación
			        System.out.print("Ingrese el ID de la habitación: ");
			        String roomId = scanner.nextLine();
			        // Preguntar la cantidad de dinero a cargar
			        System.out.print("Ingrese el monto a cargar: ");
			        int amountToAdd = scanner.nextInt();
			        EmployerProcess employerProcess = new EmployerProcess();
					employerProcess.addAmountToRoomBill(roomId, amountToAdd);
			        scanner.nextLine(); 
					
				} else if (opcion_seleccionada == 2) {
					System.out.println("cargando...");
					Scanner scanner = new Scanner(System.in);
			        // Preguntar el ID de la habitación
			        System.out.print("Ingrese el ID de la habitación: ");
			        String roomId = scanner.nextLine();
			        // Preguntar la cantidad de dinero a cargar
			        System.out.print("Ingrese el monto a pargar: ");
			        int amountToAdd = scanner.nextInt();
			        EmployerProcess employerProcess = new EmployerProcess();
					employerProcess.payAmountToRoomBill(roomId, amountToAdd);
			        scanner.nextLine(); 
				} else if (opcion_seleccionada == 3) {
					System.out.println("cargando...");
				}

			} catch (NumberFormatException e) {
				System.out.println("Debe seleccionar uno de los números de las opciones.");

			}
		}
	}
}
