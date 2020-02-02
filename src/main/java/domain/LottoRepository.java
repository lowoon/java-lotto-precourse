package domain;

import java.util.ArrayList;
import java.util.List;

public class LottoRepository {
	private final List<Lotto> lottos;

	public LottoRepository() {
		this.lottos = new ArrayList<Lotto>();
	}

	public void addLotto(Lotto lotto) throws Exception {
		if (isExistent(lotto)) {
			throw new Exception();
		}
		lottos.add(lotto);
	}

	private boolean isExistent(Lotto lotto) {
		return lottos.stream()
			.anyMatch(compare -> compare.equals(lotto));
	}

	public List<Lotto> getLottos() {
		return lottos;
	}
}
