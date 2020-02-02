package domain;

public class BonusNumber {
	private final int bonusNumber;

	public BonusNumber(String number) {
		if (number.isEmpty()) {
			throw new IllegalArgumentException("입력된 값이 없습니다.");
		}

		this.bonusNumber = Integer.parseInt(number);
		if (bonusNumber > Lotto.MAXIMUM_NUMBER) {
			throw new IllegalArgumentException(Lotto.MAXIMUM_NUMBER + "보다 큰 숫자는 입력할 수 없습니다.");
		}
		if (bonusNumber < Lotto.MINIMUM_NUMBER) {
			throw new IllegalArgumentException(Lotto.MINIMUM_NUMBER + "보다 작은 숫자는 입력할 수 없습니다.");
		}
	}
}
