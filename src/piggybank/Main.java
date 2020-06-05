package piggybank;

import java.util.*;

public class Main {
	private static void workWithPiggyBank() {
		List<AbstractMoney> piggyBank = new ArrayList<>();

		// piggyBank.add(new Dollar(5));
		// piggyBank.add(new Dollar(2));
		// piggyBank.add(new Quarter());
		// piggyBank.add(new Quarter(3));

		piggyBank.add(new Quarter());
		piggyBank.add(new Dime());
		piggyBank.add(new Dollar(5));
		piggyBank.add(new Nickel(3));
		piggyBank.add(new Dime(7));
		piggyBank.add(new Dollar());
		piggyBank.add(new Penny(10));

		for (AbstractMoney m : piggyBank) {
			System.out.println(m);
		}
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
