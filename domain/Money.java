package domain;

public class Money {
	
	private String currency ;
	private float amount;
	
	protected Money(String currency, float amount) {
		
		this.currency = currency;
		this.amount = amount;
	}

	public Money(String code, int numberBetween) {
		// TODO Auto-generated constructor stub
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Money [currency=" + currency + ", amount=" + amount + "]";
	}
	
	
}
