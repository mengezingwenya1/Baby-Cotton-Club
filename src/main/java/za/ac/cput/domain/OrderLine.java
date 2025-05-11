package za.ac.cput.domain;

public class OrderLine {
    private String orderLineId;
    private String orderId;
    private String productId;
    private int quantity;
    private double unitPrice;
    private double subTotal;

    public  OrderLine(){

    }
    private OrderLine(Builder builder) {
        this.orderLineId = builder.orderLineId;
        this.orderId = builder.orderId;
        this.productId = builder.productId;
        this.quantity = builder.quantity;
        this.unitPrice = builder.unitPrice;
        this.subTotal = builder.subTotal;
    }
    public String getOrderLineId() {
        return orderLineId;
    }
    public String getOrderId() {
        return orderId;
    }
    public String getProductId() {
        return productId;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public double getSubTotal() {
        return subTotal;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "orderLineId='" + orderLineId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", productId='" + productId + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", subTotal=" + subTotal +
                '}';
    }
    public static class Builder {
        private String orderLineId;
        private String orderId;
        private String productId;
        private int quantity;
        private double unitPrice;
        private double subTotal;

        public Builder setOrderLineId(String orderLineId) {
            this.orderLineId = orderLineId;
            return this;
        }

        public Builder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder setProductId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setUnitPrice(double unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        public Builder setSubTotal(double subTotal) {
            this.subTotal = subTotal;
            return this;
        }

        public OrderLine build() {
            return new OrderLine(this);
        }
    }
}
/*
OrderLine POJO Class
Author: Tsireledzo Netshilonwe
Student Number: 230666426
Date: 2025/05/10
*/

