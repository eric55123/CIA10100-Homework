package hw1;

import java.util.Scanner;
import java.util.Random;

public class hw3_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入討厭的數字");
		int x = sc.nextInt();

		// 原始功能：印出不包含不想要的數字的所有數字組合
		int total = 0;
		int num = 0;
		while (num < 50) {
			String number = String.valueOf(num);
			if (!number.contains(String.valueOf(x)) && (num >= 10 || num % 10 != 0)) {
				System.out.print("\t" + number);
				total++;
			}
			num++;
			if (num % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("Total =" + total);

		// 挑戰：輸入不想要的數字後，直接亂數印出6個號碼且不得重複
		if (x >= 1 && x <= 49) {
			System.out.println("進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複：");
			Random random = new Random();
			int[] rNums = new int[6];
			int count = 0;
			while (count < 6) {
				int rNum = random.nextInt(49) + 1;
				if (rNum % 10 != x && rNum / 10 != x && rNum != x && !contains(rNums, rNum)) {
					rNums[count] = rNum;
					count++;
				}
			}
			for (int rNum : rNums) {
				System.out.print(rNum + " ");
			}
			System.out.println();
		}
	}

	// 檢查陣列中是否包含指定的數字
	private static boolean contains(int[] array, int number) {
		for (int num : array) {
			if (num == number) {
				return true;
			}
		}
		return false;
	}
}
