package prosecution;

import model.Room;
import model.Reservation;
import prosecution.InventoryController;
import java.util.*;

public class RecepcionistProcess {

    public static Room consultarHabitación(String id){
        HashMap<String, Room> rooms = InventoryController.habitaciones;
        Room value = habitaciones.get(id);
        return value;
     }

    public static Reservation reservarHabitacion(String nombre, int cantidad, int dias, int dia, int mes, int ano){
        Reservation reservation = new Reservation(nombre, cantidad, dias, dia, mes, ano);
        return reservation;      
    }

    public static boolean CancelarReserva(String id, int diaa, int mesa, int anoa){
        HashMap<String, Reservation> reservations = InventoryController.reservaciones;
        Reservation value = reservaciones.get(id);
        int ano = value.getAno();
        int mes = value.getMes();
        int dia = value.getDia();
        boolean cancelado = false;

        if (ano==anoa){
            if (mes==mesa){
                if ((diaa-dia)<=2){
                    cancelado = true;}
                else if(mes>mesa){
                    cancelado = true;}}}                  
                
        else if(ano>anoa){
            cancelado = true;}
        
        if (cancelado){
            reservations.remove(id);}
        
        return cancelado;
    }
    

}
