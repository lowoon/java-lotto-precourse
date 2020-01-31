package view;

public class InputView {

	public static int inputPrice(String input) {
		if (input.isEmpty()) {
			throw new IllegalArgumentException("입력이 없습니다.");
		}
		int price = Integer.parseInt(input);

		return price;
	}
}
