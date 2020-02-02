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
        // TODO 로직 구현
        return null;
    }
}
