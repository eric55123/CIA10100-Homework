package hw5;

import java.util.Random;

public class hw5_4 {
	public static void main(String[] args) {
		System.out.println("生成的驗證碼: " + genAuthCode());
	}

	public static String genAuthCode() {

		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		Random random = new Random();
		StringBuilder authCode = new StringBuilder();

		for (int i = 0; i < 8; i++) {
			
			authCode.append(characters.charAt(random.nextInt(characters.length())));
		}

		return authCode.toString();
	}

}
