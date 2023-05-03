package model;

import java.util.ArrayList;

public class Room {
	//Attributes
	private String tipo;
	private String ubicacion;
	public Room(String id, String ubicacion, String tipo, boolean balcon, boolean vista, int numeroCamas,
			String tamano) {
		// TODO Auto-generated constructor stub
	}

	ArrayList<Bed> beds = new ArrayList<>();
	//methods

	public String getTipo() {
		return tipo;
	}
	public String getUbiacion() {
		return ubicacion;
	}

	
}
