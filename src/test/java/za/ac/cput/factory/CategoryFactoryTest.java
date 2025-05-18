package za.ac.cput.factory;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Category;

import static org.junit.jupiter.api.Assertions.*;
class CategoryFactoryTest {
    Category category1 = CategoryFactory.createCategory(3, "Clothes");
    Category category2 = CategoryFactory.createCategory(4,"Footwear");
    @Test
    @Order(1)
    public void testCreateCategory(){
        assertNotNull(category1);
        System.out.println(category1.toString());
    }
  @Test
  @Order(2)
    public void CreateCategoryWithAllAttributes(){
     assertNotNull(category2);
 System.out.println(category2.toString());
  }

}