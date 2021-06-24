package co.com.personalsoft.market.domain.viewmodel;

import lombok.Data;

@Data
public class Category {
	
	private Long categoryId;
	
	private String categoryName;
	
	private boolean active;
}
