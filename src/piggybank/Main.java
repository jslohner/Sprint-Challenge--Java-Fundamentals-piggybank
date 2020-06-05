package piggybank;

import java.util.*;

public class Main {
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
			System.out.println(m);
			System.out.println(m.getFaceValueString());
			System.out.println();
		}


		String total = String.format("%.2f", getTotalMoney(piggyBank));
		System.out.println("The piggy bank holds $" + total);
	}

	public static void main(String[] args) {
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
