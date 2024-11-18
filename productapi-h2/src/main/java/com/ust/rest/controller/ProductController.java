package com.ust.rest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rest.model.Product;
import com.ust.rest.service.ProductService;

@RestController
@RequestMapping("/product/api1.0")
public class ProductController {
	
	Logger logger = Logger.getLogger("ProductController.class");	
	@Autowired
	ProductService productService;
	
@GetMapping(value="/product/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<Product> getById(@PathVariable long id){
	
			return null;
	//return ResponseEntity.ok(optional);
}
@GetMapping(value="/productbrand/{brand}",produces=MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<Product> getByBrand(@PathVariable String brand){
	
			return null;
	//return ResponseEntity.ok(optional);
}



@GetMapping(value="/productsinfo",produces = MediaType.APPLICATION_JSON_VALUE)	
public ResponseEntity<List<Product>> displayProducts(){
	return null;
}
@PostMapping(value="/addProduct",consumes = MediaType.APPLICATION_JSON_VALUE,produces= MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<Product> addProduct(@RequestBody Product product){
	logger.info("Enter POST method" + product);
	Product savedProduct = productService.addProduct(product);
	logger.info("Persisted product " + savedProduct);
	return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(savedProduct);
	}
@PutMapping(value="/modify")
public ResponseEntity<Product> updateProduct(@RequestBody Product product){
	
	
	return null;
}
@DeleteMapping("/delete/{id}")
public void deleteProduct(@PathVariable long id) {
	//Optional<Product> optional = productsList.stream().filter(p->p.getProductId()==id).findFirst();	
   
}
//@PutMapping(value="/modify")
//public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
//    long count = productsList.stream()
//        .filter(p -> p.getProductId() == product.getProductId())
//        .count();
//    
//    if (count == 1) {
//        productsList = productsList.stream()
//            .map(p -> p.getProductId() == product.getProductId() ? product : p)
//            .collect(Collectors.toList());
//        
//        return ResponseEntity.accepted().body(product);
//    } else {
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//    }
//}


	
	
	
	
	
	
//@GetMapping("/status")
//public String status() {
//	return "Up and Running....";
//}
//@GetMapping("/time")
//public String time() {
//	return new java.util.Date().toInstant()+"";
//}

}
