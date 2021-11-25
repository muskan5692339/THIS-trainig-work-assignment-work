package com.shad.SpringMvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shad.SpringMvc.model.Product;
import com.shad.SpringMvc.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/addProduct")
	public String getAddProductPage() {
		return "AddProduct";
	}

	@PostMapping("/addProduct")
	public String addProduct(Product product) {

		// save Product in DB
		productService.saveProduct(product);

		return "redirect:/displayProducts";

	}

	@GetMapping("/displayProducts")
	public ModelAndView getAllProducts() {

		List<Product> allProduct = productService.getAllProduct();

		ModelAndView modelAndView = new ModelAndView("DisplayProduct");
		modelAndView.addObject("allProduct", allProduct);

		return modelAndView;
	}

	@GetMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id) {
		productService.deleteProduct(id);

		return "redirect:/displayProducts";
	}

	@GetMapping("/editProduct/{id}")
	public ModelAndView editProduct(@PathVariable int id) {

		Product existingProduct = productService.getProduct(id);

		ModelAndView modelAndView = new ModelAndView("EditProduct.html");
		modelAndView.addObject("product", existingProduct);

		return modelAndView;
	}

	@PostMapping("/editProduct")
	public String doEditProduct(Product product) {

		productService.editProduct(product);

		return "redirect:/displayProducts";
	}

}
