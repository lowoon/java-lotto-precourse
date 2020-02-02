package domain;

import java.util.ArrayList;
import java.util.List;

public class WinningLottoNumbers {
	private static final int LOTTO_COUNT = 6;

	private final Lotto winningLotto;

	public WinningLottoNumbers(String input) {
		if (input.isEmpty()) {
			throw new IllegalArgumentException("입력이 없습니다.");
		}

		String[] numbers = input.split(",", -1);
		if (numbers.length != LOTTO_COUNT) {
			throw new IllegalArgumentException(LOTTO_COUNT + "개의 숫자를 입력해야 합니다.");
		}

		this.winningLotto = new Lotto(makeWinningLotto(numbers));
	}

	private List<Integer> makeWinningLotto(String[] numbers) {
		List<Integer> winningLotto = new ArrayList<Integer>();

		for (String number : numbers) {
			winningLotto.add(checkNumber(number));
		}

		return winningLotto;
	}

	private int checkNumber(String input) {
		int number = Integer.parseInt(input);

		if (number > Lotto.MAXIMUM_NUMBER) {
			throw new IllegalArgumentException(Lotto.MAXIMUM_NUMBER + "보다 큰 숫자는 입력할 수 없습니다.");
		}
		if (number < Lotto.MINIMUM_NUMBER) {
			throw new IllegalArgumentException(Lotto.MINIMUM_NUMBER + "보다 작은 숫자는 입력할 수 없습니다.");
		}

		return number;
	}

	public List<Integer> toList() {
		return winningLotto.toList();
	}
}
