package domain;

import java.util.HashMap;
import java.util.Map;

public class LottoResult {
	private Map<Rank, Integer> result = new HashMap<Rank, Integer>();

	public LottoResult() {
		for (Rank rank : Rank.values()) {
			result.put(rank, 0);
		}
	}

	public void putRank(Rank rank) {
		result.put(rank, result.get(rank) + 1);
	}

	public String toString(Rank rank) {
		return rank.toString() + result.get(rank) + "개";
	}

	public int getSum() {
		int sum = 0;

		sum += result.get(Rank.FIFTH) * Rank.FIFTH.getWinningMoney();
		sum += result.get(Rank.FIFTH) * Rank.FOURTH.getWinningMoney();
		sum += result.get(Rank.FIFTH) * Rank.THIRD.getWinningMoney();
		sum += result.get(Rank.FIFTH) * Rank.SECOND.getWinningMoney();
		sum += result.get(Rank.FIFTH) * Rank.FIRST.getWinningMoney();

		return sum;
	}
}
