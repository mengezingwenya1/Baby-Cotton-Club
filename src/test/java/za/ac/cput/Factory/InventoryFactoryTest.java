/*
InventoryFactoryTest POJO Class
Author: O Ntsaluba
Student Number: 230741754
Date: 18 May 2025
*/
package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Inventory;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class InventoryFactoryTest {

    @Test
    void testCreateInventorySuccess() {
        Inventory inventory = InventoryFactory.createInventory(
                1001,
                2001,
                LocalDate.now(),
                "50 units",
                3001
        );

        assertNotNull(inventory);
        assertEquals(1001, inventory.getInventoryId());
        assertEquals(2001, inventory.getProductId());
        assertEquals("50 units", inventory.getStockAdded());
        assertEquals(3001, inventory.getSupplierId());
        assertEquals(LocalDate.now(), inventory.getReceivedDate());
        System.out.println(inventory);
    }

    @Test
    void testCreateInventoryWithNullDate() {
        Inventory inventory = InventoryFactory.createInventory(
                1002,
                2002,
                null,
                "100 units",
                3002
        );
        assertNull(inventory);
    }

    @Test
    void testCreateInventoryWithEmptyStock() {
        Inventory inventory = InventoryFactory.createInventory(
                1003,
                2003,
                LocalDate.now(),
                "",
                3003
        );
        assertNull(inventory);
    }

    @Test
    void testCreateInventoryWithInvalidIds() {
        Inventory inventory = InventoryFactory.createInventory(
                -1,
                0,
                LocalDate.now(),
                "40 units",
                -3003
        );
        assertNull(inventory);
    }
}
