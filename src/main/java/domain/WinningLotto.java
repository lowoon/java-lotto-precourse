package domain;

/**
 * 당첨 번호를 담당하는 객체
 */
public class WinningLotto {
    private final WinningLottoNumbers winningLottoNumbers;
    private final BonusNumber bonusNumber;

    public WinningLotto(WinningLottoNumbers winningLottoNumbers, BonusNumber bonusNumber) {
        this.winningLottoNumbers = winningLottoNumbers;
        this.bonusNumber = bonusNumber;
    }

    public Rank match(Lotto userLotto) {
        return Rank.valueOf(getCountOfMatch(userLotto), checkBonusNumber(userLotto));
    }

    private int getCountOfMatch(Lotto userLotto) {
        int cnt = 0;

        for (int num : userLotto.toList()) {
            cnt += checkWinningNumbers(num);
        }

        return cnt;
    }

    private int checkWinningNumbers(int num) {
        if (winningLottoNumbers.toList().stream()
                .anyMatch(number -> number == num)) {
            return 1;
        }
        return 0;
    }

    private boolean checkBonusNumber(Lotto userLotto) {
        return userLotto.toList().stream()
            .anyMatch(number -> number == bonusNumber.toInteger());
    }
}
