package com.ust.rest.controller;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.ust.rest.model.Product;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ControllerTest {

	private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext context;
	
	public static final Product product=Product.builder()
			.id(1)
			.brand("vaio plus")
			.description("Smart")
			.qty(10)
			.price(2000)
			.build();
	private static String APPLICATION_JSON_VALUE 
	= 
	
	
	void saveProduct() throws JsonProcessingException, Exception {
		MvcResult result = mockMvc .perform(post("/product/api1.0/addProduct"))
	   .contentType(APPLICATION_JSON_VALUE)
	   .content(mapper.writeValueAsString(product))
	}
	
	
}
