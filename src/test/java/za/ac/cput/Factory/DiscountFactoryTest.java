/*
 * DiscountFactoryTest POJO Class
 * Author: O Ntsaluba (230741754)
 * Date: 18 May 2025
 */

package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Discount;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class DiscountFactoryTest {

    @Test
    void testCreateDiscountSuccess() {
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusDays(1); // +1 day

        Discount discount = DiscountFactory.createDiscount(
                101,
                "Summer Sale",
                "Percentage",
                "15%",
                startDate,
                endDate
        );

        assertNotNull(discount);
        assertEquals(101, discount.getDiscountId());
        assertEquals("Summer Sale", discount.getDiscountName());
        assertEquals("Percentage", discount.getDiscountType());
        assertEquals("15%", discount.getDiscountValue());
        assertEquals(startDate, discount.getStartDate());
        assertEquals(endDate, discount.getEndDate());
        System.out.println(discount);
    }

    @Test
    void testCreateDiscountWithInvalidDateRange() {
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.minusDays(1); // Past date

        Discount discount = DiscountFactory.createDiscount(
                102,
                "Clearance Sale",
                "Fixed",
                "R50 off",
                startDate,
                endDate
        );

        assertNull(discount);
    }

    @Test
    void testCreateDiscountWithNullName() {
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusDays(1);

        Discount discount = DiscountFactory.createDiscount(
                103,
                null,
                "Percentage",
                "10%",
                startDate,
                endDate
        );

        assertNull(discount);
    }

    @Test
    void testCreateDiscountWithEmptyType() {
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusDays(1);

        Discount discount = DiscountFactory.createDiscount(
                104,
                "Spring Sale",
                "",
                "25%",
                startDate,
                endDate
        );

        assertNull(discount);
    }

    @Test
    void testCreateDiscountWithNegativeId() {
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusDays(1);

        Discount discount = DiscountFactory.createDiscount(
                -105,
                "Test Discount",
                "Fixed",
                "R30 off",
                startDate,
                endDate
        );

        assertNull(discount);
    }

    @Test
    void testCreateDiscountWithNullDates() {
        Discount discount = DiscountFactory.createDiscount(
                106,
                "Null Date Discount",
                "Percentage",
                "20%",
                null,
                null
        );

        assertNull(discount);
    }
}
