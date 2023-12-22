package practice_project;

import java.util.Random;

public class waa {
    public static void main(String[] args) {
        Random random = new Random();
        int selectedNumber = random.nextInt(10) + 1; // 1から10のランダムな数字を選択

        System.out.println("真実はいつも" + selectedNumber + "つ！！！！");

        if (selectedNumber == 1) {
            System.out.println("無事に事件が解決した。");
        } else {
            System.out.println("わからないので服部に電話をかけた。");
        }
    }
}
