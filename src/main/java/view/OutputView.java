package view;

import java.util.List;

import domain.Lotto;
import domain.LottoResult;
import domain.Price;
import domain.Rank;

public class OutputView {
    public static void showBuyingResult(List<Lotto> lottos) {
        System.out.printf("\n%d개를 구매했습니다.\n", lottos.size());
        for (Lotto lotto : lottos) {
            System.out.println(lotto);
        }
    }

    public static void showWinningResult(LottoResult lottoResult) {
        System.out.println("\n당첨 통계");
        System.out.println("-------");
        System.out.println(lottoResult.toString(Rank.FIFTH));
        System.out.println(lottoResult.toString(Rank.FOURTH));
        System.out.println(lottoResult.toString(Rank.THIRD));
        System.out.println(lottoResult.toString(Rank.SECOND));
        System.out.println(lottoResult.toString(Rank.FIRST));
    }

    public static void showRatio(Price price, LottoResult lottoResult) {
        int ratio = (int)((lottoResult.getSum() - price.toInteger()) / price.toInteger()) * 100;
        System.out.printf("총 수익률은 %d%%입니다.\n", ratio);
    }
}
