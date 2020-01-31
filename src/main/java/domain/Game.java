package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import view.InputView;
import view.OutputView;

public class Game {
	private static final int LOTTO_PRICE = 1000;

	private Scanner scanner = new Scanner(System.in);
	private LottoRepository lottoRepository = new LottoRepository();

	public void run() {
		makeLottos(getPrice());
		OutputView.showBuyingResult(lottoRepository.getLottos());
	}

	private int getPrice() {
		int price = 0;

		try {
			price = InputView.inputPrice(scanner.nextLine().trim());
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
			getPrice();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			getPrice();
		}

		return price;
	}

	private void makeLottos(int price) {
		int number = price / LOTTO_PRICE;

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
		List<Integer> lottoNumber = getLottoNumber();

		for (int i = 0; i < 6; i++) {
			lotto.add(lottoNumber.get(i));
		}

		return lotto;
	}

	private List<Integer> getLottoNumber() {
		List<Integer> lottoNumber = new ArrayList<Integer>();

		for (int i = 1; i < 46; i++) {
			lottoNumber.add(i);
		}
		Collections.shuffle(lottoNumber);

		return lottoNumber;
	}
}
