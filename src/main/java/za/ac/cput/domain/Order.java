/*
Baby Cotton Club
Order POJO Class
Author: Tsireledzo Netshilonwe
Student Number: 230666426
Date: 2025/05/10
*/
package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    protected String orderId;
    protected String customerId;
    protected LocalDate orderDate;
    protected double totalAmount;
    protected int discountId;



    protected Order(){

    }

    private Order(Builder builder){
        this.orderId = builder.orderId;
        this.customerId = builder.customerId;
        this.orderDate = builder.orderDate;
        this.totalAmount = builder.totalAmount;
        this.discountId = builder.discountId;
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
    public int getDiscountId() {
        return discountId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", orderDate=" + orderDate +
                ", totalAmount=" + totalAmount +
                ", discountId=" + discountId +
                '}';
    }

    public static class Builder {
        private String orderId;
        private String customerId;
        private LocalDate orderDate;
        private double totalAmount;
        private int discountId;

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
        public Builder setDiscountId(int discountId) {
            this.discountId = discountId;
            return this;
        }
        public Builder copy(Order order) {
            this.orderId = order.orderId;
            this.customerId = order.customerId;
            this.orderDate = order.orderDate;
            this.totalAmount = order.totalAmount;
            this.discountId = order.discountId;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}



