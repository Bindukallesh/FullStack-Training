package com.example.springsecurity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Product {
	@Id
	private long Id;
	private String brand;
	private String description;
	private int qty;
	private int price;

}
