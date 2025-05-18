
/*
Supplier POJO Class
Author: Phindile Lisa Ngozi
Student Number: 230640893
Date: 2025/05/11
 */
package za.ac.cput.domain;

public class Supplier {
    private String supplierId;
    private String supplierName;
    private String contactNumber;

    public Supplier() {
    }

    private Supplier(Builder builder) {
        this.supplierId = builder.supplierId;
        this.supplierName = builder.supplierName;
        this.contactNumber = builder.contactNumber;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId='" + supplierId + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }

    public static class Builder {
        private String supplierId;
        private String supplierName;
        private String contactNumber;

        public Builder setSupplierId(String supplierId) {
            this.supplierId = supplierId;
            return this;
        }

        public Builder setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }

        public Builder setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public Builder copy(Supplier supplier) {
            this.supplierId = supplier.supplierId;
            this.supplierName = supplier.supplierName;
            this.contactNumber = supplier.contactNumber;
            return this;
        }

        public Supplier build() {
            return new Supplier(this);
        }
    }
}
