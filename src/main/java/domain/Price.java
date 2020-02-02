package domain;

public class Price {
	private final int price;

	public Price(String price) {
		if (price.isEmpty()) {
			throw new IllegalArgumentException("입력이 없습니다.");
		}
		this.price = Integer.parseInt(price);
	}

	public int toInteger() {
		return price;
	}
}
