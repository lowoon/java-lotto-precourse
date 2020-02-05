package domain;

import java.util.ArrayList;
import java.util.List;

public class LottoRepository {
    private List<Lotto> lottos;

    public LottoRepository() {
        this.lottos = new ArrayList<Lotto>();
    }

    public void addLotto(Lotto lotto) {
        if (isExistent(lotto)) {
            throw new IllegalArgumentException();
        }
        lottos.add(lotto);
    }

    private boolean isExistent(Lotto lotto) {
        return lottos.stream()
                .anyMatch(compare -> compare.equals(lotto));
    }

    public List<Lotto> toLottoList() {
        return lottos;
    }
}
