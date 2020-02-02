package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import view.InputView;
import view.OutputView;

public class Game {
	private static final int LOTTO_PRICE = 1000;

	private LottoRepository lottoRepository = new LottoRepository();
	private WinningLotto winningLotto;

	public void run() {
		makeLottos(InputView.inputPrice());
		OutputView.showBuyingResult(lottoRepository.getLottos());
		winningLotto = new WinningLotto(InputView.inputWinningLotto(), InputView.inputBonusNumber());
	}

	private void makeLottos(Price price) {
		int number = price.toInteger() / LOTTO_PRICE;

		for (int i = 0; i < number; i++) {
			addLottos();
		}
	}

	private void addLottos() {
		try {
			lottoRepository.addLotto(new Lotto(makeLotto()));
		} catch (Exception e) {
			addLottos();
		}
	}

	private List<Integer> makeLotto() {
		List<Integer> lotto = new ArrayList<Integer>();
		List<Integer> lottoNumber = makeLottoNumber();

		for (int i = 0; i < 6; i++) {
			lotto.add(lottoNumber.get(i));
		}

		return lotto;
	}

	private List<Integer> makeLottoNumber() {
		List<Integer> lottoNumber = new ArrayList<Integer>();

		for (int i = 1; i < 46; i++) {
			lottoNumber.add(i);
		}
		Collections.shuffle(lottoNumber);

		return lottoNumber;
	}
}
