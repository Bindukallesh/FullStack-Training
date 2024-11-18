package com.example.feignclient.model;






import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {
	
	
	
	private long Id;
	private String brand;
	private String description;
	private int qty;
	private int price;

}
