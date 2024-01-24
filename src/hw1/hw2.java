package hw1;

public class hw2 {

	public static void main(String[] args) {

		// 1.請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int a = 0;
		for (int b = 2; a < 1000; a += 2) {
			b += a;
			System.out.println(b);
		}

		// 2.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int c = 1;
		for (int d = 1; d <= 10; d++) {

			c *= d;
			System.out.println(c);
		}

		// 3.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int e = 1;
		int f = 1;
		while (e <= 10) {
			f *= e;
			e++;
			System.out.println(f);
		}

		// 4.請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100
		for (int g = 1; g <= 10; g++) {
			int num1 = g * g;
			System.out.print(num1 + " ");
		}
//		// 5.阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//		輸出結果為阿文可以選擇的數字有哪些?總共有幾個?

		int num2 = 1;
		int num3 = 0;
		for (num2 = 1; num2 <= 49; num2++) {

			if (num2 % 10 == 4);
			else {
				num3++;
				System.out.println("可選擇的數字是" + num2 + "總共有" + num3 + " 個");
			}

		}
		// 6.
		for (int i = 10; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// 7.
		char letter = 'A';

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(letter);
			}
			letter++;
			System.out.println();
		}
	}
}
