package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Assert;

import prosecution.InventoryController;
import prosecution.RecepcionistProcess;
import model.Room;

public class TestInventoryController {

    private InventoryController inventoryController;

    @Before
    public void setUp() {
        inventoryController = new InventoryController();
    }

    @Test
    public void testLoadInventory() {
        inventoryController.loadinventory();

        // Verificar que el inventario se haya cargado correctamente
        assertNotNull(inventoryController.inventory);
        assertFalse(inventoryController.inventory.getInstance().isEmpty());
    }

    @Test
    public void testLoadInventoryWithIncorrectFormat() {
        // Simular la carga de un archivo CSV con formato incorrecto
       
        assertNull(inventoryController.inventory);
        assertTrue(inventoryController.inventory.getInstance().isEmpty());
    }

    @Test
    public void testLoadInventoryWithInvalidData() {
        // Simular la carga de un archivo CSV con datos inválidos
        
        assertNull(inventoryController.inventory);
        assertTrue(inventoryController.inventory.getInstance().isEmpty());
    }

    @Test
    public void testLoadInventoryWithEmptyFile() {
        // Simular la carga de un archivo CSV vacío
        
        assertNull(inventoryController.inventory);
        assertTrue(inventoryController.inventory.getInstance().isEmpty());
    }

    @Test
    public void testAddWithCsv() {
        String fileName = "Inventario";
        inventoryController.addWithCsv(fileName);

        // Verificar que las habitaciones se hayan agregado correctamente
        assertFalse(inventoryController.inventory.getInstance().isEmpty());
        Room room = RecepcionistProcess.consultarHabitación("1");
     // Verificar los datos de la habitación agregada
        Assert.assertEquals("1", room.getId());
        Assert.assertEquals("piso de arriba", room.getUbication());
        Assert.assertEquals("Suite", room.getType());
        Assert.assertFalse(room.getBalcony());
        Assert.assertTrue(room.getView());
        Assert.assertFalse(room.getKitchen());
        Assert.assertEquals(1, room.getBedsnumber());
        Assert.assertEquals("big", room.getSize());
        
    }

    @Test
    public void testAddWithCsvWithInvalidData() {
        String fileName = "habitaciones_invalidas";
        inventoryController.addWithCsv(fileName);

        // Verificar que no se hayan agregado habitaciones debido a datos inválidos
        assertTrue(inventoryController.inventory.getInstance().isEmpty());
    }

}

