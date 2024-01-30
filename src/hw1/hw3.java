package hw1;
import java.util.Scanner;
public class hw3 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 使用者輸入三個數字
        System.out.print("請輸入第一個邊長：");
        double a = scanner.nextDouble();
        System.out.print("請輸入第二個邊長：");
        double b = scanner.nextDouble();
        System.out.print("請輸入第三個邊長：");
        double c = scanner.nextDouble();

        // 判斷三角形類型並輸出結果
        String result = triangleType(a, b, c);
        System.out.println("結果為：" + result);
    }

    public static String triangleType(double a, double b, double c) {
        // 檢查是否為三角形
        if (isValidTriangle(a, b, c)) {
            // 判斷是否為正三角形
            if (a == b && b == c) {
                return "正三角形";
            }
            // 判斷是否為等腰三角形
            else if (a == b || a == c || b == c) {
                return "等腰三角形";
            }
            // 判斷是否為直角三角形
            else if (isRightTriangle(a, b, c)) {
                return "直角三角形";
            }
            // 其他三角形
            else {
                return "其他三角形";
            }
        } else {
            return "不是三角形";
        }
    }

    public static boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static boolean isRightTriangle(double a, double b, double c) {
        // 判斷是否滿足直角三角形的勾股定理
        return a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a;
    }
}

