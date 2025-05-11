/*
 * Discount.java
 * Discount POJO class
 * Author: O Ntsaluba (230741754)
 * Date: 11 May 2025
 */

package za.ac.cput.domain;

import java.util.Date;

public class Discount {

    private String discountId;
    private String discountCode;
    private String description;
    private String discountType;
    private double discountValue;
    private Date startDate;
    private Date endDate;

    public Discount() {
    }

    public Discount(Builder builder) {
        this.discountId = builder.discountId;
        this.discountCode = builder.discountCode;
        this.description = builder.description;
        this.discountType = builder.discountType;
        this.discountValue = builder.discountValue;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
    }

    public String getDiscountId() {
        return discountId;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public String getDescription() {
        return description;
    }

    public String getDiscountType() {
        return discountType;
    }

    public double getDiscountValue() {
        return discountValue;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public static class Builder {
        private String discountId;
        private String discountCode;
        private String description;
        private String discountType;
        private double discountValue;
        private Date startDate;
        private Date endDate;

        public Builder setDiscountId(String discountId) {
            this.discountId = discountId;
            return this;
        }

        public Builder setDiscountCode(String discountCode) {
            this.discountCode = discountCode;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setDiscountType(String discountType) {
            this.discountType = discountType;
            return this;
        }

        public Builder setDiscountValue(double discountValue) {
            this.discountValue = discountValue;
            return this;
        }

        public Builder setStartDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setEndDate(Date endDate) {
            this.endDate = endDate;
            return this;
        }

        @Override
        public String toString() {
            return "Discount{" +
                    "discountId='" + discountId + '\'' +
                    ", discountCode='" + discountCode + '\'' +
                    ", description='" + description + '\'' +
                    ", discountType='" + discountType + '\'' +
                    ", discountValue=" + discountValue +
                    ", startDate=" + startDate +
                    ", endDate=" + endDate +
                    '}';
        }

        public Builder copy(Discount discount) {
            this.discountId = discount.discountId;
            this.discountCode = discount.discountCode;
            this.description = discount.description;
            this.discountType = discount.discountType;
            this.discountValue = discount.discountValue;
            this.startDate = discount.startDate;
            this.endDate = discount.endDate;
            return this;
        }

        public Discount build() {
            return new Discount(this);
        }
    }
}
