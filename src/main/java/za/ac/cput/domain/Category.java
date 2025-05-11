package za.ac.cput.domain;

public class Category {

    private String categoryId;
    private String categoryName;

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
            public Builder copy (Category category){
                this.categoryId = category.categoryId;
                this.categoryName = category.categoryName;
                return this;
            }
    }
    public Category(){

    }
    public Category(String categoryId, String categoryName){
        this.categoryId = categoryId;
        this.categoryName = categoryName;

    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId='" + categoryId + '\'' +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }

    public Category build(){
        return new Category();
    }
}
