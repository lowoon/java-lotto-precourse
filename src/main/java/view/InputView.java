package view;

import java.util.Scanner;

import domain.BonusNumber;
import domain.Price;
import domain.WinningLottoNumbers;

public class InputView {
	private static Scanner scanner = new Scanner(System.in);

	public static Price inputPrice() {
		Price price = null;
		try {
			System.out.println("구입금액을 입력해 주세요.");
			price =  new Price(scanner.nextLine().trim());
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
			inputPrice();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			inputPrice();
		}
		return price;
	}

	public static WinningLottoNumbers inputWinningLotto() {
		WinningLottoNumbers winningLottoNumbers = null;
		try {
			System.out.println("\n지난 주 당첨 번호를 입력해 주세요.");
			winningLottoNumbers = new WinningLottoNumbers(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닌 입력이 있습니다.");
			inputWinningLotto();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			inputWinningLotto();
		}
		return winningLottoNumbers;
	}

	public static BonusNumber inputBonusNumber() {
		BonusNumber bonusNumber = null;
		try {
			System.out.println("보너스 볼을 입력 주세요.");
			bonusNumber = new BonusNumber(scanner.nextLine().trim());
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
			inputBonusNumber();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			inputBonusNumber();
		}
		return bonusNumber;
	}
}
