package com.ust.rest.repository;

import org.springframework.stereotype.Repository;

import com.ust.rest.model.Product;

import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
	List<Product> findByBrand(String brand);
}
