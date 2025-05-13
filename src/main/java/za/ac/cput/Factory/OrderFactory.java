package za.ac.cput.Factory;

import za.ac.cput.domain.Order;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

public class OrderFactory {

    public static Order createOrder(String orderId, String customerId, LocalDate orderDate, double totalAmount, int discountId) {
        if (Helper.isNullOrEmpty(orderId) || Helper.isNullOrEmpty(customerId) || Helper.isNullOrEmpty(String.valueOf(orderDate))) {
            return null;
        }


        return new Order.Builder()
                .setOrderId(orderId)
                .setCustomerId(customerId)
                .setOrderDate(orderDate)
                .setTotalAmount(totalAmount)
                .setDiscountId(discountId)
                .build();
    }
}
