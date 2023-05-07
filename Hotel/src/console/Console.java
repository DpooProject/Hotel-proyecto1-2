package console;
//importar dependencias
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Scanner;
//importar clases
import prosecution.GeneralData;
import prosecution.InventoryController;
import prosecution.UserDataController;
import prosecution.Login;
import prosecution.RestaurantMenuController;
import prosecution.ServicesInventoryController;

public class Console {
	Begginer beginner= new Begginer();
	public void iniciar() {
		//Carga los logins
		beginner.beginLogin();
		InventoryController inveCont=beginner.beginInventory();
		ServicesInventoryController servCont=beginner.beginServiceInventory();
		RestaurantMenuController restCont=beginner.beginRestaurantMenu();
		beginner.beginReservations();
		// Saludar al usuario
		System.out.println("¡Bienvenido!");
		String flag="";
		Login log= new Login();
		while (flag != "erróneo, intentelo de nuevo") {
			//pide login
			String login = input("Por favor, ingrese su login");

			// Pedir al usuario su contraseña
			String password = input("Por favor, ingrese su contraseña");
			System.out.println(login);
			System.out.println(password);
			String tipo =log.hacerlogin(login,password);
			System.out.println(tipo);
		if (tipo.equals("admin")) {
		    AdminConsole adminMenu = new AdminConsole(inveCont,servCont,restCont);
		    adminMenu.ejecutar_proceso();
		} else if (tipo.equals("general")) {
		    EmployerConsole generalMenu = new EmployerConsole();
		    generalMenu.ejecutar_proceso();
		} else if (tipo.equals("recepcion")) {
		    RecepcionistConsole receptionMenu = new RecepcionistConsole (inveCont);
		    receptionMenu.ejecutar_proceso();}
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
	public static void main(String[] args) {
		Console consola = new Console();
		consola.iniciar();
	}

}
