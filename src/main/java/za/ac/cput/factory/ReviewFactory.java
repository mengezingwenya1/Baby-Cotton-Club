package za.ac.cput.factory;

import za.ac.cput.domain.Review;
import za.ac.cput.util.Helper;

public class ReviewFactory {
    public static Review createReview( Integer reviewId,Integer customerId,Integer productId,
                                       short rating, String reviewComment, String reviewDate){
        if(Helper.isNullOrEmpty(reviewComment) || Helper.isNullOrEmpty(reviewDate)){
            return null;
        }
        if(Helper.isValidReviewId(reviewId)){
            return null;
        }
        return new Review.Builder().setReviewId(reviewId).setCustomerId(customerId)
                .setProductId(productId).setReviewComment(reviewComment).setReviewDate(reviewDate).build();
    }
}
