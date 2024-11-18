package com.ust.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.rest.model.Product;
import com.ust.rest.repository.ProductRepository;

@Service
public class ProductService {
@Autowired
private ProductRepository repository;

public Product addProduct(Product newProduct) {
return repository.save(newProduct);	
}
public Product getById(Long id) {
	return repository.getReferenceById(id);
}
public List<Product> getByBrand(String brand) {
    return repository.findByBrand(brand);
}
public List<Product> productsInfo(){
	return repository.findAll();
}
public Product updateProduct(Long id, Product updatedProduct) {
    return repository.findById(id)
            .map(existingProduct -> {
                existingProduct.setBrand(updatedProduct.getBrand());
                existingProduct.setDescription(updatedProduct.getDescription());
                existingProduct.setQty(updatedProduct.getQty());
                existingProduct.setPrice(updatedProduct.getPrice());
                return repository.save(existingProduct);
            })
            .orElseThrow(() -> new RuntimeException("Product not found with ID " + id));
}

}
