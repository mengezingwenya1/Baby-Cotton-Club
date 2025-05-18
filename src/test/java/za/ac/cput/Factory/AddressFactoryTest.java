package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Address;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AddressFactoryTest {


    private AddressFactory addressFactory;
    private static Address address = AddressFactory.createAddress(
            1256,
            "Bush St",
            (short) 123,
            "Soweto",
            "Johannesburg",
            (short) 1634,
            "Gauteng"
    );
    @Test
    void createAddress() {
        assertNotNull(address);
        System.out.println(address);
    }
}
