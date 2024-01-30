package hw1;

import java.util.Scanner;
import java.util.Random;

public class hw3_2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Random r = new Random();

		int maxNumber = 100;
		int randomNumber = r.nextInt(maxNumber + 1);
		int guess;

		System.out.println("歡迎來到猜數字遊戲!請猜(0到" + maxNumber + ")");

		while (true) {
			guess = s.nextInt();

			if (guess == randomNumber) {
				System.out.println("恭喜答對了");
				break;
			} else {
				System.out.println("猜錯了請在猜一次");
				if (guess < randomNumber) {
					System.out.println("提示:猜的數字太小了");
				} else {
					System.out.println("提示:猜的數字太大了");
				}
			}
		}
		s.close();
	}

}
