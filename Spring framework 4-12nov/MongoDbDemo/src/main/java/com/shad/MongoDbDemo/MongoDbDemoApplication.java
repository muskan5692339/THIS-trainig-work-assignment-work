package com.shad.MongoDbDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.shad.MongoDbDemo.model.Product;
import com.shad.MongoDbDemo.repo.ProductRepository;

@SpringBootApplication
@EnableMongoRepositories
public class MongoDbDemoApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongoDbDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		createProduct();
		getAllProduct();

		updateProduct();
		getAllProduct();

		System.out.println(productRepository.count());

		deleteProduct();

		System.out.println(productRepository.count());

	}

	// Create Product in MongoDB
	public void createProduct() {

		Product product = new Product();
		product.setName("Mi notebook Ultra i7");
		product.setCategory("Laptop");
		product.setPrice(76999);
		product.setQuantity(1);

		productRepository.save(product);

	}

	// Update Product in MongoDB
	public void updateProduct() {
		Product product = productRepository.findProductByName("Mi notebook Ultra i7");

		product.setPrice(66999);
		product.setQuantity(5);

		productRepository.save(product);
	}

	// Delete Product in MongoDB
	public void deleteProduct() {

		Product product = productRepository.findProductByName("Mi notebook Ultra i7");

		productRepository.delete(product);
	}

	// Get One Product from MongoDB
	public void getOneProduct() {
	}

	// Create All Product from MongoDB
	public void getAllProduct() {

		List<Product> allProducts = productRepository.findAll();

		System.out.println(allProducts);
	}

}
