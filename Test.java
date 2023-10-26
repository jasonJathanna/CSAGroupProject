public class Test {

	public static void main(String[] args) {
		System.out.println(greatestCommonFactorOf(9, 12));
	}

	public static int greatestCommonFactorOf(int num1, int num2) {
		int gcf = 0;
		for (int i = 1; i <= smallestNumOf(num1, num2); i++) {
			if (isCommonFactor(num1, num2, i) == true) {
				gcf = i;
			}
		}

		return gcf;
	}

	public static boolean isCommonFactor(int num1, int num2, int factor) {

		if (num1 % factor == 0 && num2 % factor == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static int smallestNumOf(int num1, int num2) {
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}

}
