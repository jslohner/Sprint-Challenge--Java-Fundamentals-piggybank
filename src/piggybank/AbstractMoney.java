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
	abstract double getTotal();

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

// Each element in the collection contains
// - The number of coins in this group
// - The face value of the coins in the group
// - How to print the total value of this group which is face value * number of coins in the group
// - When creating a money object, you can optionally give the number of coins being added. If no number is given, the default is 1 coin being added to the piggy bank.
