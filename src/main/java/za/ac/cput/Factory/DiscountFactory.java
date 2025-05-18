package za.ac.cput.Factory;


import za.ac.cput.domain.Discount;
import za.ac.cput.util.Helper;
import java.util.Date;

public class DiscountFactory {

    public static Discount createDiscount(int discountId, String discountName, String discountType,
                                          String discountValue, Date startDate, Date endDate) {
        if (Helper.isNullOrEmpty(discountName) || Helper.isNullOrEmpty(discountType) ||
                Helper.isNullOrEmpty(discountValue) || startDate == null || endDate == null) {
            return null;
        }

        if (!Helper.isValidId(discountId)) {
            return null;
        }

        if (startDate.after(endDate)) {
            return null;
        }

        return new Discount.Builder()
                .setDiscountId(discountId)
                .setDiscountName(discountName)
                .setDiscountType(discountType)
                .setDiscountValue(discountValue)
                .setStartDate(startDate)
                .setEndDate(endDate)
                .build();
    }
}