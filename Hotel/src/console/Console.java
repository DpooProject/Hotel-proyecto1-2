package console;

import java.io.IOException;
import java.util.Scanner;

import prosecution.GeneralData;
import prosecution.Loader;
import prosecution.Login;

public class Console {

	public static void main(String[] args) {
		Console consola = new Console();
		consola.iniciar();
	}
	
	

	public void iniciar() {
		//Crea los datos de los usuarios vacios
		GeneralData Userdata = new GeneralData();
		
		//Carga los logins
		Loader loader = new Loader();
	    try {
			Userdata = loader.readCSV("src/Data/Logins.csv");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	    
	    
		// Saludar al usuario
		System.out.println("¡Bienvenido!");

		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Pedir al usuario su login
		System.out.print("Por favor, ingrese su login: ");
		String login = scanner.nextLine();

		// Pedir al usuario su contraseña
		System.out.print("Por favor, ingrese su contraseña: ");
		String password = scanner.nextLine();

		Login log= new Login();
		String tipo =log.hacerlogin(login,password,Userdata);
		System.out.println(tipo);

		// Cerrar el objeto Scanner
		scanner.close();
	}

}
