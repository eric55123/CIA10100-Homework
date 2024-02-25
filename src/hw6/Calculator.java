package hw6;

public class Calculator {

	public int powerxy(int x, int y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義!");
		} else if (y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數!");
		}

		return (int) Math.pow(x, y);
	}

}
