package za.ac.cput.util;

import java.time.LocalDate;

public class Helper {


    public static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }


    public static LocalDate getOrderDate(String orderDate) {
        int year = Integer.parseInt(orderDate.substring(0, 4));
        int month = Integer.parseInt(orderDate.substring(4, 6));
        int day = Integer.parseInt(orderDate.substring(6, 8));
        return LocalDate.of(year, month, day);
    }
    public static double calculateSubTotal(int quantity, double unitPrice) {
        return quantity * unitPrice;
    }
}
