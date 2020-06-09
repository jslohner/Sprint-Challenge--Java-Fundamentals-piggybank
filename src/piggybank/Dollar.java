package piggybank;

public class Dollar extends AbstractMoney {
	private String type;
	private double faceValue;

	public Dollar() {
		type = "Dollar";
		faceValue = 1.00;
	}

	public Dollar(long quantity) {
		super(quantity);
		type = "Dollar";
		faceValue = 1.00;
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
		return "$" + quantity;
	}
}
