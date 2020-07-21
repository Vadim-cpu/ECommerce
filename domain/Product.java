package domain;

import com.github.javafaker.Number;



///class Product
public class Product {
	
	private Integer id;
	private String name;
	private Money price;
	private Integer quantity;
	private Number expirationMonth;
	private Integer expirationDate;
	private String manufacred;
	private Category category;
	
	
	protected Product(Integer id, String name, Money price2, Integer quantity,
			Number number, Integer expirationDate2, String manufacred,
			Category category2) {
		this.id = id;
		this.name = name;
		this.price = price2;
		this.quantity = quantity;
		this.expirationMonth = number;
		this.expirationDate = expirationDate2;
		this.manufacred = manufacred;
		this.category = category2;
	}

public Integer getId() {
	return id;
}
	public Product(String name2, Money money, int quantity2,
			int expirationMonth2, Number number, String manufacred2,
			Category category2) {
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Money getPrice() {
		return price;
	}


	public void setPrice(Money price) {
		this.price = price;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Number getExpirationMonth() {
		return expirationMonth;
	}


	public void setExpirationMonth(Number expirationMonth) {
		this.expirationMonth = expirationMonth;
	}


	public Integer getExpirationDate() {
		return expirationDate;
	}


	public void setExpirationDate(Integer expirationDate) {
		this.expirationDate = expirationDate;
	}


	public String getManufacred() {
		return manufacred;
	}


	public void setManufacred(String manufacred) {
		this.manufacred = manufacred;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity="
				+ quantity + ", expirationMonth=" + expirationMonth
				+ ", expirationDate=" + expirationDate + ", manufacred="
				+ manufacred + ", category=" + category + "]";
	}
	
	
	 
	

	
	
}