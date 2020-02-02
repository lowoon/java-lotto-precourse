package domain;

import java.util.List;

/**
 * 로또 한장을 의미하는 객체
 */
public class Lotto {
    public static final int MAXIMUM_NUMBER = 45;
    public static final int MINIMUM_NUMBER = 1;

    private List<Integer> numbers;

    public Lotto() {};

    public Lotto(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public String toString() {
        return String.valueOf(numbers);
    }

    public boolean equals(Lotto lotto) {
        return numbers.containsAll(lotto.numbers);
    }

    public List<Integer> toList() {
        return numbers;
    }
}
