package Lec49;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] dp = new int[matrix.length][matrix[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -1000000);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < matrix[0].length; i++) {

			ans = Math.min(ans, Minimum_Falling_Path(matrix, i, 0, dp));
		}
		System.out.println(ans);

	}

	public static int Minimum_Falling_Path(int[][] matrix, int cc, int cr, int[][] dp) {
		if (cc < 0 || cc >= matrix[0].length) {
			return Integer.MAX_VALUE;
		}

		if (cr == matrix.length - 1) {
			return matrix[cr][cc];
		}
		if (dp[cr][cc] != -1000000) {
			return dp[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < matrix[0].length; i++) {
			if (i != cc) {
				ans = Math.min(ans, Minimum_Falling_Path(matrix, i, cr + 1, dp));
			}

		}

		ans = ans + matrix[cr][cc];
		dp[cr][cc] = ans;
		return ans;

	}

}
