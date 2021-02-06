package DynamicPrograming;

import java.util.Scanner;

public class NewmanShanksWilliamsPrime {
	
	static int nswp(int n) {
		int[] dp = new int[n + 1];
		dp[0] = dp[1] = 1;
		for(int i = 2; i < n + 1; i++) {
			dp[i] = 2*dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(nswp(n));
	}

}
