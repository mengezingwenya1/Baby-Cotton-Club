/*
Baby Cotton Club
Order POJO Class
Author: Tsireledzo Netshilonwe
Student Number: 230666426
Date: 2025/05/10
*/
package za.ac.cput.domain;

import java.time.LocalDate;

public class Order {
    private String orderId;
    private String customerId;
    private LocalDate orderDate;
    private double totalAmount;
    private OrderLine orderLine;


    public Order(){

    }

    private Order(Builder builder){
        this.orderId = builder.orderId;
        this.customerId = builder.customerId;
        this.orderDate = builder.orderDate;
        this.totalAmount = builder.totalAmount;
        this.orderLine = builder.orderLine;
    }
    public String getOrderId() {
        return orderId;
    }
    public String getCustomerId() {
        return customerId;
    }
    public LocalDate getOrderDate() {
        return orderDate;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public OrderLine getOrderLine() {
        return orderLine;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", orderDate=" + orderDate +
                ", totalAmount=" + totalAmount +
                ", orderLine=" + orderLine +
                '}';
    }

    public static class Builder {
        private String orderId;
        private String customerId;
        private LocalDate orderDate;
        private double totalAmount;
        private OrderLine orderLine;

        public Builder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setOrderDate(LocalDate orderDate) {
            this.orderDate = orderDate;
            return this;
        }

        public Builder setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Builder setOrderLine(OrderLine orderLine) {
            this.orderLine = orderLine;
            return this;
        }
        public Builder copy(Order order) {
            this.orderId = order.orderId;
            this.customerId = order.customerId;
            this.orderDate = order.orderDate;
            this.totalAmount = order.totalAmount;
            this.orderLine = order.orderLine;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}



