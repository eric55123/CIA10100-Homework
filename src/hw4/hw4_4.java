package hw4;

public class hw4_4 {

	public static void main(String[] args) {
		int[][] scores = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		int[] lineOfRanks = new int[scores[0].length];

		for (int[] examScores : scores) {
			int maxScore = Integer.MIN_VALUE;
			int maxIndex = -1;

			for (int i = 0; i < examScores.length; i++) {
				if (examScores[i] > maxScore) {
					maxScore = examScores[i];
					maxIndex = i;
				}
			}

			if (maxIndex != -1) {
				lineOfRanks[maxIndex]++;
			}
		}

		System.out.println("每位同學考最高分的次數:");
		for (int i = 0; i < lineOfRanks.length; i++) {
			System.out.println("學生 " + (i + 1) + ": " + lineOfRanks[i] + " 次");
		}
	}

}
