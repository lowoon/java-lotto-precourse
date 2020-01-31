package view;

import java.util.List;

import domain.Lotto;

public class OutputView {
	public static void showBuyingResult(List<Lotto> lottos) {
		System.out.printf("%d개를 구매했습니다.\n", lottos.size());
		for (Lotto lotto : lottos) {
			System.out.println(lotto);
		}
	}
}
