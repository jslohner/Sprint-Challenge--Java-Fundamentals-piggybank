package piggybank;

public class Penny extends AbstractMoney {
	private String type;
	private double faceValue;

	public Penny() {
		type = "Penny";
		faceValue = 0.01;
	}

	public Penny(long quantity) {
		super(quantity);
		type = "Penny";
		faceValue = 0.01;
	}

	public String getType() {
		return type;
	}

	public double getFaceValue() {
		return faceValue;
	}

	public double getTotal() {
		return quantity * faceValue;
	}

	@Override
	public String toString() {
		return quantity + " " + (quantity > 1 ?  "Pennies" : type);
	}
}
