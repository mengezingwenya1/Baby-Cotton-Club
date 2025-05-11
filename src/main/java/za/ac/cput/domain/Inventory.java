/*
 * Inventory.java
 * Inventory POJO class
 * Author: O Ntsaluba (230741754)
 * Date: 11 May 2025
 */

package za.ac.cput.domain;

public class Inventory {

    private String inventoryId;
    private String productId;
    private String receivedDate;
    private int stockAdded;
    private String supplierId;

    public Inventory() {
    }

    private Inventory(Builder builder) {
        this.inventoryId = builder.inventoryId;
        this.productId = builder.productId;
        this.receivedDate = builder.receivedDate;
        this.stockAdded = builder.stockAdded;
        this.supplierId = builder.supplierId;
    }

    public String getInventoryId() {
        return inventoryId;
    }

    public String getProductId() {
        return productId;
    }

    public String getReceivedDate() {
        return receivedDate;
    }

    public int getStockAdded() {
        return stockAdded;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public static class Builder {
        private String inventoryId;
        private String productId;
        private String receivedDate;
        private int stockAdded;
        private String supplierId;

        public Builder setInventoryId(String inventoryId) {
            this.inventoryId = inventoryId;
            return this;
        }

        public Builder setProductId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder setReceivedDate(String receivedDate) {
            this.receivedDate = receivedDate;
            return this;
        }

        public Builder setStockAdded(int stockAdded) {
            this.stockAdded = stockAdded;
            return this;
        }

        public Builder setSupplierId(String supplierId) {
            this.supplierId = supplierId;
            return this;
        }

        @Override
        public String toString() {
            return "Inventory{" +
                    "inventoryId='" + inventoryId + '\'' +
                    ", productId='" + productId + '\'' +
                    ", receivedDate='" + receivedDate + '\'' +
                    ", stockAdded=" + stockAdded +
                    ", supplierId='" + supplierId + '\'' +
                    '}';
        }

        public Builder copy(Inventory inventory) {
            this.inventoryId = inventory.inventoryId;
            this.productId = inventory.productId;
            this.receivedDate = inventory.receivedDate;
            this.stockAdded = inventory.stockAdded;
            this.supplierId = inventory.supplierId;
            return this;
        }

        public Inventory build() {
            return new Inventory(this);
        }
    }
}
