package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.OrderLine;

import static org.junit.jupiter.api.Assertions.*;

class OrderLineFactoryTest {


    private static OrderLine o2 = OrderLineFactory.createOrderLine("OL123", "O123", "P123", 20, 200.0, 2);

    @Test
    public void testCreateOrderLineWithAllAttributes() {
        assertNotNull(o2);
        System.out.println(o2.toString());
    }
}

