/*
Category.java
Category POJO class
Author: Olwethu Nene(230277845)
Date: 11 May 2025

 */

package za.ac.cput.domain;

public class Category {

    private String categoryId;
    private String categoryName;

    public Category() {

    }
public Category(Builder builder){
        this.categoryId = builder.categoryId;
        this.categoryName = builder.categoryName;
}

    public String getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public static class Builder{
        private String categoryId;
        private String categoryName;

        public Builder setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
            public Builder setCategoryName(String categoryName){
                this.categoryName = categoryName;
                return this;
            }
        @Override
        public String toString() {
            return "Category{" +
                    "categoryId='" + categoryId + '\'' +
                    ", categoryName='" + categoryName + '\'' +
                    '}';
        }
            public Builder copy (Builder builder){
                this.categoryId = builder.categoryId;
                this.categoryName = builder.categoryName;
                return this;
            }

    }
    public Category build(){
        return new Category();
    }
}
