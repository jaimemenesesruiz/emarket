package co.com.personalsoft.market.domain.viewmodel;

import lombok.Data;
@Data
public class PurchaseItem {
	
	private int productId;
	
	private int quantity;
	
	private Double total;
	
	private boolean active;
}
