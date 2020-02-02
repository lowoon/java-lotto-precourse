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

	public double getSum() {
		int sum = 0;

		sum += result.get(Rank.FIFTH) * Rank.FIFTH.getWinningMoney();
		sum += result.get(Rank.FOURTH) * Rank.FOURTH.getWinningMoney();
		sum += result.get(Rank.THIRD) * Rank.THIRD.getWinningMoney();
		sum += result.get(Rank.SECOND) * Rank.SECOND.getWinningMoney();
		sum += result.get(Rank.FIRST) * Rank.FIRST.getWinningMoney();

		return sum;
	}
}
