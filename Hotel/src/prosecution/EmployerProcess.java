package prosecution;

import model.Bills;
public class EmployerProcess {
    private Bills bills;

    public EmployerProcess() {
        bills = new Bills();
    }

    public boolean addAmountToRoomBill(String roomId, int amountToAdd) {
        return bills.addAmountToRoomBill(roomId, amountToAdd);
    }

    public int getRoomBillAmount(String roomId) {
        return bills.getRoomBillAmount(roomId);
    }
    
    public boolean payAmountToRoomBill(String roomId, int amountToAdd) {
        return bills.payAmountToRoomBill(roomId, amountToAdd);
    }
   

    // Otros métodos de la clase EmployerProcess

    // ...

}
