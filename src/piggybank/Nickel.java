package piggybank;

public class Nickel extends AbstractMoney {
	private String type;
	private double faceValue;

	public Nickel() {
		type = "Nickel";
		faceValue = 0.05;
	}

	public Nickel(long quantity) {
		super(quantity);
		type = "Nickel";
		faceValue = 0.05;
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
