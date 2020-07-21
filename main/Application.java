package main;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;

import domain.Category;
import domain.Money;
import domain.Product;
import domain.ProductFactory;

public class Application {

	
	public static void main(String[] args) {
		
		//generateFakeProduct().forEach( p -> System.out.println(p) );
		
		
		
		
		System.out.println(ProductFactory.getProduct("Nissan", new Money("Euro", 12000), 2, new Faker().number(), new Faker().number().numberBetween(1, 30), "Japan", new Category("cross")));
	
		System.out.println(ProductFactory.getFakeProduct());
		
		ProductFactory.getFakerProducts(10).forEach(System.out::println);
		
	}
	
	
	
	//public static List<Product> generateFakeProduct () {
		//Faker faker = new Faker();
		//List<Product> products = new ArrayList<Product>();
		//while (products.size() < 50) {
			//products.add(new Product(faker.animal().name()));
		//}
		
		//return products;
		
	

}
