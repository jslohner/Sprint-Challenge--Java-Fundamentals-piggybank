package piggybank;

import java.util.*;

public class Main {
	private static void workWithPiggyBank() {
		List<AbstractMoney> piggyBank = new ArrayList<>();

		piggyBank.add(new Dollar(5));
		piggyBank.add(new Dollar(2));
		// piggyBank.add(new Quarter());

		for (AbstractMoney m : piggyBank) {
			System.out.println(m);
		}
	}

	public static void main(String[] args) {
		workWithPiggyBank();
	}
}
