package piggybank;

public class Quarter extends AbstractMoney {
	private String type;
	private double faceValue;

	public Quarter() {
		type = "Quarter";
		faceValue = 0.25;
	}

	public Quarter(long quantity) {
		super(quantity);
		type = "Quarter";
		faceValue = 0.25;
	}

	public String getType() {
		return type;
	}

	public double getFaceValue() {
		return faceValue;
	}

	@Override
	public String toString() {
		return quantity + " " + (quantity > 1 ? type + "s" : type);
	}
}
