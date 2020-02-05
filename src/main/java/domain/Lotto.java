package domain;

import java.util.List;
import java.util.Set;

/**
 * 로또 한장을 의미하는 객체
 */
public class Lotto {
	private static final int LOTTO_COUNT = 6;
	public static final int MAXIMUM_NUMBER = 45;
	public static final int MINIMUM_NUMBER = 1;

	private Set<Integer> numbers;

	public Lotto(Set<Integer> numbers) {
		if (numbers.size() != LOTTO_COUNT) {
			throw new IllegalArgumentException("로또는 6개의 서로 다른 숫자를 입력해야 합니다.");
		}
		this.numbers = numbers;
	}

	public String toString() {
		return String.valueOf(numbers);
	}

	public boolean equals(Lotto lotto) {
		return numbers.containsAll(lotto.numbers);
	}

	public Set<Integer> toList() {
		return numbers;
	}
}
