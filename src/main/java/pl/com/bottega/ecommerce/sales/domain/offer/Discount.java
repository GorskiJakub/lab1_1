package pl.com.bottega.ecommerce.sales.domain.offer;


public class Discount {
	
	private String cause;
	
	private TotalCost money;
	
	public TotalCost getMoney() {
		return money;
	}

	public void setMoney(TotalCost money) {
		this.money = money;
	}
	
	public boolean equals(Object obj) {
		Discount other = (Discount)obj;
		if(other.money != money)
			return false;
		if(other.cause != cause)
			return false;
		return true;
	}
}