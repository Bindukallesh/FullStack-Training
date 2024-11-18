package com.ust.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ust.client.model.Product;

@RestController
@RequestMapping("/client/api1.0")
public class ProductController {
	@Autowired
	RestTemplate template;
	

	@GetMapping("/getAllProducts")
	public List<Product> fetchProducts(){
	
		String url="http://localhost:8090/product/api1.0/productsinfo";
		List<Product> list = template.getForObject(url,List.class);
		return list;
	}
	@GetMapping("/getById")
	public Product getProductById(@RequestParam Long id) {
		String url="http://localhost:8090/product/api1.0/product/"+id;
		Product p = template.getForObject(url,Product.class );
		return p;
		}
	@GetMapping("/getByBrand")
	public List<Product> getProductByBrand(@RequestParam String brand) {
		String url="http://localhost:8090/product/api1.0/productbrand/"+brand;
		List<Product> list = template.getForObject(url,List.class );
		return list;
		}
	@PostMapping("/addProduct/{id}")
    public Product addProduct(@PathVariable Long id, @RequestBody Product product) {
        String url = "http://localhost:8090/product/api1.0/addProduct/" + id;
        Product newProduct = template.postForObject(url, product, Product.class);
        return newProduct;
    }
}

	

