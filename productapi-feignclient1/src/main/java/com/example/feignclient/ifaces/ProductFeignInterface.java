package com.example.feignclient.ifaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.feignclient.model.Product;

@FeignClient(value="feignclient",url="http://localhost:8090/product/api1.0")
public interface ProductFeignInterface {
	@GetMapping("/productsinfo")
	public List<Product> getAllProducts();

}
