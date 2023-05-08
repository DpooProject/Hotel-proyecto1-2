package prosecution;

import model.Room;
import model.Bills;
import model.Reservation;
import prosecution.InventoryController;
import java.util.*;

public class RecepcionistProcess {
	static HashMap<String, Reservation> reservations = InventoryController.reservationsInventory;
    public static Room consultarHabitación(String id){
        HashMap<String, Room> rooms = InventoryController.inventory.getInstance();
        Room value = rooms.get(id);
        return value;
     }

    public static Reservation reservarHabitacion(String id,String nombre, int cantidad, int dias, int dia, int mes, int ano){
        Reservation reservation = new Reservation(id,nombre, cantidad, dias, dia, mes, ano,false,false);
        reservations.put(id, reservation);
        return reservation;      
    }

    public static boolean CancelarReserva(String id, int diaa, int mesa, int anoa){
        HashMap<String, Reservation> reservations = InventoryController.reservationsInventory;
        Reservation value = reservations.get(id);
        int ano = value.getAno();
        int mes = value.getMes();
        int dia = value.getDia();
        boolean cancelado = false;

        if (ano==anoa){
            if (mes==mesa){
                if ((diaa-dia)>=2){
                    cancelado = true;}
                else if(mes>mesa){
                    cancelado = true;}}}                  
                
        else if(ano>anoa){
            cancelado = true;}
        
        if (cancelado){
            reservations.remove(id);}
        
        return cancelado;
    }

	
	public static void registrarLlegada(String id) {
		Reservation value = reservations.get(id);
        value.setLlegada(true);
		
	}

	public static void registrarSalida(String id) {
		Reservation value = reservations.get(id);
        value.setSalida(true);
	}
    

}

