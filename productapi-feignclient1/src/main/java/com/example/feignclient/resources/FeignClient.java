package com.example.feignclient.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.feignclient.ifaces.ProductFeignInterface;
import com.example.feignclient.model.Product;

@RestController
@RequestMapping("/client")
public class FeignClient {
	@Autowired
	private ProductFeignInterface feignclient;
	
	@GetMapping("/products")
	public List<Product> getAll(){
		return feignclient.getAllProducts();
	}

}
