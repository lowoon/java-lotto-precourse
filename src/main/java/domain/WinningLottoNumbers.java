package domain;

import java.util.HashSet;
import java.util.Set;

public class WinningLottoNumbers {
    private final Lotto winningLotto;

    public WinningLottoNumbers(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException("입력이 없습니다.");
        }

        String[] numbers = input.split(",", -1);

        this.winningLotto = new Lotto(makeWinningLotto(numbers));
    }

    private Set<Integer> makeWinningLotto(String[] numbers) {
        Set<Integer> winningLotto = new HashSet<Integer>();

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

    public Set<Integer> toList() {
        return winningLotto.toList();
    }
}
