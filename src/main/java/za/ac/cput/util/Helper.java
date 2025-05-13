package za.ac.cput.util;

import java.time.LocalDate;

public class Helper {


    public static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }


    public static LocalDate getOrderDate(String orderDate) {
        int year = Integer.parseInt(orderDate.substring(0, 2));
        int month = Integer.parseInt(orderDate.substring(2, 4));
        int day = Integer.parseInt(orderDate.substring(4, 6));
        return LocalDate.of(year, month, day);
    }
}
