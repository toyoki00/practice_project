package basic.q07;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		timesTable();
	}

	private static void timesTable() {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int result = i * j;
				System.out.printf("%4d", result);
			}
			System.out.println();
		}

	}

}
