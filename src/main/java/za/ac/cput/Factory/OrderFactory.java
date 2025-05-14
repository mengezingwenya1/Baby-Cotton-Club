package za.ac.cput.Factory;

import za.ac.cput.domain.Order;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

public class OrderFactory {

    public static Order createOrder(String orderId, String customerId, String orderDateStr, double totalAmount, int discountId) {

        if (Helper.isNullOrEmpty(orderId) || Helper.isNullOrEmpty(customerId)) {
            return null;
        }

        LocalDate orderDate = Helper.getOrderDate(orderDateStr);
        return new Order.Builder()
                .setOrderId(orderId)
                .setCustomerId(customerId)
                .setOrderDate(orderDate)
                .setTotalAmount(totalAmount)
                .setDiscountId(discountId)
                .build();
    }
}
