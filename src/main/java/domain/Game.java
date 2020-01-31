package domain;

import java.util.Scanner;

import view.InputView;

public class Game {
	private Scanner scanner = new Scanner(System.in);

	public void run() {
		getPrice();
	}

	private void getPrice() {
		try {
			InputView.inputPrice(scanner.nextLine().trim());
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
			getPrice();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			getPrice();
		}
	}
}
