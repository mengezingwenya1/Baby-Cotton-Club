package za.ac.cput.factory;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Review;

import static org.junit.jupiter.api.Assertions.*;

class ReviewFactoryTest {
    private static Review review1 = ReviewFactory.createReview(3,44,4, (short) 10
            ,"Good","16 May 2025");
    private static Review review2 = ReviewFactory.createReview(2,13,10,(short)12,
         "Bad","15 January 2025");
    private static Review review3 = ReviewFactory.createReview(2,2,34,(short) 6,
            " The material is great", "5 May 2025");


    @Test
    @Order(1)
    public void testCreateReview(){
    assertNotNull(review1);
    System.out.println(review1.toString());
    }
@Test
@Order(2)
    public void testWithAllAttributes(){
        assertNotNull(review2);
        System.out.println(review2.toString());

}
@Test
@Order(3)
    public void testWithReviewThatFail(){
    assertNotNull(review3);
    System.out.println(review3.toString());
}
}