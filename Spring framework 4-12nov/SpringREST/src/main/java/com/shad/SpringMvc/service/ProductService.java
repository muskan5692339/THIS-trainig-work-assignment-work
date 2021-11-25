package com.shad.SpringMvc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shad.SpringMvc.model.Product;
import com.shad.SpringMvc.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	public Product editProduct(Product product) {
		return productRepository.save(product);
	}

	public Optional<Product> getProduct(int id) {
		return productRepository.findById(id);
	}

	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	public void deleteProduct(int id) {
		productRepository.deleteById(id);
	}

}
