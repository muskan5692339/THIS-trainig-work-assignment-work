package com.shad.SpringMvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shad.SpringMvc.dao.ProductDAO;
import com.shad.SpringMvc.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDAO productsDAO;

	public void saveProduct(Product product) {

		productsDAO.addProduct(product);

	}

	public Product getProduct(int id) {

		return productsDAO.getProduct(id);

	}

	public List<Product> getAllProduct() {

		return productsDAO.getAllProduct();

	}

	public void deleteProduct(int id) {

		productsDAO.deleteProduct(id);

	}

	public void editProduct(Product product) {

		productsDAO.editProduct(product);

	}

}
