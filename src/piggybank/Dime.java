package piggybank;

public class Dime extends AbstractMoney {
	private String type;
	private double faceValue;

	public Dime() {
		type = "Dime";
		faceValue = 0.10;
	}

	public Dime(long quantity) {
		super(quantity);
		type = "Dime";
		faceValue = 0.10;
	}

	public String getType() {
		return type;
	}

	public double getFaceValue() {
		return faceValue;
	}

	public String getFaceValueString() {
		return "$" + String.format("%.2f", faceValue);
	}

	public double getTotal() {
		return quantity * faceValue;
	}

	public String getTotalString() {
		return "$" + String.format("%.2f", quantity * faceValue);
	}

	@Override
	public String toString() {
		return quantity + " " + (quantity > 1 ? type + "s" : type);
	}
}
