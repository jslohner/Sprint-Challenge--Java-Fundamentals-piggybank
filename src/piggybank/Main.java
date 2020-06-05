package piggybank;

import java.util.*;

public class Main {
	private static void welcomeMessage() {
		System.out.println("*** Welcome to Your Piggy Bank ***");
		System.out.println();
	}

	private static void piggyBankMessage() {
		System.out.println("*** Money Info ***");

		AbstractMoney[] typesOfMoney = new AbstractMoney[5];
		typesOfMoney[0] = new Dollar();
		typesOfMoney[1] = new Quarter();
		typesOfMoney[2] = new Dime();
		typesOfMoney[3] = new Nickel();
		typesOfMoney[4] = new Penny();

		int id = 1;
		for (AbstractMoney m : typesOfMoney) {
			System.out.println(id + ") " + m.getType() + " || Face Value - " + m.getFaceValueString());
			id++;
		}

		System.out.println();
	}

	private static double getTotalMoney(List<AbstractMoney> piggyBank) {
		double total = 0;
		for (AbstractMoney m : piggyBank) {
			total += m.getTotal();
		}
		return total;
	}

	private static void workWithPiggyBank() {

		List<AbstractMoney> piggyBank = new ArrayList<>();

		piggyBank.add(new Quarter());
		piggyBank.add(new Dime());
		piggyBank.add(new Dollar(5));
		piggyBank.add(new Nickel(3));
		piggyBank.add(new Dime(7));
		piggyBank.add(new Dollar());
		piggyBank.add(new Penny(10));

		for (AbstractMoney m : piggyBank) {
			System.out.println(m + " added to piggy bank.");
			System.out.println("Value - " + m.getTotalString());
			System.out.println();
		}


		String total = String.format("%.2f", getTotalMoney(piggyBank));
		System.out.println("The piggy bank holds $" + total);
	}

	public static void main(String[] args) {
		welcomeMessage();
		piggyBankMessage();
		workWithPiggyBank();
	}
}

// `1 Quarter`
// `1 Dime`
// `$5`
// `3 Nickels`
// `7 Dimes`
// `$1`
// `10 Pennies`
