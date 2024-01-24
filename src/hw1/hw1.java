package hw1;

public class hw1 {

	public static void main(String[] args) {

		// 1.
		int num1 = 12, num2 = 6;

		int num3 = num1 + num2;

		int num4 = num1 * num2;

		System.out.println(num3);
		System.out.println(num4);
		
		//2.
		int eggs = 200, dozen =12;
		
		System.out.println(eggs/dozen);
		
		//3.
		
		int total_seconds = 256559;
		
		int second = total_seconds%60;
		int minutes = total_seconds/60%60;		
		int day = total_seconds / (24 * 60 * 60);
		int hours = total_seconds /60/60%24;

		System.out.println(day+"天"+hours+"小時"+minutes+"分"+second+"秒");
		
		//4.
		
		final double pi = 3.1415;
		int radius = 5;
		double circle_area =radius*radius*pi;
		double circumference = radius*2*pi;
		System.out.println(circle_area+"=圓面積"+circumference+"=圓周長");
		
		//5.
		int years = 1;
		double interestRate = 0.02;		
		for (int principal = 1500000;years < 10; years++) {
			double xx = principal*interestRate;
			
			principal+=xx;
				
		
			System.out.println(principal);			
		
		}
		
		//6.
		
		System.out.println("5 + 5");
		System.out.println("5 + '5'");
		System.out.println("5 + \"5\"");
		
		
	}
	
}
