package com.ust.rest.repository;

import org.springframework.stereotype.Repository;

import com.ust.rest.model.Product;

import org.springframework.data.jpa.repository.*;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
