package com.ust.rest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rest.model.Product;

@CrossOrigin
@RestController
@RequestMapping("/product/api1.0")
public class ProductController {
	
	List<Product> productsList= new ArrayList<>();
	{
		productsList.add(new Product(101,"Nike","FeatherWalk",10,50000));
		productsList.add(new Product(102,"Puma","ComfortWalk",13,20020));
		productsList.add(new Product(103,"Bata","Leather",12,10000));
	}	
@GetMapping(value="/product/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<Product> getById(@PathVariable long id){
	Optional<Product> optional = productsList.stream().filter(product->product.getProductId()==id).findFirst();
			return ResponseEntity.status(HttpStatus.OK).body(optional.get());
	//return ResponseEntity.ok(optional);
}
@GetMapping(value="/productbrand/{brand}",produces=MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<Product> getByBrand(@PathVariable String brand){
	Optional<Product> optional = productsList.stream().filter(product->product.getBrand().equals(brand)).findFirst();
			return ResponseEntity.status(HttpStatus.OK).body(optional.get());
	//return ResponseEntity.ok(optional);
}



@GetMapping(value="/productsinfo",produces = MediaType.APPLICATION_JSON_VALUE)	
public ResponseEntity<List<Product>> displayProducts(){
	return ResponseEntity.ok(productsList);
}
@PostMapping(value="/addProduct",consumes = MediaType.APPLICATION_JSON_VALUE,produces= MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<Product> addProduct(@RequestBody Product product){
	boolean flag=false;
	if(product!=null)
		flag=productsList.add(product);
	return flag?ResponseEntity.status(201).body(product):ResponseEntity.status(404).body(null);
}
@PutMapping(value="/modify")
public ResponseEntity<Product> updateProduct(@RequestBody Product product){
	Optional<Product> optional = productsList.stream().filter(p->p.getProductId()==product.getProductId()).findFirst();
	Product temp=optional.get();
	temp.setBrand(product.getBrand());
	temp.setDescription(product.getDescription());
	temp.setPrice(product.getPrice());
	temp.setQty(product.getQty());
	int indx = productsList.indexOf(temp);
	productsList.remove(indx);
	productsList.add(indx, temp);
	
	return ResponseEntity.accepted().body(null);
}
@DeleteMapping("/delete/{id}")
public void deleteProduct(@PathVariable long id) {
	//Optional<Product> optional = productsList.stream().filter(p->p.getProductId()==id).findFirst();	
   productsList.removeIf(p->p.getProductId()==id);
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
