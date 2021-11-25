package com.shad.SpringMvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shad.SpringMvc.model.Product;
import com.shad.SpringMvc.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductRESTController {

	@Autowired
	private ProductService productService;

	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}

	@PutMapping("/product")
	public Product editProduct(@RequestBody Product product) {
		return productService.editProduct(product);
	}

	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable int id) {
		return productService.getProduct(id).orElseGet(null);
	}

	@GetMapping("/product")
	public List<Product> getAllProducts() {
		List<Product> allProduct = productService.getAllProduct();
		return allProduct;
	}

	@DeleteMapping("/product/{id}")
	public String deleteProduct(@PathVariable int id) {
		productService.deleteProduct(id);
		return "Delete Successfully";
	}

}
