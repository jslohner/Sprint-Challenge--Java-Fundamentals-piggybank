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

	private static Map<String, Double> piggyBankBalance(List<AbstractMoney> piggyBankTransactions) {
		System.out.println("*** Piggy Bank Balance ***");
		Map<String, Double> piggyBank = new HashMap<>();
		for (AbstractMoney m : piggyBankTransactions) {
			if (piggyBank.containsKey(m.getType())) {
				piggyBank.put(m.getType(), (piggyBank.get(m.getType()) + m.getTotal()));
			} else {
				piggyBank.put(m.getType(), m.getTotal());
			}
		}

		for (String m : piggyBank.keySet()) {
			System.out.println(m + " balance - $" + String.format("%.2f", piggyBank.get(m)));
		}
		System.out.println();

		return piggyBank;
	}

	private static double getTotalMoney(Map<String, Double> piggyBank) {
		double total = 0;
		for (double m : piggyBank.values()) {
			total += m;
		}
		return total;
	}

	private static void workWithPiggyBank() {
		System.out.println("*** Piggy Bank Transactions ***");
		List<AbstractMoney> piggyBankTransactions = new ArrayList<>();

		piggyBankTransactions.add(new Quarter());
		piggyBankTransactions.add(new Dime());
		piggyBankTransactions.add(new Dollar(5));
		piggyBankTransactions.add(new Nickel(3));
		piggyBankTransactions.add(new Dime(7));
		piggyBankTransactions.add(new Dollar());
		piggyBankTransactions.add(new Penny(10));

		for (AbstractMoney m : piggyBankTransactions) {
			System.out.println(m + " added to piggy bank.");
			System.out.println("Value - " + m.getTotalString());
			System.out.println();
		}

		Map<String, Double> piggyBank = piggyBankBalance(piggyBankTransactions);

		String total = String.format("%.2f", getTotalMoney(piggyBank));
		System.out.println("The piggy bank holds $" + total);
	}

	public static void main(String[] args) {
		welcomeMessage();
		piggyBankMessage();
		workWithPiggyBank();
	}
}
