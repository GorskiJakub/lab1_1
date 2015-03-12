package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {
	private String cause;

	private BigDecimal amount;
	
	private String currency;
	
	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	public boolean equals(Object obj) {
		Discount other = (Discount)obj;
		if(other.amount != amount)
			return false;
		if(other.cause != cause)
			return false;
		if(other.currency != currency)
			return false;
		return true;
	}
}