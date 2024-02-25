package hw5;

import java.util.Random;
import java.util.Scanner;

public class hw5 {
	public static void main(String[] args) {
		randAvg();
//		請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,
//		即會印出對應的*長方形,
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入長方形的寬:");
		int width = sc.nextInt();
		System.out.println("請輸入長方形的高:");
		int height = sc.nextInt();

		starSquare(width, height);
	}

	public static void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int a = 0; a < width; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
//	請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值

	public static void randAvg() {
		Random rand = new Random();
		int[] randNumbers = new int[10];
		int sum = 0;

		System.out.print("本次亂數結果:");
		for (int i = 0; i < randNumbers.length; i++) {
			randNumbers[i] = rand.nextInt(101);
			System.out.print(randNumbers[i] + " ");
			sum += randNumbers[i];
		}

		double average = (double) sum / randNumbers.length;

		System.out.println("\n平均值：" + average);
	}

}
