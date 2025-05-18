package za.ac.cput.Factory;

import za.ac.cput.domain.Inventory;
import za.ac.cput.util.Helper;
import java.util.Date;

public class InventoryFactory {

    public static Inventory createInventory(int inventoryId, int productId, Date receivedDate,
                                            String stockAdded, int supplierId) {
        if (Helper.isNullOrEmpty(stockAdded) || receivedDate == null) {
            return null;
        }

        if (!Helper.isValidId(inventoryId) || !Helper.isValidId(productId) ||
                !Helper.isValidId(supplierId)) {
            return null;
        }

        return new Inventory.Builder()
                .setInventoryId(inventoryId)
                .setProductId(productId)
                .setReceivedDate(receivedDate)
                .setStockAdded(stockAdded)
                .setSupplierId(supplierId)
                .build();
    }
}