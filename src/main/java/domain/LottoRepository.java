package domain;

import java.util.ArrayList;
import java.util.List;

public class LottoRepository {
	private final List<Lotto> lottos;

	public LottoRepository() {
		lottos = new ArrayList<Lotto>();
	}

	public void addLotto(Lotto lotto) {
		lottos.add(lotto);
	}

	public List<Lotto> getLottos() {
		return lottos;
	}
}
