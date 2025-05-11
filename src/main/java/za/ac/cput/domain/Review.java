/*
Review.java
Review POJO class
Author: Olwethu Nene(230277845)
Date: 11 May 2025
 */

package za.ac.cput.domain;

public class Review {
    private String reviewId;
    private String customerId;
    private String productId;
    private Integer rating;

    public Review(){
    }
    public Review (Builder builder){
       this.reviewId = builder.reviewId;
       this.customerId = builder.customerId;
       this.productId = builder.productId;
       this.rating = builder.rating;
    }

    public String getReviewId() {
        return reviewId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getProductId() {
        return productId;
    }

    public Integer getRating() {
        return rating;
    }
    public static class Builder{
        private String reviewId;
        private String customerId;
        private String productId;
        private Integer rating;


    public Builder setReviewId(String reviewId) {
        this.reviewId = reviewId;
        return this;
    }

        public Builder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setProductId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder setRating(Integer rating) {
            this.rating = rating;
            return this;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "reviewId='" + reviewId + '\'' +
                    ", customerId='" + customerId + '\'' +
                    ", productId='" + productId + '\'' +
                    ", rating=" + rating +
                    '}';
        }
        public Builder copy(Builder builder){
            this.reviewId = builder.reviewId;
            this.customerId = builder.customerId;
            this.productId = builder.productId;
            this.rating = builder.rating;
            return this;

    }
    public Review build(){
    return new Review(this);
       }
     }
}
