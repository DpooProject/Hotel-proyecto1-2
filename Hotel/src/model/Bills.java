package model;

import java.util.HashMap;

public class Bills {
    private HashMap<String, Integer> roomBills;

    public Bills() {
        roomBills = new HashMap<String, Integer>();
    }

    public void addRoomBill(String roomId, int billAmount) {
        roomBills.put(roomId, billAmount);
    }

    public int getRoomBill(String roomId) {
        return roomBills.get(roomId);
    }

    public void removeRoomBill(String roomId) {
        roomBills.remove(roomId);
    }

    public void clearBills() {
        roomBills.clear();
    }

    public HashMap<String, Integer> getAllBills() {
        return roomBills;
    }
    
    public boolean addAmountToRoomBill(String roomId, int amountToAdd) {
        if (!roomBills.containsKey(roomId)) {
            return false; // la habitación no existe en el mapa, retornar false
        }
        int currentAmount = roomBills.get(roomId); // obtener el valor actual de la habitación
        int newAmount = currentAmount + amountToAdd; // sumar la cantidad deseada
        roomBills.put(roomId, newAmount); // actualizar el valor en el mapa
        return true; // operación exitosa, retornar true
    }
    
    public int getRoomBillAmount(String roomId) {
        if (!roomBills.containsKey(roomId)) {
            return -1; // la habitación no existe en el mapa, retornar -1
        }
        return roomBills.get(roomId); // retornar el valor actual de la habitación
    }
    public boolean payAmountToRoomBill(String roomId, int amountToAdd) {
        if (!roomBills.containsKey(roomId)) {
            return false; // la habitación no existe en el mapa, retornar false
        }
        int currentAmount = roomBills.get(roomId); // obtener el valor actual de la habitación
        int newAmount = currentAmount - amountToAdd; // sumar la cantidad deseada
        roomBills.put(roomId, newAmount); // actualizar el valor en el mapa
        return true; // operación exitosa, retornar true
    }


}
