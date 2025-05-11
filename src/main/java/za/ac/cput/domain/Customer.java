/**
 * BabyCottonClub
 * Product.java
 * Author : Mengezi Junior Ngwenya - 230023967
 * Date : 11 May 2025
 */


package za.ac.cput.domain;

public class Customer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Address address;

    protected Customer() {
    }

    public Customer (Builder builder){
        this.customerId = builder.customerId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;

    }
    public int getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder {
        private int customerId;
        private String firstName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private Address address;

        public Builder setCustomerId(int customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }
        public Customer copy(Customer customer) {

            this.customerId = customer.customerId;
            this.firstName = customer.firstName;
            this.lastName = customer.lastName;
            this.email = customer.email;
            this.phoneNumber = customer.phoneNumber;
            this.address = customer.address;
            return customer;


        }
        public Customer build() {

            return new Customer(this);
        }

    }
}



