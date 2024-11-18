package com.ust.client.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
	private long Id;
	private String brand;
	private String description;
	private int qty;
	private int price;

}
