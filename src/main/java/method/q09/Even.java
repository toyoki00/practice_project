package method.q09;

public class Even {
	public static void main(String[] args) {

		int num = 5;
		String result = null;
		if (checkEven(num)) {
			result = "偶数";
		} else {
			result = "奇数";
		}

		System.out.print(num + "は" + result + "です。");

	}

	private static boolean checkEven(int num) {

		boolean answer;

		if (num % 2 == 0) {
			answer = true;
		} else {
			answer = false;
		}

		return answer;
	}

}
