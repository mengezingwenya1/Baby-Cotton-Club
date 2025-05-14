package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

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
    public static boolean isValidEmail(String email){
        EmailValidator validator = EmailValidator.getInstance();
        if (validator.isValid(email)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isValidStreetNumber(short streetNumber) {
        if (streetNumber < 1 || streetNumber > 99999) {
            return false;
        }
        return true;
    }
    public static boolean isValidPostalCode(short postalCode) {
        if (postalCode < 1000 || postalCode > 9999) {
            return false;
        }
        return true;
    }

}

