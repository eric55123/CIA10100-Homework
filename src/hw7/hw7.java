package hw7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料

public class hw7 {
	public static void main(String[] args) {
		String fileName = "C:\\Users\\TMP214_\\Desktop\\Sample.txt";

		int bytes = 0, chars = 0, lines = 0;

		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				bytes += line.getBytes().length;
				chars += line.length();
				lines++;
			}
		} catch (IOException e) {
			System.err.println("Error reading the file: " + e.getMessage());
		}

		System.out.println(fileName + "檔案共有" + bytes + "個位元組," + chars + "個字元," + lines + "列資料");
	}
}
