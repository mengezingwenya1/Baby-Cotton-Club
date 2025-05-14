package za.ac.cput.Factory;

import za.ac.cput.domain.Address;
import za.ac.cput.util.Helper;

public class AddressFactory {

    public static Address createAddress(int addressId,String streetName,short streetNumber, String suburb, String city, short postalCode, String province) {
            if (Helper.isNullOrEmpty(streetName) || Helper.isNullOrEmpty(suburb)
                    || Helper.isNullOrEmpty(city) || Helper.isNullOrEmpty(province)) {
                return null;
            }
            if(!Helper.isValidPostalCode(postalCode)) {
                return null;

            }
            if(!Helper.isValidStreetNumber(streetNumber)){
                return null;
            }



            return new Address.Builder()
                    .setAddressId(addressId)
                    .setStreetName(streetName)
                    .setStreetNumber(streetNumber)
                    .setSuburb(suburb)
                    .setCity(city)
                    .setPostalCode(postalCode)
                    .setProvince(province)
                    .build();
        }

    }

