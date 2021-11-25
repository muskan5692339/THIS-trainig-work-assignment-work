package com.shad.SpringMvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.shad.SpringMvc.model.Product;

@Repository
public class ProductDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String TABLE_NAME = "product";

	public void addProduct(Product product) {

		String insertSQL = "INSERT INTO " + TABLE_NAME + " (name, category, price, quantity) VALUES(?,?,?,?)";

		jdbcTemplate.update(insertSQL, product.getName(), product.getCategory(), product.getPrice(),
				product.getQuantity());

	}

	public void editProduct(Product product) {

		String updateSQL = "UPDATE " + TABLE_NAME + " SET name=?, category=?, price=?, quantity=? WHERE id=?";

		jdbcTemplate.update(updateSQL, product.getName(), product.getCategory(), product.getPrice(),
				product.getQuantity(), product.getId());

	}

	public void deleteProduct(int id) {

		String deleteSQL = "DELETE FROM " + TABLE_NAME + " WHERE id=?";

		jdbcTemplate.update(deleteSQL, id);

	}

	public Product getProduct(int id) {
		String selectById = "SELECT * FROM " + TABLE_NAME + " WHERE id=?";

		Product product = jdbcTemplate.queryForObject(selectById, new Object[] { id },
				new BeanPropertyRowMapper<>(Product.class));

		return product;

	}

	public List<Product> getAllProduct() {

		String selectAll = "SELECT * FROM " + TABLE_NAME;

		List<Product> products = jdbcTemplate.query(selectAll, new BeanPropertyRowMapper<>(Product.class));

		return products;

	}

}
