package com.shad.SpringMvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shad.SpringMvc.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
