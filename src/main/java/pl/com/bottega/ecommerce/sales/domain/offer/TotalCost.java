package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class TotalCost {
	
	private String currency;
	
	private BigDecimal value;
	
	public TotalCost(BigDecimal value){
		this.setValue(value);
	}
	public boolean equals(Object obj) {
		TotalCost other = (TotalCost)obj;
		if(other.getValue() != getValue())
			return false;
		if(other.currency != currency)
			return false;
		return true;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public TotalCost subtract(TotalCost money) {
		return new TotalCost(value.subtract(money.getValue()));
	}
	public TotalCost multiply(TotalCost money) {
		return new TotalCost(value.multiply(money.getValue()));
	}
	
	public int compareTo(TotalCost totalCost) {
		return value.compareTo(totalCost.value);
	}
}