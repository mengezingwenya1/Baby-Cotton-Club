/**
 * BabyCottonClub
 * Product.java
 * Author : Mengezi Junior Ngwenya - 230023967
 * Date : 18 May 2025
 */

package za.ac.cput.Factory;

import za.ac.cput.domain.Customer;
import za.ac.cput.util.Helper;

public class CustomerFactory {


    public static Customer createCustomer(int customerId, String firstName, String lastName, String email, String phoneNumber) {
        if(Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName)
                || Helper.isNullOrEmpty(phoneNumber)) {
            return null;
        }
        if (!Helper.isValidEmail(email)) {
            return null;
        }

        return new Customer.Builder()
                .setCustomerId(customerId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPhoneNumber(phoneNumber)
                .build();

    }

}
