package piggybank;

abstract class AbstractMoney {
	// protected String type;
	// protected double faceValue;
	protected long quantity;

	public AbstractMoney() {
		quantity = 1;
	}

	public AbstractMoney(long quantity) {
		this.quantity = quantity;
	}

	abstract String getType();
	abstract double getFaceValue();
	abstract String getFaceValueString();
	abstract double getTotal();
	abstract String getTotalString();

	long getQuantity() {
		return quantity;
	}

	void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	// @Override
	// public String toString() {
	// 	return "Total Value of " + type + "s - " + faceValue * quantity;
	// }
}
