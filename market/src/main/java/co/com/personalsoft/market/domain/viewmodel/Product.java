package co.com.personalsoft.market.domain.viewmodel;

import lombok.Data;

@Data
public class Product {
	
	private Long productId;
	
	private String name;
	
	private Long categoryId;
	
	private double price;
	
	private int stock;
	
	private boolean active;
	
	private Category category;

}
