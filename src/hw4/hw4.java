package hw4;

public class hw4 {
//	有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示:陣列,length屬性)

	public static void main(String[] args) {

		int[] numbers = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		int i = 0;
		for (int num : numbers) {
			i += num;
		}

		double average = i / numbers.length;
		System.out.println("平均值是:" + average);
		System.out.print("大於平均值的是:");
		for (int num : numbers) {
			if (num > average) {
				System.out.print(num + " ");
			}

		}
		System.out.println();
		System.out.println();

//		請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
//		(提示:String方法,陣列)

		String s = "Hello World";

		// 使用StringBuilder類別建立可變字串
		StringBuilder sb = new StringBuilder();
		// 使用StringBuilder類別中.append將原始字串s附加到StringBuilder後面
		sb.append(s);
		sb = sb.reverse();

		System.out.println("反轉後的數字是:" + sb);

//		有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		(提示:字元比對,String方法)

		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		int count = 0;

		for (String planet : planets) {
			for (int i1 = 0; i1 < planet.length(); i1++) {
				char a = planet.charAt(i1);
				if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
					count++;

				}
			}
		}
		System.out.println("字串中的母音為:" + count);

	}

}
