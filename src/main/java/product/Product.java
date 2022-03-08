package product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	private int id;
	private String name;
	private String description;
	private String photo;
	private int price;
	private int quantity;
	@ManyToOne
	private Category category;

	public Product() {
	}

	public Product(int id, String name, String description, String photo, int price, int quantity, Category category) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.photo = photo;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}

	public Product(String name, String description, String photo, int price, int quantity, Category category) {
		this.name = name;
		this.description = description;
		this.photo = photo;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
