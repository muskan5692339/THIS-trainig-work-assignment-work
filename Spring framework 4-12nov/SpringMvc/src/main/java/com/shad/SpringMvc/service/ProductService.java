package com.shad.SpringMvc.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.shad.SpringMvc.model.Product;

@Service
public class ProductService {

	private HashMap<Integer, Product> productsDB;

	public ProductService() {

		productsDB = new HashMap<>();

		Product product_1 = new Product();
		product_1.setCategory("Electronics");
		product_1.setId(1);
		product_1.setPrice(11000);
		product_1.setName("Washing Machine");
		product_1.setQuantity(50);

		Product product_2 = new Product();
		product_2.setCategory("Fashion");
		product_2.setId(2);
		product_2.setPrice(22000);
		product_2.setName("Bridal Gown");
		product_2.setQuantity(150);

		productsDB.put(1, product_1);
		productsDB.put(2, product_2);
	}

	public void saveProduct(Product product) {

		int id = productsDB.size() + 1;

		product.setId(id);

		productsDB.put(id, product);

	
	}

	public Product getProduct(int id) {

		return productsDB.get(id);

	}

	public List<Product> getAllProduct() {

		Collection<Product> values = productsDB.values();

		List<Product> allProducts = new ArrayList<>();

		for (Product product : values) {
			allProducts.add(product);
		}

		return allProducts;

	}

	public void deleteProduct(int id) {

		productsDB.remove(id);

	}

	public void editProduct(Product product) {
		
		productsDB.put(product.getId(), product);

		
		
	}

}
