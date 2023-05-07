package console;

import prosecution.AdminProcess;
import prosecution.RecepcionistProcess;

import java.sql.Date;

import model.Room;

public class RecepcionistConsole {

	public void showMenu() {
		
		System.out.println("\nSeleccione una opción:\n");
		System.out.println("1. Consultar habitación por ID");
		System.out.println("2. Reservar habitación");
		System.out.println("3. Cancelar reserva");
		System.out.println("4. Generar factura");
		System.out.println("5. Registrar entrada");
		System.out.println("6. Registrar salida");
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
					ejecutarConsultarHabitacion();
				} else if (opcion_seleccionada == 2) {
					System.out.println("cargando...");
					ejecutarReservarHabitacion();
				} else if (opcion_seleccionada == 3){
					System.out.println("cargando...");
					ejecutarCancelarReserva();
				}else if (opcion_seleccionada == 4){
					System.out.println("cargando...");
				}else if (opcion_seleccionada == 5)
					System.out.println("cargando...");
				else if (opcion_seleccionada == 6){
					System.out.println("cargando...");
				}else if (opcion_seleccionada == 7) {
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

	public void ejecutarConsultarHabitacion() {
		String id=Console.input("Ingrese el id de la habitacion que desea consultar");
		Room room = RecepcionistProcess.consultarHabitación(id);
		System.out.println("El id es: " + room.getId());
		System.out.println("La ubicación es: " + room.getUbicacion());
		System.out.println("El tipo de habitación es: " + room.getTipo());
		System.out.println("Tiene balcón: " + room.getBalcon());
		System.out.println("Tiene vista: " + room.getVista());
		System.out.println("Tiene cocina: " + room.getCocina());
		System.out.println("Número de camas: " + room.getNumeroCamas());
		System.out.println("Tamaño de las camas: " + room.getTamano());

		}

	public void ejecutarReservarHabitacion(){
		String nombre=Console.input("Ingrese su nombre");
		int cantidad=Integer.parseInt(Console.input("Ingrese la cantidad de personas"));
		int dias=Integer.parseInt(Console.input("Ingrese la cantidad de dias"));
		int dia=Integer.parseInt(Console.input("Ingrese el día de la reserva"));
		int mes=Integer.parseInt(Console.input("Ingrese el mes de la reserva"));
		int ano=Integer.parseInt(Console.input("Ingrese el año de la reserva"));
		RecepcionistProcess.reservarHabitacion(nombre, cantidad, dias, dia, mes, ano);
		System.out.println("La reservación fue realizada: ");

		}

	public void ejecutarCancelarReserva(){
		String id = Console.input("Ingrese el id de la reserva");
		int dia=Integer.parseInt(Console.input("Ingrese el día actual"));
		int mes=Integer.parseInt(Console.input("Ingrese el mes actual"));
		int ano=Integer.parseInt(Console.input("Ingrese el año actual"));
		boolean cancelado = RecepcionistProcess.CancelarReserva(id, dia, mes, ano);
		if (cancelado){
			System.out.println("La reserva fue cancelada");}
		else{
			System.out.println("La reserva no fue realizada debido a que faltan menos de 2 días para el ingreso");}
			
	}
}
