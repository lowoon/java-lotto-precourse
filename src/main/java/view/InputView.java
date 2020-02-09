package view;

import java.util.Scanner;

import domain.BonusNumber;
import domain.Price;
import domain.WinningLottoNumbers;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static Price inputPrice() {
        try {
            System.out.println("구입금액을 입력해 주세요.");
            return new Price(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닙니다.");
            return inputPrice();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return inputPrice();
        }
    }

    public static WinningLottoNumbers inputWinningLotto() {
        try {
            System.out.println("\n지난 주 당첨 번호를 입력해 주세요.");
            return new WinningLottoNumbers(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닌 입력이 있습니다.");
            return inputWinningLotto();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return inputWinningLotto();
        }
    }

    public static BonusNumber inputBonusNumber(WinningLottoNumbers winningLottoNumbers) {
        try {
            System.out.println("보너스 볼을 입력 주세요.");
            BonusNumber bonusNumber = new BonusNumber(scanner.nextLine().trim());
            bonusNumber.isExistent(winningLottoNumbers);
            return bonusNumber;
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닙니다.");
            return inputBonusNumber(winningLottoNumbers);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return inputBonusNumber(winningLottoNumbers);
        }
    }
}
