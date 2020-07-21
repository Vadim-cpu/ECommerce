package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.github.javafaker.Faker;
import com.github.javafaker.Number;

import domain.Product;
import domain.Money;
import domain.Category;

public class ProductFactory {

	private static Integer productCount =0;
	public static Product getProduct(String name, Money price, int quantity, Number number, int expirationDate, String manufacred, Category category  ) {
		
		return new Product (++productCount, name, price, quantity, number, expirationDate, manufacred, category);
	}
	
	public static Product getFakeProduct() {
		Faker faker = new Faker(new Locale("ut"));
		return new Product(faker.commerce().productName(),
				new Money(faker.currency().code(), faker.number().numberBetween(10, 500)),
				faker.number().numberBetween(1, 20),
				faker.number().numberBetween(1, 20),
				faker.number(),
				faker.country().currencyCode(),
				new Category(faker.commerce().material()));
	}
	
	public static List<Product> getFakerProducts(Integer qty) {
        List<Product> products = new ArrayList<>();
        while (products.size()<qty){
            products.add(
                  getFakeProduct()
            );
        }
        return products;
	}
}