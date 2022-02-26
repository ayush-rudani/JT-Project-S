package product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Category {
    @Id
    private int id;
    private String category;
    private String category_desc;

    public Category(int id, String category, String category_desc) {
        this.id = id;
        this.category = category;
        this.category_desc = category_desc;
    }

    public Category(String category, String category_desc) {
        this.category = category;
        this.category_desc = category_desc;
    }

    public Category() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory_desc() {
        return category_desc;
    }

    public void setCategory_desc(String category_desc) {
        this.category_desc = category_desc;
    }
}
