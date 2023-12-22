package method.q07;

public class SumNumber2 {
	public static void main(String[] args) {
		int num1 = 5;
		double num2 = 3.3; // 小数点を含む数値は double 型にする
		System.out.println("第一引数:" + num1);
		System.out.println("第二引数:" + num2);
		System.out.println("加算結果:" + calculastSum(num1, num2));
	}

	private static double calculastSum(int num1, double num2) { // メソッドの引数を int と double に合わせる

		return num1 + num2;

	}

}
