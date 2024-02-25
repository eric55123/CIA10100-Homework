package hw4;

import java.util.Scanner;

public class hw4_3 {

	public static void main(String[] args) {

//		請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//		(提示1:Scanner,陣列)
//		(提示2:需將閏年條件加入)
//		(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入西元年");
		int year = sc.nextInt();
		System.out.println("請輸入月");
		int month = sc.nextInt();
		System.out.println("請輸入日");
		int day = sc.nextInt();

		if (month < 1 || month > 12 || day < 1 || day > daysInMonth(year, month)) {
			System.out.println("輸入的日期不正確");
			return;
		}

		int dayOfYear = whatday(year, month, day);
		System.out.println("輸入的日期是該年的第 " + dayOfYear + " 天");

		sc.close();

	}

//      判斷是否閏年
	public static boolean leapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

//      計算月份的天數
	public static int daysInMonth(int year, int month) {
		if (month == 2) {
			return leapYear(year) ? 29 : 28;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		} else {
			return 31;
		}
	}

//      計算是該年的第幾天
	public static int whatday(int year, int month, int day) {
		int dayOfYear = day;
		for (int i = 1; i < month; i++) {
			dayOfYear += daysInMonth(year, i);
		}
		return dayOfYear;

	}

}
